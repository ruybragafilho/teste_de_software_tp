// Teste da classe Queen, usando o framework de testes junit
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
import main.java.com.chessgame.chess.pieces.Queen;


public class QueenTest {

	@Test
	public void testPossibleMove_FALSE() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece b1 = new Queen(board, Color.WHITE);
		Piece b2 = new Queen(board, Color.WHITE);
		Piece b3 = new Queen(board, Color.WHITE);
		Piece b4 = new Queen(board, Color.WHITE);
		Piece b5 = new Queen(board, Color.WHITE);
		Piece b6 = new Queen(board, Color.WHITE);
		Piece b7 = new Queen(board, Color.WHITE);
		Piece b8 = new Queen(board, Color.WHITE);
		Piece b9 = new Queen(board, Color.WHITE);
		board.placePiece(b1, position);
		board.placePiece(b2, new Position(0,0));
		board.placePiece(b3, new Position(0,2));
		board.placePiece(b4, new Position(2,0));
		board.placePiece(b5, new Position(2,2));
		board.placePiece(b6, new Position(0,1));
		board.placePiece(b7, new Position(1,0));
		board.placePiece(b8, new Position(1,2));
		board.placePiece(b9, new Position(2,1));
		
		boolean retorno = b1.possibleMove(new Position(0,0));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(0,2));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(2,0));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(2,2));
		assertFalse(retorno);
		
		retorno = b1.possibleMove(new Position(0,1));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(1,0));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(1,2));
		assertFalse(retorno);
		retorno = b1.possibleMove(new Position(1,2));
		assertFalse(retorno);
	}
	
	@Test
	public void testPossibleMove_TRUE() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece b1 = new Queen(board, Color.WHITE);
		Piece b2 = new Queen(board, Color.BLACK);
		Piece b3 = new Queen(board, Color.BLACK);
		Piece b4 = new Queen(board, Color.BLACK);
		Piece b5 = new Queen(board, Color.BLACK);
		Piece b6 = new Queen(board, Color.BLACK);
		Piece b7 = new Queen(board, Color.BLACK);
		Piece b8 = new Queen(board, Color.BLACK);
		Piece b9 = new Queen(board, Color.BLACK);
		board.placePiece(b1, position);
		board.placePiece(b2, new Position(0,0));
		board.placePiece(b3, new Position(0,2));
		board.placePiece(b4, new Position(2,0));
		board.placePiece(b5, new Position(2,2));
		board.placePiece(b6, new Position(0,1));
		board.placePiece(b7, new Position(1,0));
		board.placePiece(b8, new Position(1,2));
		board.placePiece(b9, new Position(2,1));
		
		boolean retorno = b1.possibleMove(new Position(0,0));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(0,2));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(2,0));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(2,2));
		assertTrue(retorno);
		
		retorno = b1.possibleMove(new Position(0,1));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(1,0));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(1,2));
		assertTrue(retorno);
		retorno = b1.possibleMove(new Position(1,2));
		assertTrue(retorno);
	}
	
	@Test
	public void testPossibleMove_TRUE_EmptyEspace() {
		Board board = new Board(3,3);
		Position position = new Position(1,1);
		Piece b1 = new Queen(board, Color.WHITE);
		board.placePiece(b1, position);
		
		boolean retorno = b1.possibleMove(new Position(0,0));
		assertTrue(retorno);
	}
}
