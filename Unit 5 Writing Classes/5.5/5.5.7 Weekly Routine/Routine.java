public class Routine
{
    double school;
    double sleep;
    double friends;
    double hobbies;
    
    public double getSchool() {
        return school;
    }
    
    public double getSleep() {
        return sleep;
    }
    
    public double getFriends() {
        return friends;
    }
    
    public double getHobbies() {
        return hobbies;
    }
    
    public void setSchool(double val) {
        school = val;
    }
    
    public void setSleep(double val) {
        sleep = val;
    }
    
    public void setFriends(double val) {
        friends = val;
    }
    
    public void setHobbies(double val) {
        hobbies = val;
    }
    
    public void printTotal() {
        double total = 7 * (this.school + this.sleep + this.friends + this.hobbies);
        
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + this.school * 7);
        System.out.println("Sleeping: " + this.sleep * 7);
        System.out.println("With Friends: " + this.friends * 7);
        System.out.println("Doing fun stuff: " + this.hobbies * 7);
        System.out.println("You're busy " + total + " hours a week!");
    }
}