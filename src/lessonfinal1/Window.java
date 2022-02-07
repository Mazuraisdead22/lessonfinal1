package lessonfinal1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        setTitle(" ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setBounds(0, 0, 500, 300);
        setLayout(new GridLayout(3, 1));

        JTextArea textArea = new JTextArea();
        textArea.setBounds(40, 40, 100, 80);
        add(textArea);

        JLabel label = new JLabel();
        label.setText(" опишите своего персонажа ");
        add(label);

        JButton button = new JButton(" начать путь ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                label.setText(text);
                System.out.println(text);
                button.setText("ваш персонаж совершил действие");

            }
        });
        add(button);
        setVisible(true);



    }
}
