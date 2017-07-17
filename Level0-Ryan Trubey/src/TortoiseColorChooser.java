
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		String choice = JOptionPane.showInputDialog("What color do you want?");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		for (int i = 0; i < 10; i++) {
			if (choice.equalsIgnoreCase("Red")) {
				Tortoise.setPenColor(PenColors.Reds.Red);
			} else if (choice.equalsIgnoreCase("Orange")) {
				Tortoise.setPenColor(PenColors.Oranges.Coral);
			} else if (choice.equalsIgnoreCase("Yellow")) {
				Tortoise.setPenColor(PenColors.Yellows.Gold);
			} else if (choice.equalsIgnoreCase("Green")) {
				Tortoise.setPenColor(PenColors.Greens.Chartreuse);
			} else if (choice.equalsIgnoreCase("Blue")) {
				Tortoise.setPenColor(PenColors.Blues.Blue);
			} else if (choice.equalsIgnoreCase("Purple")) {
				Tortoise.setPenColor(PenColors.Purples.BlueViolet);
			} else if (choice.equalsIgnoreCase("Pink")) {
				Tortoise.setPenColor(PenColors.Pinks.Pink);
			} else if (choice.equalsIgnoreCase("Brown")) {
				Tortoise.setPenColor(PenColors.Browns.Brown);
			} else {
				Tortoise.setPenColor(PenColors.getRandomColor());
			}
		}
		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape (this will take more than one line
		// of code
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
}
