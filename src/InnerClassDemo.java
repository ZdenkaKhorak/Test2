import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerClassDemo  extends Frame {

    String msg = "";

    public InnerClassDemo(){
        addMouseListener(new MyMouseAdapter());
        addWindowListener(new MyWindowAdapter());
    }

    class MyMouseAdapter extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            msg = "Pressed";
            repaint();
        }
    }
    class MyWindowAdapter extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    public void paint(Graphics g){
        g.drawString(msg, 20, 80);
    }

    public static void main(String[] args) {
        InnerClassDemo appwin = new InnerClassDemo();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("Demo");
        appwin.setVisible(true);
    }
}
