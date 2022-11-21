public class Fraction
{
    private int numerator;
    private int denominator;
    private FractionMath calc = new FractionMath();

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

	/**
	* Returns value of numerator
	* @return numerator
	*/
	public int getNumerator() {
	    return this.numerator;
	}

	/**
	* Sets new value of numerator
	* @param numerator new numerator value
	*/
	public void setNumerator(int numerator) {
	    this.numerator = numerator;
	}

	/**
	* Returns value of denominator
	* @return denominator
	*/
	public int getDenominator() {
		return this.denominator;
	}

	/**
	* Sets new value of denominator
	* @param denominator new denominator
	*/
	public void setDenominator(int denominator) {
	    this.denominator = denominator;
	}

    /**
	* Updates this fraction by adding another fraction
	* @param other Fraction to add to existing fraction
	*/

    //Calculate by using the FractionMath class, then update
    //the numerator and denominator from the returned Fraction
    public void addFraction(Fraction other){
        Fraction result = this.calc.add(this, other);
        this.numerator = result.getNumerator();
        this.denominator = result.getDenominator();
    }

    /**
	* Updates this fraction by multiplying another fraction
	* @param other Fraction to multiple to existing fraction
	*/

    //Calculate by using the FractionMath class, then update
    //the numerator and denominator from the returned Fraction
    public void multiplyFraction(Fraction other){
        Fraction result = this.calc.multiply(this, other);
        this.numerator = result.getNumerator();
        this.denominator = result.getDenominator();
    }

    /**
	* Prints fraction as numerator / denominator
	* Example: 1 / 2
	*/

    public String toString(){
        return this.numerator + " / " + this.denominator;
    }
}