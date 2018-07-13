
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

    public  Fracao soma(Fracao fracao){
        int mmc = MyMath.mmc(this.getDenomidador(),fracao.getDenomidador());
        return  new Fracao((mmc / this.getDenomidador() * this.getNumerador()) +
                (mmc / fracao.getDenomidador() * fracao.getNumerador()), mmc);
    }

    public  Fracao mult(Fracao fracao){
        return  new Fracao(this.getNumerador() * fracao.getNumerador(),this.getDenomidador() * fracao.getDenomidador());
    }

    public  Fracao div(Fracao fracao){
        return  new Fracao(this.getNumerador() * fracao.getDenomidador(),this.getDenomidador() * fracao.getNumerador());
    }

    public  Fracao diff(Fracao fracao){
        int mmc = MyMath.mmc(this.getDenomidador(),fracao.getDenomidador());
        return  new Fracao((mmc / this.getDenomidador() * this.getNumerador()) -
                        (mmc / fracao.getDenomidador() * fracao.getNumerador()),mmc);
    }

    public Fracao reduzida(){
        int num = 0;
        int den = 0;
        for (int i = 2; i <= MyMath.maior(this.numerador, this.denomidador); i++) {
            if (this.getNumerador() % i == 0 && this.getDenomidador() % i == 0) {
                num = this.getNumerador() / i;
                den = this.getDenomidador() / i;
            }
        }
        return new Fracao(num,den);
    }
    public boolean aparente(){
        return (this.numerador > this.denomidador && this.numerador % this.denomidador == 0);
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

