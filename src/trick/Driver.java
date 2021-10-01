package trick;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] wasdf)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hello There!!!\nWhat is your name? ");
		String name = input.nextLine();
		
		Magician magic = new Magician(name);
		
		magic.startShow();
		
		System.out.println("Good Game!");
		System.out.println("Word");
		
	}

}
