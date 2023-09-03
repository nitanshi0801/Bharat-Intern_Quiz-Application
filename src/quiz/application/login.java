package quiz.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Nitanshi Gupta
 */
public  class login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tf;
    
    login(){
        
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon for quiz game/login1.jpg"));
        JLabel image =new JLabel(i1);
        
        // we can create our own bounds with the help of the setbounds function
        image.setBounds(20,0,500,500);
        add(image);
        
        JLabel heading= new JLabel("Creative Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.white);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
         name.setForeground(Color.white);
        add(name);
        
         tf= new JTextField();
        tf.setBounds(735,200,300,25);
        tf.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tf);
        
         rules = new JButton("Rules");
        rules.setBounds(730,270,120,25);
         rules.setFont(new Font("Times New Roman", Font.BOLD,20));
        rules.setBackground(Color.yellow);
         rules.setForeground(Color.black);
         rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
         back.setFont(new Font("Times New Roman", Font.BOLD,20));
        back.setBackground(Color.yellow);
         back.setForeground(Color.black);
         back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocation(200,150);
            
        setVisible(true);
        
    }
    
   // public interface ActionListener extends EventListener{
    
   public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==  rules){
            String name = tf.getText();
            setVisible(false);
            new Rules(name);
            
        }
        else if(ae.getSource()== back){
            setVisible(false);
        }
 }
    
    
    public static void main(String[] args) {
        new login ();
    }

   

 
}