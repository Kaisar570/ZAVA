public class Student {

    Student() {
        System.out.println("Объект құрылды");
    }

    void study() {
        System.out.println("Студент оқып жатыр");
    }

    public static void main(String[] args) {

        Student s1 = new Student();  // Құрылу
        s1.study();                 // Қолдану

        System.out.println("Бағдарлама аяқталды");
    }
}