package logic;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class SoundMaker {

    public void playWarningSound() {
        File file = new File("beep-3.wav");
        URL url = null;

        if (file.canRead()) {
            try {
                url = file.toURI().toURL();

                Clip clip = AudioSystem.getClip();

                clip.open(AudioSystem.getAudioInputStream(file));

                clip.start();
            } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(url);
    }
}
