public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Аты: " + name + ", Жасы: " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ернар", 21);
        Student student2 = new Student("Айдана", 19);

        student1.showInfo();
        student2.showInfo();
    }
}