public class Ball
{
   private double diameter;
   
   public Ball(double diameter){
       this.diameter = diameter;
   }
   
    public double getDiameter(){
       return diameter;
   }
   
   // Write an equals method here that returns true if
   // the diameters are the same.
   public boolean equals(Ball other) {
       if(this.diameter == other.getDiameter()) return true;
       return false;
   }
   
   
   // Write a toString statement here, in this format:
   // Diameter: 2.75
   @Override
   public String toString() {
       return "Diameter: " + diameter;
   }
   
}