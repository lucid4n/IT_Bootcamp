package Nedelja5.Vikend;

public class Complex {
    private double real;
    private double imag;

    public Complex(){}
    public Complex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }
    public Complex add(Complex t){
        return new Complex(this.getReal()+t.getReal(),this.getImag()+t.getImag());
    }
    public Complex subtract(Complex t){
        return new Complex(this.getReal()-t.getReal(),this.getImag()-t.getImag());
    }
    public Complex multiply(Complex t){
        return new Complex(this.getReal()*t.getReal()-this.getImag()*t.getImag(),this.getReal()*t.getImag()+this.getImag()*t.getReal());
    }
    public Complex divide(Complex t){
        double realTemp = (this.real*t.getReal()+this.imag*t.getImag())/(t.getReal()*t.getReal()+t.getImag()*t.getImag());
        double imagTemp = (this.imag*t.getReal()-this.real*t.getImag())/(t.getReal()*t.getReal()+t.getImag()*t.getImag());
        return new Complex(realTemp,imagTemp);
    }

    @Override
    public String toString(){

        return (this.real+"").repeat((int)Math.abs(Math.signum(this.real)))
                + "+".repeat((((int)Math.signum(this.imag) +1)>>1) & (int)Math.abs(Math.signum(this.real)))
                + (this.imag + "i").repeat((int)Math.abs(Math.signum(this.imag)));
    }
}

