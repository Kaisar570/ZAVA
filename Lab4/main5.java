public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void changeName(String newName) {
        this.name = newName;
    }

    void showInfo() {
        System.out.println("Студент: " + name);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ернар");
        Student student2 = new Student("Айдана");

        student1.showInfo();
        student2.showInfo();

        student1.changeName("Али");

        System.out.println("Өзгерістен кейін:");
        student1.showInfo();
        student2.showInfo();
    }
}