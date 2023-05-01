package amitQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String name, int score){
        setBounds(400,150,750,550);
        //for size and location at same time
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);//creating object of image
        image.setBounds(0,150,300,250);//Setting dimensions to image...self layouts
        add(image);// final command for applying changes


        JLabel heading = new JLabel("Thank You "+name+" For playing simple minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel uscore = new JLabel("Your Score is "+score);
        uscore.setBounds(350,200,300,30);
        uscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(uscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(380,270,140,30);
        submit.setFont(new Font("Dialog",Font.PLAIN,20));
        submit.setBackground(Color.pink);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score("User",0);
    }
}
