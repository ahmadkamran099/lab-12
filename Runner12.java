package lab_12;

public class Runner12 {
    public static void main(String[] args) {
        Teacher t = new Teacher("AHMAD", "123", "CS", "HOD");
        Teacher t1 = new Teacher("AHMAD", "123", "CS", "HOD");
        Person p = new Person("MOHSIN", "123");
        HumanResource HR = new HumanResource();
        HR.add(t);
        HR.add(t1);
        HR.delete(t);
        System.out.println(t1);

    }
}
