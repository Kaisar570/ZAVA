package student;

public class Student {

    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Студент: " + name);
    }
}