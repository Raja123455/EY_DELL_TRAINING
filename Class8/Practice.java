package Class8;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you name");

		String yourName = sc.next();

		int count = 0;

//        char elementAtFifthIndex= str.charAt(5);

//        System.out.println(elementAtFifthIndex);

		System.out.println("Which Char want to search");

		char charToSearch = sc.next().charAt(0);

		for (int i = 0; i < yourName.length(); i++)

		{

			if (yourName.charAt(i) == charToSearch)

			{

				count++;

			}

		}

		System.out.println("Count of" + count);

	}

}