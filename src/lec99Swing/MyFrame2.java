package lec99Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class MyFrame2 extends JFrame implements ActionListener {
    JButton button;
    JButton button2;

    MyFrame2() {
        setTitle("JAL Calc");
        setSize(400, 300);
        button = new JButton("Text");
        this.add(button);
        button.addActionListener(this);
        button2 = new JButton("Text2");
        this.add(button2);
        button2.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame2();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
            JOptionPane.showMessageDialog(null, "Something happened!");
    }
}
