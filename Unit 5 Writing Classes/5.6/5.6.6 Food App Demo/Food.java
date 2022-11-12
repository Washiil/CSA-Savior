public class Food
{
        //Declare instance variables
        private String name;
        private int calories;
        
        //Create Food Constructor
        
        public Food(String foodName, int cal)
        {
            this.name = foodName;
            this.calories = cal;
        }
        
        
        //Add getter and setter methods for calories
        
        public int getCalories()
        {
            return this.calories;
        }
        
        public void setCalories(int val)
        {
            this.calories = val;
        }
        
        //Add getter and setter methods for name
        
        public String getName()
        {
            return this.name;
        }
        
        public void setName(String val)
        {
            this.name = val;
        }
        
        //Add toString method
        
        public String toString()
        {
            return this.name + " have " + this.calories + " calories.";
        }
    
}