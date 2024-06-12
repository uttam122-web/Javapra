public class CatchExercise {
    public static void main(String[] args) {
        try {
            // Inside the try block, declare an array and initialize it
            int[] a = new int[5];
            a[5] = 30 / 5; // This will not cause any exception

            // Attempting to access an element beyond the array size
            System.out.println("Array element at index 6: " + a[6]);
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        }
    }
}
