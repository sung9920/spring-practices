package config.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import videosystem.DVDPlayer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations={"classpath:config/videosystem/applicationContext.xml"})
public class DVDPlayerXmlConfigTest {
	@Autowired
	private DVDPlayer dvdPlayer;

	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}

	@Test
	public void testPlay() {
		assertEquals("Playing Mavel's Avengers", dvdPlayer.play());
	}
}
