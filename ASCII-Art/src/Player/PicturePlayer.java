package Player;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PicturePlayer {
	private BufferedImage img;
	PicturePlayer(BufferedImage image)
	{
		this.img = image;
	}
	PicturePlayer(File file) throws IOException
	{
		img = null;
        img = ImageIO.read(file);
	}

    private static void print(int pixel) {
        if (pixel > 240) {
            System.out.print(' ');
        } else if (pixel > 200) {
            System.out.print('.');
        } else if (pixel > 160) {
            System.out.print('*');
        } else if (pixel > 120) {
            System.out.print('~');
        } else if (pixel > 80) {
            System.out.print('x');
        } else if (pixel > 40) {
            System.out.print('#');
        } else {
            System.out.print('$');
        }
    }

    private static int Grey(int rgb) {
        final Color colorful = new Color(rgb);
        return (colorful.getBlue() + colorful.getRed() + colorful.getGreen()) / 3;
    }
    public void play()
    {
		for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                final int pixel = Grey(img.getRGB(x, y));
                print(pixel);
            }
            System.out.println();
        }
    }
}
