// Teste da classe King, usando o framework de testes junit
// Autor: Ruy Braga Filho

package test.java.com.chessgame.chess.pieces;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import main.java.com.chessgame.boardGame.Board;
import main.java.com.chessgame.boardGame.Piece;
import main.java.com.chessgame.boardGame.Position;
import main.java.com.chessgame.chess.Color;
import main.java.com.chessgame.chess.ChessMatch;
import main.java.com.chessgame.chess.pieces.King;


public class KingTest {

	Board board;
    ChessMatch cm;
	Piece king1;    
    Position position1;


	@Before
	public void init() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		board = new Board(8, 8);	
        
        cm = new ChessMatch();

		king1 = new King(board, Color.WHITE, cm);
        position1 = new Position(3, 3);		
		board.placePiece(king1, position1);		
	}


    // Tenta movimentar o rei, uma posição, na diagonal superior à esquerda,
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testDiagonalSuperiorEsquerda() {
	
        assertTrue( king1.possibleMove(new Position(2, 2)) );
	}

    // Tenta movimentar o rei, uma posição, na diagonal superior à direita,
    // o que é permitido pelas regras do xadrez. A posição está vazia.   
	@Test
	public void testDiagonalSuperiorDireita() {

        assertTrue( king1.possibleMove(new Position(2, 4)) );
	}

    // Tenta movimentar o rei, uma posição, na diagonal inferior à esquerda,
    // o que é permitido pelas regras do xadrez. A posição está vazia.   
	@Test
	public void testDiagonalInferiorEsquerda() {
		
        assertTrue( king1.possibleMove(new Position(4, 2)) );
	}
    
    // Tenta movimentar o rei, uma posição, na diagonal inferior à direita,
    // o que é permitido pelas regras do xadrez. A posição está vazia.   
	@Test
	public void testDiagonalInferiorDireita() {
		
        assertTrue( king1.possibleMove(new Position(4, 4)) );
	}    


    // Tenta movimentar o rei, uma posição, na horizontal para a direita, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testHorizontalDireita() {
		
        assertTrue( king1.possibleMove(new Position(3, 4)) );
	}    

    // Tenta movimentar o rei, uma posição, na horizontal para a esquerda, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testHorizontalEsquerda() {;
		
        assertTrue( king1.possibleMove(new Position(3, 2)) );
	}    

    // Tenta movimentar o rei, uma posição, na vertical para cima, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testVerticalCima() {
		
        assertTrue( king1.possibleMove(new Position(2, 3)) );
	}    

    // Tenta movimentar o rei, uma posição, na vertical para baixo, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testVerticalBaixo() {
		
        assertTrue( king1.possibleMove(new Position(4, 3)) );
	}       



    // Tenta movimentar o rei, duas posições, na diagonal superior à esquerda,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testDiagonalSuperiorEsquerda2Posicoes() {

        assertFalse( king1.possibleMove(new Position(1, 1)) );
	}

    // Tenta movimentar o rei, duas posições, na diagonal superior à direita,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.   
	@Test
	public void testDiagonalSuperiorDireita2Posicoes() {

        assertFalse( king1.possibleMove(new Position(1, 5)) );
	}

    // Tenta movimentar o rei, duas posições, na diagonal inferior à esquerda,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.   
	@Test
	public void testDiagonalInferiorEsquerda2Posicoes() {
	
        assertFalse( king1.possibleMove(new Position(5, 1)) );
	}
    
    // Tenta movimentar o rei, duas posições, na diagonal inferior à direita,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.   
	@Test
	public void testDiagonalInferiorDireita2Posicoes() {
	
        assertFalse( king1.possibleMove(new Position(5, 5)) );
	}    


    // Tenta movimentar o rei, duas posições, na horizontal para a direita, 
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testHorizontalDireita2Posicoes() {
	
        assertFalse( king1.possibleMove(new Position(3, 5)) );
	}    


    // Tenta movimentar o rei, duas posições, na horizontal para a esquerda, 
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testHorizontalEsquerda2Posicoes() {
		
        assertFalse( king1.possibleMove(new Position(3, 1)) );
	}    


    // Tenta movimentar o rei, duas posições, na vertical para cima, 
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testVerticalCima2Posicoes() {
		
        assertFalse( king1.possibleMove(new Position(1, 3)) );
	}    


    // Tenta movimentar o rei, duas posições, na vertical para baixo, 
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testVerticalBaixo2Posicoes() {
		
        assertFalse( king1.possibleMove(new Position(5, 3)) );
	}       

	
    // Tenta atacar um rei inimigo, que está uma posição acima, na vertical.
	@Test
	public void testAtacarTorreInimiga() {

		Piece king2 = new King(board, Color.BLACK, cm );
		Position position2 = new Position(2, 3);        
		board.placePiece(king2, position2);        
		
		assertTrue( king1.possibleMove(new Position(2, 3)) );
	}

}
