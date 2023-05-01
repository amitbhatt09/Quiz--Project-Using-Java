package amitQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);

        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to simple minds");//creating object of heading
        heading.setBounds(200, 20, 700, 30);//setting dimensions of heading
        heading.setFont(new Font("Vainer Hand ITC", Font.BOLD, 20));//font setting
        heading.setForeground(Color.BLUE);
        add(heading);

        JLabel rules = new JLabel();//creating object of heading
        rules.setBounds(20, 90, 700, 350);//setting dimensions of heading
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));//font setting
        rules.setForeground(Color.BLACK);
        rules.setText(
                "<html>" +
                        "1. You are trained to be a programmer and not a story teller, answer point to point." + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer." + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory." + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)." + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di." + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck." + "<br><br>" +
                        "<html>"
        );
        add(rules);

        back = new JButton("BACK");
        back.setBackground(Color.pink);
        back.setFont(new Font("Sans Serif", Font.BOLD, 12));
        back.setBounds(550, 460, 100, 25);
        back.addActionListener(this);// click event ke liye or click karne par kya
        // action performed hoga wo actionPerformed m likhenge
        add(back);

        start = new JButton("START");
        start.setBackground(Color.pink);
        start.setFont(new Font("Sans Serif", Font.BOLD, 12));
        start.setBounds(50, 460, 100, 25);
        start.addActionListener(this);// click event ke liye or click karne par kya
        // action performed hoga wo actionPerformed m likhenge
        add(start);

        //for creating back button using JButton class


        setSize(750, 600);
        setLocation(300, 110);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
        new Quiz(name);
        }

    else

    {
        setVisible(false);
        new Login();
    }

}
    public static void main(String[] args) {
        new Rules("User");
    }
}
