package org.qa;

import java.util.Iterator;

import org.qa.menu.Menu;
import org.qa.menu.menuOptions;
import org.qa.utils.UserInput;

public class Runner {
	public static void main(String[] args) {
//		Menu menu = new Menu();
//		menu.start();
		UserInput input = UserInput.getInstance();
		menuOptions.printActions();
		menuOptions choice = menuOptions.pickOption(input);
		
		System.out.println(choice);
	}
}
