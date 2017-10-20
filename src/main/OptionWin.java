package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class OptionWin extends JFrame {

	private static final long serialVersionUID = 1L;

	private static OptionWin x = new OptionWin();

	// left:
	private JLabel mul = new JLabel("Multiplier");
	private JLabel add = new JLabel("Add");
	private JLabel rng = new JLabel("Range");
	private JLabel spd = new JLabel("Speed");

	private JTextField mulEdit = new JTextField("10");
	private JTextField addEdit = new JTextField("5");
	private JTextField rngEdit = new JTextField("-100000");
	private JTextField spdEdit = new JTextField("200");

	private JPanel main = new JPanel(new BorderLayout());
	private JPanel bot = new JPanel(new GridLayout(1, 2));

	private JPanel left = new JPanel(new GridLayout(4, 1));
	private JPanel right = new JPanel(new GridLayout(4, 1));

	private JButton rand = new JButton("Random");
	private JButton help = new JButton("Help");

	JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, left, right);

	private OptionWin() {

		setTitle("Options");
		setSize(350, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(MainWin.getGui());
		setResizable(true);
		setVisible(true);
		add(main);

		main.add(sp, BorderLayout.CENTER);
		main.add(bot, BorderLayout.PAGE_END);

		sp.setOneTouchExpandable(false);
		sp.setDividerLocation(80);

		left.setBackground(new Color(174, 241, 249));
		right.setBackground(new Color(174, 241, 249));

		left.add(mul);
		left.add(add);
		left.add(rng);
		left.add(spd);

		right.add(mulEdit);
		right.add(addEdit);
		right.add(rngEdit);
		right.add(spdEdit);

		// bot
		bot.add(rand);
		bot.add(help);

		rand.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				mulEdit.setText((Math.random() * 100) + "");
				addEdit.setText((Math.random() * 100) + "");
				rngEdit.setText((-10000000 + Math.random() * 10000) + "");

			}
		});

		help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				new HelpWin();

			}
		});

	}

	public JTextField getMulEdit() {
		return mulEdit;
	}

	public JTextField getAddEdit() {
		return addEdit;
	}

	public JTextField getRngEdit() {
		return rngEdit;
	}

	public JTextField getSpdEdit() {
		return spdEdit;
	}

	public static OptionWin getGui() {
		return x;
	}

}
