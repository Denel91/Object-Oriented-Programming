package Data_Structures;

import java.util.List;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person(45, "Bill");
        List<Person> list = List.of(p);
        //list.add(new Person(22, "Bob"));//UnsupportedOperationException
        System.out.println(list);
        p.setName("Gulp");
        System.out.println(list);
    }
}
