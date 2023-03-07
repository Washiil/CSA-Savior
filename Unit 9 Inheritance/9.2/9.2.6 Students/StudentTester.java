class StudentTester {
    public static void main(String[] args) {
        Student student1 = new Student("Jane Doe", 123456, 3.5);
        StudentAthlete student2 = new StudentAthlete("John Smith", 654321, 3.0, "Basketball", "Varsity");

        System.out.println(student1);
        System.out.println(student2);
    }
}