import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtil {

    public static Color[][] loadPixelsFromFile(File file) throws IOException {

        BufferedImage image = ImageIO.read(file);
        Color[][] colors = new Color[image.getWidth()][image.getHeight()];
        int width = image.getWidth();
        int height = image.getHeight();
        int pixel[][] = new int[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                colors[x][y] = new Color(image.getRGB(x, y));
                pixel[x][y] = image.getRGB(x, y);
                System.out.print(image.getRGB(x, y) + " ");
            }
        }

        return colors;
    }

    public static void main(String[] args) throws IOException {
        ImageUtil imgUtil = new ImageUtil();
        Color[][] colors = loadPixelsFromFile(new File("gandhiJee.jpg"));

        System.out.println("Color[0][0] = " + colors[0][0]);
        System.out.println("color pixel " + colors[0][0]);
    }
}