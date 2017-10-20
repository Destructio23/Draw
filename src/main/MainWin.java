package main;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWin extends JFrame {

	private static final long serialVersionUID = 1L;

	private static MainWin gui = new MainWin();

	private int width = 600;
	private int height = 600;

	private MainWin() {
		setTitle("Draw");
		setSize(600, 600);
		height = getHeight();
		width = getWidth();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		add(panel);
	}

	private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

	private JPanel panel = new JPanel() {

		private static final long serialVersionUID = 1L;

		protected void paintComponent(java.awt.Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, null);
		};
	};

	public BufferedImage getImage() {
		return image;
	}

	public JPanel getPanel() {
		return panel;
	}

	public int getMyHeight() {
		return height;
	}

	public int getMyWidth() {
		return width;
	}

	public static MainWin getGui() {
		return gui;
	}

}
