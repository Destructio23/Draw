package main;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Rys extends Thread {

	private static OptionWin optionGui = OptionWin.getGui();

	static double multiplier, add, range;
	static int speed;
	long count = 0;
	boolean x = true;

	@Override
	public void run() {

		DetermineVariables();

		System.out.println("\nMultiplier: " + multiplier + "\nadd: " + add + "\nrange: " + range + "\nspeed: " + speed);

		for (int i = 0; i < MainWin.getGui().getMyWidth(); i++) {
			for (int j = 0; j < MainWin.getGui().getMyHeight(); j++) {

				MainWin.getGui().getImage().setRGB(i, j, (int) range);

				if (x)
					range = range + add * multiplier;
				else
					range = range - add * multiplier;

				if (range < Color.BLACK.getRGB())
					x = true;
				else if (range > 0)
					x = false;

				try {
					if (count++ % speed == 0) {
						MainWin.getGui().repaint();
						Thread.sleep(1);
					}

				} catch (InterruptedException e1) {
				}
			}
		}
	}

	private static void DetermineVariables() {

		try {
			multiplier = Double.parseDouble(optionGui.getMulEdit().getText());
			add = Double.parseDouble(optionGui.getAddEdit().getText());
			range = Double.parseDouble(optionGui.getRngEdit().getText());
			speed = Integer.parseInt(optionGui.getSpdEdit().getText());
		} catch (Exception e) {
			System.out.println("EXCEPTION!! Returning to default configuration");
			multiplier = 10;
			add = 5;
			range = -100000;
			speed = 200;

			JOptionPane.showMessageDialog(optionGui, "Double Numbers only! \nReturning to original configuration",
					"Bad Input", JOptionPane.WARNING_MESSAGE);
		}

	}

	public void setMultiplier(int mul) {
		Rys.multiplier = mul;
	}

	public void setAdd(int add) {
		Rys.add = add;
	}

	public void setRange(int range) {
		Rys.range = range;
	}

	public void setSpeed(int speed) {
		Rys.speed = speed;
	}
}
