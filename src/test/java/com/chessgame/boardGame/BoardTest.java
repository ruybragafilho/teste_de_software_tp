// Teste da classe Board, usando o framework de testes junit
// Autor: Igor Roiz Teixeira E Ruy Braga Filho


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
import main.java.com.chessgame.chess.pieces.Rook;



public class BoardTest  {

	@Test
	public void testPositionExists_TRUE() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		boolean resposta = board.positionExists(position);
		assertTrue(resposta);
	}
	
	@Test
	public void testPositionExists_FALSE() {
		Board board = new Board(5,5);
		Position position = new Position(6,6);
		boolean resposta = board.positionExists(position);
		assertFalse(resposta);
	}
	
	@Test
	public void testThereIsAPiece_TRUE() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		Piece piece = new Rook(board, Color.WHITE);
		board.placePiece(piece, position);
		boolean resposta = board.thereIsAPiece(position);
		assertTrue(resposta);
	}
	
	@Test
	public void testThereIsAPiece_FALSE() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		boolean resposta = board.thereIsAPiece(position);
		assertFalse(resposta);
	}

	@Test (expected = java.util.RuntimeException.class)
	public void testThereIsAPiece_EXCEPTION() {
		Board board = new Board(5,5);
		Position position = new Position(6,6);
		board.thereIsAPiece(position);
	}
	
	@Test
	public void testRemovePiece() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		Piece piece = new Rook(board, Color.WHITE);
		board.placePiece(piece, position);
		Piece piece2 = board.removePiece(position);
		assertTrue(piece.equals(piece2));
	}
	
	@Test
	public void testRemovePiece_NULL() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		assertTrue(board.removePiece(position) == null);
	}
	
	@Test (expected = java.util.RuntimeException.class)
	public void testRemovePiece_EXCEPTION() {
		Board board = new Board(5,5);
		Position position = new Position(6,6);
		board.thereIsAPiece(position);
	}
	
	@Test
	public void testPiece_Recieves_int() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		Piece piece = new Rook(board, Color.WHITE);
		board.placePiece(piece, position);
		assertTrue(piece.equals(board.piece(4, 4)));
	}
	
	@Test
	public void testPiece_Recieves_int_NULL() {
		Board board = new Board(5,5);
		assertTrue(board.piece(4, 4) == null);
	}
	
	@Test
	public void testPiece_Recieves_Position() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		Piece piece = new Rook(board, Color.WHITE);
		board.placePiece(piece, position);
		assertTrue(piece.equals(board.piece(position)));
	}
	
	@Test
	public void testPiece_Recieves_Position_NULL() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		assertTrue(board.piece(position) == null);
	}
	
	@Test (expected = java.util.RuntimeException.class)
	public void testPlacePiece_Exception(){
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		Piece piece = new Rook(board, Color.WHITE);
		board.placePiece(piece, position);
		board.placePiece(piece, position);
	}
	
	@Test
	public void testPlacePiece() {
		Board board = new Board(5,5);
		Position position = new Position(4,4);
		Piece piece = new Rook(board, Color.WHITE);
		board.placePiece(piece, position);
		
		Piece resposta = board.piece(position);
		assertTrue(piece.equals(resposta));
	}
	
}
