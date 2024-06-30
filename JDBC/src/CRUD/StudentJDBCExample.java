package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJDBCExample {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "Uttam3012";

    public static void main(String[] args) {
        // Inserting records
        insertStudent(1, "manasvi", "Science");
        insertStudent(2, "aryan", "Arts");
        insertStudent(3, "jay", "Commerce");
        
        // Updating a record
        updateStudent(4, "manav", "History");
        
        // Deleting a record
        deleteStudent(3);
        
        // Reading records after update and delete
        System.out.println("\nStudents after update and delete:");
        readStudents();
    }

    // Insert a student record
    public static void insertStudent(int enrollnumber, String name, String stream) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            String sql = "INSERT INTO student (enrollnumber, name, stream) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, enrollnumber);
            pstmt.setString(2, name);
            pstmt.setString(3, stream);
            
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Student with enrollnumber " + enrollnumber + " inserted.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Read all students
    public static void readStudents() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            stmt = conn.createStatement();
            String sql = "SELECT enrollnumber, name, stream FROM student";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int enrollnumber = rs.getInt("enrollnumber");
                String name = rs.getString("name");
                String stream = rs.getString("stream");
                System.out.println("Enroll Number: " + enrollnumber + ", Name: " + name + ", Stream: " + stream);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Update a student record
    public static void updateStudent(int enrollnumber, String name, String stream) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            String sql = "UPDATE student SET name = ?, stream = ? WHERE enrollnumber = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, stream);
            pstmt.setInt(3, enrollnumber);
            
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student with enrollnumber " + enrollnumber + " updated.");
            } else {
                System.out.println("No such student found with enrollnumber " + enrollnumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Delete a student record
    public static void deleteStudent(int enrollnumber) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            String sql = "DELETE FROM student WHERE enrollnumber = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, enrollnumber);
            
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student with enrollnumber " + enrollnumber + " deleted.");
            } else {
                System.out.println("No such student found with enrollnumber " + enrollnumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
