package the_crazy_and_hillarious_adventures_of_morten_thor_or_birger_in_search_of_his_missing_cat_bob_thats_right_bob_the_cat_yup_that_is_his_name_bob_the_cat_who_is_a_cat_cat;

import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.program.GraphicsProgram;

//	The crazy and hilarious adventures of Morten, Thor or Birger in search of his missing cat, Bob, that's right, Bob the cat. Yup, that is his name; Bob the cat, who is a cat. Cat.

public class The_Game extends GraphicsProgram {

	Dude character;

	@Override
	public void init() {
		setBackground(Color.getHSBColor(0.312f, 0.769f, 0.458f));
		setSize(800, 600);
		addKeyListeners();
	}

	@Override
	public void run() {
		character = new Dude();
		character.setLocation(400, 300);
		character.setColor(Color.GRAY);
		add(character);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			character.move(Direction.NORTH);
			break;
		case KeyEvent.VK_DOWN:
			character.move(Direction.SOUTH);
			break;
		case KeyEvent.VK_LEFT:
			character.move(Direction.WEST);
			break;
		case KeyEvent.VK_RIGHT:
			character.move(Direction.EAST);
			break;
		}
	}
}
