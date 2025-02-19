/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ERICAMACHADOKLEINKAU
 */
public class estoqueTest {

    private estoque estoque;

    @BeforeEach
    public void criar() {
        estoque = new estoque();
    }

    @Test
    public void testAdd() {
        estoque.adicionarProduto("banana", 4);
        assertEquals("banana", estoque.produtoMaisEstocado());
    }

    @Test
    public void testRemove() {
        estoque.removerProduto("banana", 4);
        assertEquals("banana", estoque.consultarQuantidade("banana"));
    }

    @Test
    public void testQuant() {
        estoque.consultarQuantidade("banana");
    }

    @Test
    public void testMaisEstoque() {
        estoque.produtoMaisEstocado();

    }

    @Test
    public void testeListar() {

        estoque.listarProdutos();
    }

    @Test
    public void testeReabastecer() {

        estoque.reabastecerEstoque();
        assertEquals(15, estoque.estoque.get(1).quantidade, "O teste1 deve ter 15 unidades.");

    }

    @AfterAll
    public void testLimpar() {
        estoque.limparEstoque();
    }
}
