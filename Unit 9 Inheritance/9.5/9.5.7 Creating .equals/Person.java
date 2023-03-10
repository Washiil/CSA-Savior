public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getName(){
        return name;
    }

    //Create a equals method here
    public boolean equals(Person p2) {
        if(!this.name.equals(p2.getName())) return false;
        if(!this.birthday.equals(p2.getBirthday())) return false;
        return true;
    }
}