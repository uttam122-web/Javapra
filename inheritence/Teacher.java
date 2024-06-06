package inheritence;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }

    public boolean isSenior() {
        return getAge() >= 40;
    }

	private int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
}
