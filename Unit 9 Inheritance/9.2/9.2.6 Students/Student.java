class Student {
    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    public String toString() {
        return name + " (" + id + ")";
    }
}