package lec99Swing.ver0;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class MyApp extends JFrame implements ActionListener, WindowListener {
    JLabel label;
    JButton btnInc, btnDec;


    int val = 0;

    MyApp() {
        super("Demo0");
        this.setLayout(new FlowLayout());
        this.add(label = new JLabel("0"));
        this.add(btnInc = new JButton("++"));
        this.add(btnDec = new JButton("--"));
        btnInc.addActionListener(this);
        btnDec.addActionListener(this);
        this.addWindowListener(this);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInc) {
            // JOptionPane.showMessageDialog(null,"Inc Buton clicked");
            int old = Integer.parseInt(label.getText());
            label.setText(Integer.toString(old + 1));
        } else if (e.getSource() == btnDec) {
            //JOptionPane.showMessageDialog(null,"Dec clicked");
            int old = Integer.parseInt(label.getText());
            label.setText(Integer.toString(old - 1));
        } else {

        }
    }

    public static void main(String[] args) {
        new MyApp();

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int select = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (select == JOptionPane.OK_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Thank you~");
        }

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
