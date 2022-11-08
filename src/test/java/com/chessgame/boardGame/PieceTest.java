// Teste da classe Piece, usando o framework de testes junit
// Autor: Igor Roiz Teixeira

package test.java.com.chessgame.boardGame;

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


public class PieceTest {

	@Test
	public void testIsThereAnyPossibleMove_TRUE() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece piece = new Bishop(board, Color.WHITE);
		board.placePiece(piece, position);
		
		assertTrue(piece.isThereAnyPossibleMove());
	}
	
	@Test
	public void testIsThereAnyPossibleMove_FALSE() {
		Board board = new Board(1,1);
		Position position = new Position(0,0);
		Piece piece = new Bishop(board, Color.WHITE);
		board.placePiece(piece, position);
		
		assertFalse(piece.isThereAnyPossibleMove());
	}

}
