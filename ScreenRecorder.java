import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenRecorder {

    public static void main(String[] args) throws Exception {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle screenRect = new Rectangle(screenSize);
        Robot robot = new Robot();
        //Configure Encoder Here
        for(int i=0; i<10; i++){ //Record 10 frames
            BufferedImage screenCapture = robot.createScreenCapture(screenRect);
            // Encode the frame with the encoder here
            ImageIO.write(screenCapture, "jpeg", new File("frame"+ i +".jpeg"));
            Thread.sleep(100); //Frame rate control
        }
        //Save video file here

    }
}