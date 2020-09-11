package version1.src.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {

    public void displayOutput(AsciiPanel terminal) {

        String beautifulArt = "123456789012345678901234567890123456789012345678901234568901234567890123456789";

        terminal.write(beautifulArt, 1, 1);
        terminal.writeCenter("-- press [enter] to start --", 22);
    }

    public Screen respondToUserInput(KeyEvent key) {
//        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
        switch(key.getKeyCode()) {
            case (KeyEvent.VK_RIGHT | KeyEvent.VK_KP_RIGHT):
                return new RightArrowScreen();
//            case KeyEvent.VK_KP_RIGHT:
//                return new RightArrowScreen();
            case KeyEvent.VK_LEFT:
                return new LeftArrowScreen();
            case KeyEvent.VK_UP:
                return new UpArrowScreen();
            case KeyEvent.VK_DOWN:
                return new DownArrowScreen();
//            case KeyEvent.VK_ENTER:
//                return new PlayScreen();
        }
        return this;
    }
}