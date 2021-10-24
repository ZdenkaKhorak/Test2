import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass extends Frame {

    String msg ="";

    String keyState = "";

    public MainClass(){
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }


    public static void main(String[] args) {

        MainClass appwin = new MainClass();
        appwin.setSize(new Dimension(200, 150));
        appwin.setTitle("Demo");
        appwin.setVisible(true);

    }


    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
    }
}

class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}