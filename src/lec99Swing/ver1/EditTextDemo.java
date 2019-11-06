package lec99Swing.ver1;



import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;

/**
 * Created by Administrator on 2017/12/19 0019.
 */
public class EditTextDemo extends JFrame implements ActionListener, KeyListener {
    JTextField textFieldScreen;

    EditTextDemo() {
        super("Textfield Demo");
        this.add(textFieldScreen = new JTextField(40));
        textFieldScreen.addActionListener(this);
        textFieldScreen.addKeyListener(this);
        // textFieldScreen.addEven()
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'X') {
            JOptionPane.showMessageDialog(null, "X is Pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
