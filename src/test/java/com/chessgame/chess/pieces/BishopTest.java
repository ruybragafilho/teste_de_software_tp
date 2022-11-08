// Teste da classe Bishop, usando o framework de testes junit
// Autor: Igor Roiz Teixeira

package test.java.com.chessgame.chess.pieces;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import main.java.com.chessgame.boardGame.Board;
import main.java.com.chessgame.boardGame.Piece;
import main.java.com.chessgame.boardGame.Position;
import main.java.com.chessgame.chess.Color;
import main.java.com.chessgame.chess.pieces.Bishop;


public class BishopTest {

	@Test
	public void testPossibleMove_FALSE() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece b1 = new Bishop(board, Color.WHITE);
		Piece b2 = new Bishop(board, Color.WHITE);
		Piece b3 = new Bishop(board, Color.WHITE);
		Piece b4 = new Bishop(board, Color.WHITE);
		Piece b5 = new Bishop(board, Color.WHITE);
		board.placePiece(b1, position);
		board.placePiece(b2, new Position(0,0));
		board.placePiece(b3, new Position(0,2));
		board.placePiece(b4, new Position(2,0));
		board.placePiece(b5, new Position(2,2));
		
		boolean retorno = b1.possibleMove(new Position(0,0));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(0,2));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(2,0));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(2,2));
		assertFalse(retorno);
	}
	
	@Test
	public void testPossibleMove_TRUE_ENEMIES() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece b1 = new Bishop(board, Color.WHITE);
		Piece b2 = new Bishop(board, Color.BLACK);
		Piece b3 = new Bishop(board, Color.BLACK);
		Piece b4 = new Bishop(board, Color.BLACK);
		Piece b5 = new Bishop(board, Color.BLACK);
		board.placePiece(b1, position);
		board.placePiece(b2, new Position(0,0));
		board.placePiece(b3, new Position(0,2));
		board.placePiece(b4, new Position(2,0));
		board.placePiece(b5, new Position(2,2));
		
		boolean retorno = b1.possibleMove(new Position(0,0));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(0,2));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(2,0));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(2,2));
		assertTrue(retorno);
	}
	
	@Test
	public void testPossibleMove_TRUE_EMPTY() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece b1 = new Bishop(board, Color.WHITE);
		board.placePiece(b1, position);
		
		boolean retorno = b1.possibleMove(new Position(0,0));
		assertTrue(retorno);
	}

}
