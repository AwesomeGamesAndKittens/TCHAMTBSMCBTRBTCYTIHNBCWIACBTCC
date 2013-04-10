package the_crazy_and_hillarious_adventures_of_morten_thor_or_birger_in_search_of_his_missing_cat_bob_thats_right_bob_the_cat_yup_that_is_his_name_bob_the_cat_who_is_a_cat_cat;

import java.awt.Color;

import acm.graphics.GPolygon;

public class Dude extends GPolygon {

	private double direction;
	private double speed;

	public Dude() {
		direction = 9;
		speed = 10;
		for (int c = 0; c < 360; c += 360 / 4) {
			addPolarEdge(15, c);
			setFillColor(Color.pink);
			setFilled(true);
		}
	}

	public void move(Direction dir) {
		move(speed * dir.dx(), speed * dir.dy());
	}
}
