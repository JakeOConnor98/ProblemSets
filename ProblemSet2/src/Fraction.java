public class Fraction {

    private int numerator;
    private int denominator;

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Fraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction(){
        this(1,0);
    }

    public Fraction addition(Fraction fract1){
        Fraction answer = new Fraction((getNumerator() * fract1.getDenominator()) + (getDenominator() * fract1.getNumerator()),
                getDenominator() * fract1.getDenominator());
        return answer;
    }

    public Fraction subtraction(Fraction fract1){
        Fraction answer = new Fraction((getNumerator() * fract1.getDenominator()) - (getDenominator() * fract1.getNumerator()),
                getDenominator() * fract1.getDenominator());
        return answer;
    }

    public Fraction multiplication(Fraction fract1){
        Fraction answer = new Fraction((getNumerator() * fract1.getNumerator()), getDenominator() * fract1.getDenominator());
        return answer;
    }

    public Fraction division(Fraction fract1){
        Fraction answer = new Fraction((getNumerator() * fract1.getDenominator()),getDenominator() * fract1.getNumerator());
        return answer;
    }

    public String toString(){
        return "The numbers you entered in fractional form are: " + getNumerator() +
                "/" + getDenominator();
    }

}
