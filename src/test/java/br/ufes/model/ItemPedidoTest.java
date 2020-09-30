package br.ufes.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemPedidoTest {

    public ItemPedidoTest() {
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
    public void CT04() {
        Produto caneta = new Produto("Caneta", 1.00, 100);
        ItemPedido itemPedido = new ItemPedido(caneta, 5);

        assertEquals(5.00, itemPedido.getValorItem(), 0.01);
    }

}
