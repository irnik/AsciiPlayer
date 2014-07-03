package Player;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class VideoPlayer extends SequencePlayer {

	VideoPlayer(File file) throws IOException
	{
		super.file = file;
		super.images.add(ImageIO.read(file));
	}
}
