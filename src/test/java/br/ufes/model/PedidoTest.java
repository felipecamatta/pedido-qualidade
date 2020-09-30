package br.ufes.model;

import java.time.LocalDate;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class PedidoTest {

    public PedidoTest() {
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

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void CT05() {
        Cliente joao = new Cliente("João", "111");
        Produto caneta = new Produto("Caneta", 1.00, 100);
        Pedido pedido = new Pedido(joao, caneta, 5, LocalDate.now());

        ItemPedido itemPedido = new ItemPedido(caneta, 5);

        assertNotEquals(Collections.EMPTY_LIST, pedido.getItens());
    }

    @Test
    public void CT06() {
        Cliente joao = new Cliente("João", "111");
        Produto caneta = new Produto("Caneta", 1.00, 100);
        Pedido pedido = new Pedido(joao, caneta, 5, LocalDate.now());

        pedido.removerItem("Caneta");

        assertEquals(Collections.EMPTY_LIST, pedido.getItens());
    }

    @Test
    public void CT07() {
        Cliente joao = new Cliente("João", "111");
        Produto caneta = new Produto("Caneta", 1.00, 100);
        Pedido pedido = new Pedido(joao, caneta, 5, LocalDate.now());

        assertEquals(4.75, pedido.getValorAPagar(), 0.01);
    }

    @Test
    public void CT08() {
        Cliente joao = new Cliente("João", "111");
        Produto caneta = new Produto("Caneta", 1.00, 100);
        Pedido pedido = new Pedido(joao, caneta, 5, LocalDate.now());

        exception.expect(RuntimeException.class);

        pedido.addItem(caneta, 1);
    }

    @Test
    public void CT09() {
        Cliente joao = new Cliente("João", "111");
        Produto caneta = new Produto("Caneta", 1.00, 100);

        exception.expect(RuntimeException.class);

        Pedido pedido = new Pedido(joao, caneta, -5, LocalDate.now());
    }

    @Test
    public void CT10() {
        Produto caneta = new Produto("Caneta", 1.00, 100);

        exception.expect(RuntimeException.class);

        Pedido pedido = new Pedido(null, caneta, 5, LocalDate.now());
    }

}
