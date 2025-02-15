import java.util.ArrayList;
import java.util.List;

// Abstract class Person
abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

// Derived class for Student
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class for Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Student Information System
public class StudentInformationSystem {
    private List<Person> people;

    public StudentInformationSystem() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void displayPeople() {
        for (Person person : people) {
            person.displayDetails();
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        StudentInformationSystem system = new StudentInformationSystem();

        // Adding students and teachers
        system.addPerson(new Student("Alice", 20, 101));
        system.addPerson(new Teacher("Mr. Smith", 45, "Mathematics"));

        // Displaying people
        System.out.println("Student Information System:");
        system.displayPeople();
    }
}
