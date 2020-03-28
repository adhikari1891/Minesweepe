package Minsweeper;

import java.awt.Dimension;
import java.util.Random;

public class App{
	public static void main(String[] args) {
		minView mv=new minView();
		minModel mm=new minModel();
		minController mc=new minController(mv,mm);
		mv.setVisible(true);
		
	}
}