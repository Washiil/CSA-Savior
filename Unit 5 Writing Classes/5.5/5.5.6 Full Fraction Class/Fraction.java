public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    
    public Fraction(int numer, int denom)
    {
        numerator = numer;
        denominator = denom;
    }
    
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int x) {
        this.numerator = x;
    }
    
    
    public void setDenominator(int x) {
        this.denominator = x;
    }
    
    public void add(Fraction other) {
        this.numerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
    }
    
    public void subtract(Fraction other) {
        this.numerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;
        this.denominator *= other.getDenominator();
    }
    
    public void multiply(Fraction other) {
        this.numerator = other.getNumerator() * this.numerator;
        this.denominator = other.getDenominator() * this.denominator;
    }
    
    public String toString() {
        return numerator + " / " + denominator;
    }
}