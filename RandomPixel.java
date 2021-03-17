import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class RandomPixel {
    public static void main(String args[]) {
        // image dimensions
        int width = 640;
        int height = 320;

        // create buffered image object img
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // file object
        File F = null;

        // create random image pixel by pixel
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int a = (int) (Math.random() * 255); // alpha
                int r = (int) (Math.random() * 255); // red
                int g = (int) (Math.random() * 255); // green
                int b = (int) (Math.random() * 255); // blue

                // set pixels
                int p = (a << 24) | (r << 16) | (g << 8) | b;

                img.setRGB(x, y, p);

            }
        }

        // write image
        try {
            F = new File("./output.png");
            ImageIO.write(img, "png", F);
        } catch (Exception e) {
            System.out.println("Sorry :( !" + e);
        }

    }
}