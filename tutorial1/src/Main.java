import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;


public class Main {

    static Integer myNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);
    static Integer count = 0;
    static JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!");
    static JTextField textField = new JTextField();

    public static void main(String[] args) {
        //nextRound();
        openUI();
    }

    public static void openUI() {
        JFrame frame = new JFrame("Rate die Zahl!");
        frame.setSize(400, 300);
        frame.setLocation(100, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        text.setBounds(50, 50, 300, 30);

        textField.setBounds(50, 100, 200, 30);

        JButton button = new JButton("Raten!");
        button.setBounds(50, 150, 200, 30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromTextfield = textField.getText();
                Integer number = Integer.parseInt(textFromTextfield);
                guess(number);
            }
        });

        frame.add(textField);
        frame.add(text);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);

        }
    public static void guess(Integer number) {
        if (number == myNumber) {
            text.setText("Richtig geraten! "+ count +" Versuche.");
            System.out.println("Du hast " + count + " Versuche benötigt!");
        } else {
            count++;
            if (number < myNumber) {
                text.setText("Falsch geraten! Deine Zahl ist zu klein!");
                System.out.println("Deine Zahl ist zu klein!");
            } else {
                text.setText("Falsch geraten! Deine Zahl ist zu groß!");
                System.out.println("Deine Zahl ist zu groß!");
            }
            textField.setText("");

        }

    }
}