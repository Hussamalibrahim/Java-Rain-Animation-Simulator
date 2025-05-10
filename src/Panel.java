import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel implements ActionListener {
    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 700;
    Rain []rain;
    Panel(){
        setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        setBackground(Color.PINK);
        rain = new Rain[500];
        for (int i = 0 ; i < rain.length ; i++){
            rain[i] = new Rain();
        }
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    for (Rain value : rain) {
                        value.newRain();
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        setFocusable(true);
        Timer timer = new Timer(1000/60,this);
        timer.start();

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw((Graphics2D) g);
    }
    public void draw(Graphics2D g){
        g.setColor(Color.RED);
        for (Rain r : rain) {
            g.setStroke(new BasicStroke(r.thick));
            g.drawLine(r.x, r.y, r.x, r.py);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (Rain r  :rain)
            r.move();
        repaint();
    }
}
