package br.ufes.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    public ProdutoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void CT01() {
        Produto produto = new Produto("Caneta", 1.00, 100);

        produto.setValorUnitario(1.25);

        assertEquals(1.00, produto.getValorUltimaCompra(), 0.01);
    }

    @Test
    public void CT02() {
        Produto produto = new Produto("Caneta", 1.00, 100);

        assertEquals(true, produto.estoqueDisponivel(100));
    }

    @Test
    public void CT03() {
        Produto produto = new Produto("Caneta", 1.00, 100);

        assertEquals(false, produto.estoqueDisponivel(101));
    }

}
