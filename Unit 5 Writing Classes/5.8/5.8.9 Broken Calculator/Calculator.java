public class Calculator {

    private int total;
    private int value; // Value is the number stored in memory

    public Calculator(int startingValue){
        this.total = startingValue;
        this.value = 0;
    }

    public int add(int newVal){
        this.total = this.total + newVal;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        this.total += this.value;
        return total;
    }

    public int multiple(int newVal){
        this.total *= newVal;
        return total;
    }

    public void setValue(int newVal){
        this.value = newVal;
    }

    public int getValue(){
        return value;
    }

}