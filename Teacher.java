package lab_12;

public class Teacher extends Person implements Association {
    protected String designation;
    protected String department;

    public Teacher(String name, String id,String department,String designation) {
        super(name, id);
        this.department=department;
        this.designation=designation;

    }



    @Override
    public void association() {
        System.out.println("this is association method of teacher class");
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
