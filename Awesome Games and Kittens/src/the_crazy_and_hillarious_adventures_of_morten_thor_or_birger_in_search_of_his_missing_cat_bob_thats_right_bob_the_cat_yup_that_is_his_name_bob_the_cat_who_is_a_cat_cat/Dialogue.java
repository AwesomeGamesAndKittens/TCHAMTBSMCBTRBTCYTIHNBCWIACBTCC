package the_crazy_and_hillarious_adventures_of_morten_thor_or_birger_in_search_of_his_missing_cat_bob_thats_right_bob_the_cat_yup_that_is_his_name_bob_the_cat_who_is_a_cat_cat;



import acm.io.IODialog;
import acm.program.GraphicsProgram;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Dialogue extends GraphicsProgram {

	ArrayList<ArrayList<String>> strings = new ArrayList<ArrayList<String>>();
	int dialogueNr = 0;

	public Dialogue (String filePath)	{

		InputStream    fis = null;
		BufferedReader br;
		String         line;

		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		br = new BufferedReader(new InputStreamReader(fis));
		ArrayList <String> temp = new ArrayList<String>();
		try {
			while ((line = br.readLine()) != null) {
				if (line.equals("---")){
					strings.add (new ArrayList<String> (temp));
					temp.clear();
				}else {
					temp.add (line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String toString (){
		if (!strings.get(dialogueNr).isEmpty()){
			return (strings.get(dialogueNr).remove((int) Math.round(Math.random() * (strings.get(dialogueNr).size() - 1))));			
		}
		else return ("Shut up!!");
	}
}