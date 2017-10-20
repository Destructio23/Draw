package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class HelpWin extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTextPane txt = new JTextPane();
	
	private JPanel main = new JPanel();
	
	

	HelpWin(){
		
		setTitle("Help!");
		setSize(457, 310);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(MainWin.getGui());
		setResizable(false);
		setVisible(true);
		
		Color lightBlu = new Color(200,200,240);
		txt.setBackground(lightBlu);
		txt.setEditable(false);
		main.setBackground(lightBlu);
		main.add(txt);
		
		
		txt.setText("\nWelcome to a simple image creator\n"
				+ "\nTo create an image press and hold the main window\n"
				+ "\nYou can change the variables that determine"
				+ "\nwhat the graphic looks like in the options window\n"
				+ "\nYou can press the random button to randomize the variables\n "
				+ "\nRemember that range only accepts negative values:"
				+ "\n-16777216 > x < -1\n"
				);
		
		txt.setFont(new Font("niemaznaczeniacotuwpiszeLOL", Font.BOLD, 15));
		StyledDocument doc = txt.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		
		add(main);
	}
	
	
	
	
	
	
	

}
