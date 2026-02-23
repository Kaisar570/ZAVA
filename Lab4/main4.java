public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Студент: " + name);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ернар");
        Student student2 = new Student("Айдана");
        Student student3 = new Student("Нұржан");

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
    }
}