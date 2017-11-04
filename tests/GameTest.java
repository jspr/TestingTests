package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.Game;

public class GameTest {
	
	Game game;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTest() {
		game = new Game();
		assertEquals(10,game.test());
	}

}
