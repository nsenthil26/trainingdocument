import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioRecorder {

    public static void main(String[] args) {
        try {
            AudioFormat format = new AudioFormat(44100, 16, 2, true, true);
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

            if (!AudioSystem.isLineSupported(info)) {
                System.out.println("Line not supported");
                return;
            }

            TargetDataLine targetLine = (TargetDataLine) AudioSystem.getLine(info);
            targetLine.open(format);
            targetLine.start();

            System.out.println("Recording started...");

            AudioInputStream audioStream = new AudioInputStream(targetLine);
            File wavFile = new File("recorded_audio.wav");
            AudioSystem.write(audioStream, AudioFileFormat.Type.WAVE, wavFile);

            System.out.println("Recording stopped and saved to " + wavFile.getAbsolutePath());

            targetLine.stop();
            targetLine.close();

        } catch (LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }
}