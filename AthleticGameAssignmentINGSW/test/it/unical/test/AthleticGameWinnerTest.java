package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnerTest {

	private static AthleticGame athleticGame;

	@BeforeClass
	public static void init() {
		athleticGame = new AthleticGame("Run");
	}
	
	@Before
	public void start() {
		athleticGame.start();
	}
	
	@After
	public void reset() {
		athleticGame.reset();
	}
	
	@Test
	public void getWinnerVoidTest() {
		Assert.assertEquals(null, athleticGame.getWinner());
	}
	
	@Test
	public void getWinnerTest() {
		athleticGame.addArrival("Alessandro", Instant.now());
		athleticGame.addArrival("Marco", Instant.now().plusMillis(1000));
		Assert.assertEquals("Alessandro", athleticGame.getWinner());
	}
	
	
}
