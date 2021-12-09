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
// this class shows the button of
// currency and unit
class MainPage extends JFrame {
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
 // construtor
public MainPage() {
    setExtendedState(JFrame.MAXIMIZED_BOTH);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 500, 600);
  contentPane = new JPanel();
  contentPane.setForeground(Color.WHITE);
  contentPane.setBackground(Color.BLACK);
  contentPane.setBorder(UIManager.getBorder("Button.border"));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JLabel lblWelcomeToConvert = new JLabel("WELCOME TO CONVERTER");
  lblWelcomeToConvert.setForeground(Color.WHITE);
  lblWelcomeToConvert.setHorizontalAlignment(SwingConstants.CENTER);
  lblWelcomeToConvert.setFont(new Font("Times New Roman", Font.BOLD, 48));
  lblWelcomeToConvert.setBounds(350, 13, 700, 79);
  contentPane.add(lblWelcomeToConvert);
  
  //creating obj of currency
  JButton btnC = new JButton("CURRENCY");
  btnC.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    MyCurrencyConvertor currency = new MyCurrencyConvertor();
    currency.setVisible(true);
    dispose();
   }
  });
  btnC.setBackground(Color.BLUE);
  btnC.setForeground(Color.WHITE);
  btnC.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
  btnC.setBounds(600,100, 250, 70);
  contentPane.add(btnC);
  
   //creating obj of unit
  JButton btnU = new JButton("UNIT");
  btnU.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
       BUtton unit = new BUtton ();
       unit.setVisible(true);
    dispose();
   }
  });
  btnU.setBackground(Color.BLUE);
  btnU.setForeground(Color.WHITE);
  btnU.setIcon(null);
  btnU.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
  btnU.setBounds(600, 230, 250, 70);
  contentPane.add(btnU);
  
  JButton button = new JButton("Exit");
  button.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    dispose();
   }
  });
  button.setForeground(Color.WHITE);
  button.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
  button.setBackground(Color.RED);
  button.setBounds(600,350, 250, 70);
  contentPane.add(button);
 }
}
