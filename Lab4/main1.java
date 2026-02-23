public class Student {

    String name;
    int age;
    String major;

    void showInfo() {
        System.out.println("Аты: " + name +
                ", Жасы: " + age +
                ", Мамандығы: " + major);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Ернар";
        student1.age = 21;
        student1.major = "IT";

        Student student2 = new Student();
        student2.name = "Айдана";
        student2.age = 19;
        student2.major = "Медицина";

        student1.showInfo();
        student2.showInfo();
    }
}