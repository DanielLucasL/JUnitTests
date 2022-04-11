package carrinho;

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import org.junit.Before;
import org.junit.Test;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class CarrinhoTest {
    
	Carrinho compras;
        Produto livro;
        Produto livro2;
	
	@Before
	public void inicializa() {
           compras = new Carrinho();
	}
	
	@Test
	public void testVertamanho() {
        livro = new Produto("Introdu��o ao Teste de Software", 100.00);
        compras.addItem(livro);
		assertEquals(1, compras.getQtdeItems());
	}
         @Test
	public void testEsvazia() {
        livro = new Produto("Introdu��o ao Teste de Software", 100.00);
        compras.addItem(livro);
        compras.esvazia();
		assertEquals(0, compras.getQtdeItems());
	}
         @Test
	public void testPrecoTotal() {
        livro = new Produto("Introdu��o ao Teste de Software", 100.00);
        compras.addItem(livro);
		assertEquals(100,(int) Math. round(compras.getValorTotal()));
	}
       @Test
	public void testPrecoTotal2() {
        livro = new Produto("Introdu��o ao Teste de Software", 100.00);
        livro2 = new Produto("Introdu��o ao Teste de Software", 200.00);
        compras.addItem(livro);
        compras.addItem(livro2);
		assertEquals(300, (int) Math. round(compras.getValorTotal()));
	}
      @Test
	public void testAdicionaItem() {
        livro = new Produto("Introdu��o ao Teste de Software", 100.00);
        compras.addItem(livro);
		assertEquals(1, compras.getQtdeItems());
	}
      @Test
       public void testRemoveItem() {
            try {
                livro = new Produto("Introdu��o ao Teste de Software", 100.00);
                compras.addItem(livro);
                compras.removeItem(livro);
                assertEquals(0, compras.getQtdeItems());
            } catch (ProdutoNaoEncontradoException ex) {
                Logger.getLogger(CarrinhoTest.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
	

}
