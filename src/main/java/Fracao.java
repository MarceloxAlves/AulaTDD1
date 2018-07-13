
public class Fracao {

    private int numerador;
    private int denomidador;

    public Fracao(int numerador, int denomidador){
        if(denomidador == 0) throw new IllegalArgumentException("Divisao  por 0");

        this.numerador = numerador;
        this.denomidador = denomidador;
    }

    @Override
    public String toString() {
        return String.valueOf(this.numerador + "/" + this.denomidador);
    }

    public double valorReal(){
        return (double) this.numerador / this.denomidador;
    }

    public  Fracao soma(Fracao fracao1, Fracao fracao2){
        return  new Fracao(1,2);
    }

    public  Fracao mult(Fracao fracao1, Fracao fracao2){
        return  new Fracao(1,2);
    }

    public  Fracao div(Fracao fracao1, Fracao fracao2){
        return  new Fracao(1,2);
    }

    public  Fracao diff(Fracao fracao1, Fracao fracao2){
        return  new Fracao(1,2);
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenomidador() {
        return denomidador;
    }

    public void setDenomidador(int denomidador) {
        this.denomidador = denomidador;
    }
}

