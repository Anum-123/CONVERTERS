package My_Currency_Convertor;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class BUtton extends JFrame {
  private JPanel contentPane;
   public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     MainPage frame = new MainPage();
     frame.setVisible(true);
    } 
    catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
}
   public BUtton(){
       setExtendedState(JFrame.MAXIMIZED_BOTH);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 500, 600);
  contentPane = new JPanel();
  contentPane.setForeground(Color.WHITE);
  contentPane.setBackground(Color.BLACK);
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JButton button = new JButton("Main Menu");
  button.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    MainPage home = new MainPage();
    home.setVisible(true);
    dispose();
   }
  });
  button.setForeground(Color.WHITE);
  button.setFont(new Font("Tahoma", Font.PLAIN, 20));
  button.setBackground(Color.RED);
  button.setBounds(550, 499, 162, 41);
  contentPane.add(button);
  
   JButton btnT = new JButton("Temperature");
   btnT.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
     Unit_Converter  temp = new Unit_Converter ();
     temp.setVisible(true);
     dispose();
   }
  });
  btnT.setBackground(Color.BLUE);
  btnT.setForeground(Color.WHITE);
  btnT.setIcon(null);
  btnT.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
  btnT.setBounds(600, 100,250, 50);
  contentPane.add(btnT);
 
  JButton btnL = new JButton("MASS");
  btnL.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    Mass mass = new Mass();
    mass.setVisible(true);
    dispose();
   }
  });
  btnL.setBackground(Color.BLUE);
  btnL.setForeground(Color.WHITE);
  btnL.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
  btnL.setBounds(600, 200,250, 50);
  contentPane.add(btnL);
  
    JButton btnW = new JButton("Length");
  btnW.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    Length len = new Length();
    len.setVisible(true);
    dispose();
   }
  });
  btnW.setBackground(Color.BLUE);
  btnW.setForeground(Color.WHITE);
  btnW.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
  btnW.setBounds(600, 300, 250, 50);
  contentPane.add(btnW);
  
  JButton btnTi = new JButton("Time");
  btnTi.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    Time time = new Time();
    time.setVisible(true);
    dispose();
   }
  });
  btnTi.setBackground(Color.BLUE);
  btnTi.setForeground(Color.WHITE);
  btnTi.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
  btnTi.setBounds(600, 400, 250, 50);
  contentPane.add(btnTi);
  
  JButton button_1 = new JButton("Exit");
  button_1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    dispose();
   }
  });
  button_1.setForeground(Color.WHITE);
  button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
  button_1.setBackground(Color.RED);
  button_1.setBounds(800, 499, 128, 41);
  contentPane.add(button_1);

}
}
