public class Student {

    String name;
    int age;

    Student() {
        name = "Аты жоқ";
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Ернар", 21);

        student1.showInfo();
        student2.showInfo();
    }
}