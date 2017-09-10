import java.awt.*;
import javax.swing.*;

public class MyGui {

    private JFrame window = new JFrame("AI BoderLine");

    public MyGui() {
        initComponents();

        window.setBounds(100, 50, 600, 400); //location, size
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void initComponents() {
        Container cp = window.getContentPane();
        cp.setLayout(new FlowLayout() );
        cp.add(new JLabel("Playing Game") );
    }
}