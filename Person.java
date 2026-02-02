class Person {
    String name;
    int age;

    Person() {
        age = 18;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ravi", 25);
        p.display();
    }
}
