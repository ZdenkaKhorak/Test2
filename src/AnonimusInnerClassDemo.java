import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonimusInnerClassDemo extends Frame {

    String msg = "";

    public AnonimusInnerClassDemo(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                msg = "Pressed";
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics graphics){
        graphics.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        AnonimusInnerClassDemo appwin = new AnonimusInnerClassDemo();
        appwin.setSize(new Dimension(400,
                400));
        appwin.setVisible(true);
    }
}
