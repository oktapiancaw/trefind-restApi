package oxtcode_dev.trefind;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import oxtcode_dev.trefind.video.Video;
import oxtcode_dev.trefind.video.VideoDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
class TrefindApplicationTests {

	@Autowired
	private VideoDAO videoDao;

	@Test
	public void getAll() {
		Video video = new Video("UCYk4LJI0Pr6RBDWowMm-KUw", "HABIS SEMUA!! PRABOWO PERDANA BICARA‼ EXCLUSIVE - Deddy Corbuzier Podcast", "Deddy Corbuzier", "2021-06-13T01:46:01Z");
		TestCase.assertTrue(videoDao.insert(video));
	}
}
