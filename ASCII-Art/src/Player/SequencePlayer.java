package Player;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class SequencePlayer extends FilePlayer{
	ArrayList<BufferedImage> images;
	SequencePlayer()
	{
		images = null;
	}
	SequencePlayer(ArrayList<BufferedImage> images)
	{
		this.images = images;
	}
	public void play()
	{
		for (int i = 0; i < images.size(); i++) {
			new PicturePlayer((BufferedImage)(images.get(i))).play();
		}
	}
}
