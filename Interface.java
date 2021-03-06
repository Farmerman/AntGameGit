package FileChooserTest;
import filechoosertest.FileChooserTest;
import filechoosertest.FileChooserTest2;
import static filechoosertest.FileChooserTest.run;
import static filechoosertest.FileChooserTest2.runa;
import java.awt.EventQueue;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AWTEventListener.*;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;


public class Interface extends JFrame{

	private JFrame frame;
	private JTextField textField_Players;
	public String myValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setBackground(new Color(139, 69, 19));
    frame.setBounds(100, 100, 700, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lbl_NumberOfPlayers = new JLabel("Number of Players :-");
    lbl_NumberOfPlayers.setForeground(new Color(0, 255, 0));
    lbl_NumberOfPlayers.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
    lbl_NumberOfPlayers.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_NumberOfPlayers.setBounds(10, 234, 297, 50);
    frame.getContentPane().add(lbl_NumberOfPlayers);
    
    JSpinner spinner = new JSpinner();
    spinner.setModel(new SpinnerNumberModel(1, 1, 2, 1));
    spinner.setForeground(new Color(95, 158, 160));
    spinner.setBackground(new Color(173, 255, 47));
    spinner.setBounds(334, 246, 42, 33);
    frame.getContentPane().add(spinner);
    
    JButton button = new JButton("INSERT Player2");
    button.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		runa(new FileChooserTest2(), 250, 110);
    	}
    });
    button.setForeground(new Color(0, 0, 139));
    button.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
    button.setBounds(264, 385, 230, 50);
    button.setVisible(false);
    frame.getContentPane().add(button);
    
    JButton btn_Finish = new JButton("Confirm!");
    
    btn_Finish.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        textField_Players.setText(spinner.getValue().toString());
        if(Integer.parseInt(spinner.getValue().toString())== 2){
        button.setVisible(true);
        }
      }
    });
    btn_Finish.setFont(new Font("Showcard Gothic", Font.BOLD, 25));
    btn_Finish.setForeground(new Color(255, 0, 0));
    btn_Finish.setBounds(399, 233, 192, 50);
    frame.getContentPane().add(btn_Finish);
    
    JButton btn_Insert = new JButton("INSERT Player1");
                btn_Insert.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent arg0){
                     run(new FileChooserTest(), 250, 110);
                    }
                
                  }
                );
                
    btn_Insert.setFont(new Font("Tw Cen MT", Font.BOLD, 22));
    btn_Insert.setForeground(new Color(0, 0, 139));
    btn_Insert.setBounds(25, 384, 229, 50);
    frame.getContentPane().add(btn_Insert);
    
    textField_Players = new JTextField();
    textField_Players.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    textField_Players.setHorizontalAlignment(SwingConstants.CENTER);
    textField_Players.setBounds(41, 308, 73, 40);
    frame.getContentPane().add(textField_Players);
    textField_Players.setColumns(10);
    
    JLabel lbl_Title = new JLabel("The ANT Game");
    lbl_Title.setForeground(new Color(255, 255, 0));
    lbl_Title.setFont(new Font("Jokerman", Font.BOLD, 50));
    lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_Title.setBounds(264, 11, 410, 125);
    frame.getContentPane().add(lbl_Title);
    myValue = textField_Players.getSize().toString();
    
    JLabel lbl_Background = new JLabel("");
    lbl_Background.setHorizontalAlignment(SwingConstants.CENTER);
    lbl_Background.setIcon(new ImageIcon("C:\\Users\\FEROZE\\Desktop\\2.png"));
    lbl_Background.setBounds(0, 0, 684, 461);
    frame.getContentPane().add(lbl_Background);
    
    myValue = textField_Players.getSize().toString();
  }
}