//QUIZ APPLICATION DESKTOP BASED APPLICATION WITH THE HELP OF JAVA SWING IS CONCEPT OF JAVA CORE AND HERE
//WE WILL BE USING AWT(ABSTRACT WINDOW TOOLKIT). HERE THE UI AND FRAME WILL BE MADE WITH
// THE HELP OF SWING AND AWT.

package amitQuiz;

import javax.swing.*;//JFrame is inside swing package .
import java.awt.*;// color package is inside awt package.
import java.awt.event.*;//action listener interface

public class Login extends JFrame implements ActionListener {
    //Action listener interface for click event
    // it's gives error bcoz action listener interface ke andar ek unimplemented abstract method hota
    // h,jo hota public void actionPerformed(ActionEvent ae) or isse hame override karana hoga.

    JButton rules,back;// globally defined
    JTextField tfName;//html m jaise input type = text wala
    Login(){


        // frame background color and layout permission null because I am doing it from my side
        getContentPane().setBackground(Color.WHITE);// pure frame ko utha rha hu
        setLayout(null);// for using self layouts not JFrame layouts


        // Operations on image
        // inside JFrame is imageIcon class
        //getSystemResource is static method
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quizImg.jpg"));
        JLabel image = new JLabel(i1);//creating object of image
        image.setBounds(0,0,500,500);//Setting dimensions to image...self layouts
        add(image);// final command for applying changes

        JLabel heading = new JLabel("Simple Mindset");//creating object of heading
        heading.setBounds(650,70,300,50);//setting dimensions of heading
        heading.setFont(new Font("Vainer Hand ITC",Font.BOLD,40));//font setting
        heading.setForeground(Color.BLUE);
        add(heading);// final command for applying changes

        // for naming part
        JLabel name = new JLabel("Enter Your Name");//creating object of heading
        name.setBounds(700,150,300,20);//setting dimensions of heading
        name.setFont(new Font("Vainer Hand ITC",Font.BOLD,20));//font setting
        name.setForeground(Color.BLUE);
        add(name);// final command for applying changes

        // for text box below enter your name heading
        tfName = new JTextField();
        tfName.setBounds(630,200,300,25);
        tfName.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfName);

        // For creating buttons using JButton class
        rules = new JButton("RULES");
        rules.setBackground(Color.pink);
        rules.setFont(new Font("Sans Serif",Font.BOLD,12));
        rules.setBounds(850,290,100,25);
        rules.addActionListener(this);// click event ke liye or click karne par kya
        // action performed hoga wo actionPerformed m likhenge
        add(rules);

        //for creating back button using JButton class
        back = new JButton("BACK");
        back.setBackground(Color.pink);
        back.setFont(new Font("Sans Serif",Font.BOLD,12));
        back.setBounds(620,290,100,25);
        back.addActionListener(this);// click event ke liye or click karne par kya
        // action performed hoga wo actionPerformed m likhenge
        add(back);

        // Whole frame adjustment
        setSize(1050,500);
        setLocation(200,130);
        setVisible(true);



    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
                String name = tfName.getText();
                setVisible(false);
                new Rules(name);

        }
        else if(ae.getSource()==back){
                setVisible(false);// closing the frame
        }
    }
    public static void main(String[] args) {
        new amitQuiz.Login();
    }
}
