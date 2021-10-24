import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseAdapter extends MouseAdapter {
    MainClass mousePressedDemo;
    public MyMouseAdapter(MainClass mousePressedDemo) {
        this.mousePressedDemo = mousePressedDemo;
    }
    public void mousePressed(MouseEvent e){
        mousePressedDemo.msg = "Mouse Pressed";
        mousePressedDemo.repaint();
    }
}
