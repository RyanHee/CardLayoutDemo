import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class frame extends JFrame {
    public static final int WIDTH = 1600;
    public static final int HEIGHT = 900;
    private CardLayout cl;
    private HashMap<String, JPanel> panels;

    public frame() {
        super();

        cl = new CardLayout();
        //panels = new HashMap<String, JPanel>();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(cl);
        Constants.PANEL = mainPanel;

        Panel1 p1 = new Panel1(cl);
        Panel2 p2 = new Panel2(cl);

        //panels.put(Constants.P1, p1);
        //panels.put(Constants.P2, p2);

        mainPanel.add(p1, Constants.P1);
        mainPanel.add(p2, Constants.P2);

        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);

        cl.show(mainPanel, Constants.P1);
    }
}