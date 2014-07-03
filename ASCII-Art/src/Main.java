import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
        final String arg = "E:\\Me\\Programming\\HackBulgaria\\Java\\GitOther Copy\\Core-Java-1\\8-WorkingWithLibraries\\a.jpg";
        final File file = new File(arg);
        BufferedImage img = null;
        try {
            img = ImageIO.read(file);
        } catch (final Exception e) {
            e.fillInStackTrace();
        }

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                final int pixel = Grey(img.getRGB(x, y));
                print(pixel);
            }
            System.out.println();
        }
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

}
