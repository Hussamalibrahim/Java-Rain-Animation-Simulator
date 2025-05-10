import javax.swing.*;

public class Frame extends JFrame {
    Frame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new Panel());
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }


}
