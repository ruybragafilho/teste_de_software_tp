// Teste da classe Rook, usando o framework de testes junit
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
import main.java.com.chessgame.chess.pieces.Rook;


public class RookTest {

    // Tenta movimentar uma torre para a diagonal superior à esquerda,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testDiagonalSuperiorEsquerda() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertFalse( rook1.possibleMove(new Position(2, 2)) );
	}

    // Tenta movimentar uma torre para a diagonal superior à direita,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testDiagonalSuperiorDireita() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertFalse( rook1.possibleMove(new Position(2, 4)) );
	}

    // Tenta movimentar uma torre para a diagonal inferior à esquerda,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testDiagonalInferiorEsquerda() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertFalse( rook1.possibleMove(new Position(4, 2)) );
	}
    
    // Tenta movimentar uma torre para a diagonal inferior à direita,
    // o que não é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testDiagonalInferiorDireita() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertFalse( rook1.possibleMove(new Position(4, 4)) );
	}    


    // Tenta movimentar uma torre na horizontal para a direita, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testHorizontalDireita() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertTrue( rook1.possibleMove(new Position(3, 4)) );
	}    


    // Tenta movimentar uma torre na horizontal para a esquerda, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testHorizontalEsquerda() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertTrue( rook1.possibleMove(new Position(3, 2)) );
	}    


    // Tenta movimentar uma torre na vertical para cima, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testVerticalCima() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertTrue( rook1.possibleMove(new Position(2, 3)) );
	}    


    // Tenta movimentar uma torre na vertical para baixo, 
    // o que é permitido pelas regras do xadrez. A posição está vazia.
	@Test
	public void testVerticalBaixo() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7 
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);		
		board.placePiece(rook1, position1);
		
        assertTrue( rook1.possibleMove(new Position(4, 3)) );
	}       


	
    // Tenta atacar uma torre inimiga, que está uma posição acima, na vertical.
	@Test
	public void testAtacarTorreInimiga() {

        // Índices das linhas: de 0 à 7 
        // Índices das colunas: de 0 à 7         
		Board board = new Board(8, 8);

		Piece rook1 = new Rook(board, Color.WHITE);
        Position position1 = new Position(3, 3);
		board.placePiece(rook1, position1);

		Piece rook2 = new Rook(board, Color.BLACK );
		Position position2 = new Position(2, 3);        
		board.placePiece(rook2, position2);        
		
		assertTrue( rook1.possibleMove(new Position(2, 3)) );
	}

}
