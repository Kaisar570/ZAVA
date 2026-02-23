class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class University {

    void enroll(Student student) {
        System.out.println(student.name + " университетке қабылданды.");
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ернар");
        University u1 = new University();

        u1.enroll(s1);
    }
}