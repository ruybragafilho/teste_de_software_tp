// Teste da classe Position.java, usando o framework de testes junit
// Autor: Ruy Braga Filho


package test.java.com.chessgame.boardGame;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import main.java.com.chessgame.boardGame.Position;


class PositionTest  {

    Position p;


    @Before
    public void init() {
        p = new Position( 2, 3 );
    }


    @Test
    void testRowValueAndColumnValue() {

        assertTrue(p.getRow() == 2);
        assertTrue(p.getColumn() == 3);		        
    }
    
    
    @Test
    void testSetRowValue() {
		
	p.setRow(6);	
        assertTrue(p.getRow() == 6);
        assertTrue(p.getColumn() == 3);        
    }    
    
    
    @Test
    void testSetColumnValue() {
		
	p.setColumn(9);	
        assertTrue(p.getColumn() == 9);
        assertTrue(p.getRow() == 2);        
    }    

}
