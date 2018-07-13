
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
        return  new Fracao(fracao1.getNumerador() * fracao2.getNumerador(),fracao1.getDenomidador() * fracao2.getDenomidador());
    }

    public  Fracao div(Fracao fracao1, Fracao fracao2){
        return  new Fracao(fracao1.getNumerador() * fracao2.getDenomidador(),fracao1.getDenomidador() * fracao2.getNumerador());
    }

    public  Fracao diff(Fracao fracao1, Fracao fracao2){
        int mmc = mmc(fracao1.getDenomidador(),fracao2.getDenomidador());

        return  new Fracao((mmc / fracao1.getDenomidador() * fracao1.getNumerador()) +
                        (mmc / fracao2.getDenomidador() * fracao2.getNumerador()),mmc);
    }

    public int maior(Fracao fracao){
        if(fracao.getNumerador() > fracao.getDenomidador())
            return fracao.getNumerador();
        else
            return fracao.getDenomidador();
    }

    public Fracao reduzida(Fracao fracao){
        int num;
        int den;
        for (int i = 2; i <= maior(fracao); i++) {
            if (fracao.getNumerador() % i == 0 && fracao.getDenomidador() % i == 0) {
                num = fracao.getNumerador() / i;
                den = fracao.getDenomidador() / i;
            }
        }
        return new Fracao(num,den);
    }
    public boolean aparente(){
        return (this.numerador > this.denomidador && this.numerador % this.denomidador == 0);
    }

    public int mmc(int num1, int num2) {

        int mmc;

        for (int i = 2; i <= num2; i++) {
            int aux = num1 * i;
            if ((aux % num2) == 0) {
                mmc = aux;
                i = num2 + 1;
            }
        }
        return mmc;
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

