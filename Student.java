package lab_12;

public class Student extends Person implements Association{
    private int rollNo;
    private int semester;
    public Student(String name, String id,int rollNo,int semester) {
        super(name, id);
        this.rollNo=rollNo;
        this.semester=semester;

    }

    @Override
    public void association() {
        System.out.println("this is association method of Student  class");
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", semester=" + semester +
                '}';
    }
}
