package version1.src;
//
//import javax.swing.JFrame;
//import asciiPanel.AsciiPanel;
//
//public class ApplicationMain extends JFrame {
//    private static final long serialVersionUID = 1060623638149583738L;
//
//    private AsciiPanel terminal;
//
//    public ApplicationMain(){
//        super();
//        terminal = new AsciiPanel();
//        terminal.write("hi Maya", 1, 1);
//        add(terminal);
//        pack();
//    }
//
//    public static void main(String[] args) {
//        ApplicationMain app = new ApplicationMain();
//        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        app.setVisible(true);
//    }
//}


// - - - -


import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import version1.src.screens.Screen;
import version1.src.screens.StartScreen;

public class ApplicationMain extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1060623638149583738L;

    private AsciiPanel terminal;
    private Screen screen;

    public ApplicationMain(){
        super();
        terminal = new AsciiPanel();
        add(terminal);
        pack();
        screen = new StartScreen();
        addKeyListener(this);
        repaint();
    }

    public void repaint(){
        terminal.clear();
        screen.displayOutput(terminal);
        super.repaint();
    }

    public void keyPressed(KeyEvent e) {
        screen = screen.respondToUserInput(e);
        repaint();
    }

    public void keyReleased(KeyEvent e) { }

    public void keyTyped(KeyEvent e) { }

    public static void main(String[] args) {
        ApplicationMain app = new ApplicationMain();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
