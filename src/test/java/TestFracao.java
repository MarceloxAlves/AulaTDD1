import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestFracao {

    Fracao fracao;
    Fracao fracao2;

    @Before
    public void setup(){
        fracao = new Fracao(1,2);
        fracao2 = new Fracao(3,5);
    }

    @Test
    public void test_iniciar_fracao(){
        assertEquals("1/2", fracao.toString());
    }

    @Test
    public void test_valor_real(){
        assertEquals(0.5, fracao.valorReal(), 0.1);
    }

    @Test
    public void test_valor_real(){
        assertEquals(3,10, fracao.mult(fracao, fracao2), 0.1);
    }

}
