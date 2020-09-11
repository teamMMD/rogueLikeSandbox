package version1.src.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class RightArrowScreen extends StartScreen {

    public void displayOutput(AsciiPanel terminal) {
        terminal.write("You pressed the RIGHT arrow key!.", 1, 1);
        terminal.writeCenter("-- press another arrow key --", 22);
    }

//    public Screen respondToUserInput(KeyEvent key) {
//        return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
//    }
}
