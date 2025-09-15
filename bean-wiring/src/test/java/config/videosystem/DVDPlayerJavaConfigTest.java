package config.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import videosystem.DigitalVideoDisc;

public class DVDPlayerJavaConfigTest {
	@Autowired
	private DigitalVideoDisc dvd1;

	@Test
	public void testDVD1() {
		assertNotNull(dvd1);
	}

}
