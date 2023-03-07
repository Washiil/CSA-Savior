class StudentAthlete extends Student {
    String sport;
    String level;

    public StudentAthlete(String name, int id, double gpa, String sport, String level) {
        super(name, id, gpa);
        this.sport = sport;
        this.level = level;
    }

    public String getSport() {
        return sport;
    }

    public String getLevel() {
        return level;
    }

    public String toString() {
        return super.getName() + " (" + super.getID() + ")" + " plays " + this.getSport();
    }
}