package main;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

	static Rys x;

	public static void main(String[] args) {

		//testj
		
		MainWin mainGui = MainWin.getGui();
		OptionWin.getGui();

		System.out.println(Color.BLACK.getRGB());
		System.out.println(Color.WHITE.getRGB());
		System.out.println(Color.RED.getRGB());
		System.out.println(Color.BLUE.getRGB());
		System.out.println(Color.GREEN.getRGB());

		mainGui.getPanel().addMouseListener(new MouseListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void mouseReleased(MouseEvent e) {
				x.stop();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				x = new Rys();
				x.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}

		});

	}

}
