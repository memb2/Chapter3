
package mypackage;

import javax.swing.*;

public class TestButtonIcons extends JFrame {
    public TestButtonIcons() {
        ImageIcon usIcon = new ImageIcon(getClass().getResource("/images/usIcon.gif"));
        ImageIcon caIcon = new ImageIcon(getClass().getResource("/images/canadaIcon.gif"));
        ImageIcon ukIcon = new ImageIcon(getClass().getResource("/images/ukIcon.gif"));
        JButton jbt = new JButton("Click me", usIcon);
        jbt.setPressedIcon(caIcon);
        jbt.setRolloverIcon(ukIcon);
        add(jbt);
        
        setTitle("Button Icons");
        setSize(250, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestButtonIcons();
    }
}
