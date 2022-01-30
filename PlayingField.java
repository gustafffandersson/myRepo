import java.awt.*;
import javax.swing.*;

public class PlayingField {
    private int width = 200;
    private int height = 200;
    private JFrame frame;
    private JPanel panel;

    public void PlayingField(){
        frame = new JFrame("window");
        panel = new JPanel();

        panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.green);  

        JButton b1=new JButton("Button 1");     
        b1.setBounds(50,100,80,30);    
        b1.setBackground(Color.yellow);   
        JButton b2=new JButton("Button 2");   
        b2.setBounds(100,100,80,30);    
        b2.setBackground(Color.green);  

        panel.add(b1); panel.add(b2);  
        frame.add(panel);  
        frame.setSize(400,400);    
        frame.setLayout(null);    
        frame.setVisible(true); 
    }
    public static void main(String[] args) {
        new PlayingField();
    }
}
