// Teste da classe ChessPosition, usando o framework de testes junit
// Autor: Igor Roiz Teixeira


package test.java.com.chessgame.chess;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import main.java.com.chessgame.boardGame.Position;
import main.java.com.chessgame.chess.ChessPosition;


public class ChessPositionTest  {

	@Test
	public void testFromPosition() {
		Position position = new Position(1,1);
		ChessPosition chess = ChessPosition.fromPosition(position);
		
		assertTrue(chess.getColumn() == 'b');
		assertTrue(chess.getRow() == 7);
	}
	
	@Test
	public void testToPosition() {
		ChessPosition chess = new ChessPosition('b',7);
		Position position = chess.toPosition();
		
		assertTrue(position.getColumn() == 1);
		assertTrue(position.getRow() == 1);
	}

}
