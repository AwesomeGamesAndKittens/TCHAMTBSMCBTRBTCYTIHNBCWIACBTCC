package the_crazy_and_hillarious_adventures_of_morten_thor_or_birger_in_search_of_his_missing_cat_bob_thats_right_bob_the_cat_yup_that_is_his_name_bob_the_cat_who_is_a_cat_cat;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

//	The crazy and hilarious adventures of Morten, Thor or Birger in search of his missing cat, Bob, that's right, Bob the cat. Yup, that is his name; Bob the cat, who is a cat. Cat.

public class The_Game extends GraphicsProgram{

	Dude character;
	MouseEvent mouse;
	Dialogue dialogues; 

	@Override
	public void init() {
		setBackground(Color.getHSBColor(0.312f, 0.769f, 0.458f));
		setSize(800, 600);
		addKeyListeners();
		addMouseListeners();
	}

	@Override
	public void run() {
		dialogues = new Dialogue ("C:\\Users\\Morten\\workspace1\\Spillprosjekt\\TCHAMTBSMCBTRBTCYTIHNBCWIACBTCC\\Awesome Games and Kittens\\resources\\bob\\Dialog");
		character = new Dude();
		character.setLocation(400, 300);
		character.setColor(Color.GRAY);
		add(character);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			character.move(Direction.NORTH);
			break;
		case KeyEvent.VK_S:
			character.move(Direction.SOUTH);
			break;
		case KeyEvent.VK_A:
			character.move(Direction.WEST);
			break;
		case KeyEvent.VK_D:
			character.move(Direction.EAST);
			break;
		}
		if (mouse != null){
			character.mouseRotation(mouse);
		}
	}
	
	public void mouseMoved(MouseEvent e){
		if (e != null){
			mouse = e;
			character.mouseRotation(mouse);
		}
	}
}
