import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestFracao {

    Fracao fracao;

    @Before
    public void setup(){
        fracao = new Fracao(1,2);
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
    public void test_valor_soma(){
        assertEquals("5/6", fracao.soma(new Fracao(1,2), new Fracao(1,3));
    }

    @Test
    public void test_valor_diff(){
        assertEquals(0.5, fracao.valorReal(), 0.1);
    }


    @Test
    public void test_valor_div(){
        assertEquals(0.5, fracao.valorReal(), 0.1);
    }


    @Test
    public void test_valor_mult(){
        assertEquals(0.5, fracao.valorReal(), 0.1);
    }

}
