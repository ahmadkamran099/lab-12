package lab_12;

public class Person {
    protected String name;
    protected String id;
    public Person(String name,String id){
        this.name=name;
        this.id=id;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
