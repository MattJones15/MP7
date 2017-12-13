import java.util.Scanner;

public class GroceryStore{
	
	
	
	public static void main(String args[]) {
		
		int items;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many groceries are we getting?");
		items = scan.nextInt();
		String[] GroceryList = new String[items];
		
		for (int count = 0; count<items;count++) {
			System.out.println("Input item" + (count+1));
			GroceryList[count] = scan.next();
		}
		
		String[] Meijer = {"chips","pretzels","bananas","cereal","granola","candy","chocolate","milk","orange-juice",
				"steak","cake","cookies","bread"};
		String[] Schnucks = {"deli-meat","olives","carrots","granola","chocolate","milk","apple-juice",
				"chicken", "turkey","hotdogs","beer","wine","donuts",};
		String[] Aldi = {"grapes","pretzels","bananas","olives","carrots","granola","chocolate","olive-oil",
				"oranges","lettuce","spinach","tomatos","peppers"};
		
		int countM = 0;
		int countS = 0;
		int countA = 0;
		
		for (int j = 0; j<GroceryList.length; j++) {
			for (int k = 0; k<Meijer.length; k++) {
				if (GroceryList[j].equals(Meijer[k])) {
					countM++;}
			}
		}
		for (int j = 0; j<GroceryList.length; j++) {
			for (int k = 0; k<Schnucks.length; k++) {
				if (GroceryList[j].equals(Schnucks[k])) {
					countS++;}
			}
		}
		for (int j = 0; j<GroceryList.length; j++) {
			for (int k = 0; k<Aldi.length; k++) {
				if (GroceryList[j].equals(Aldi[k])) {
					countA++;}
			}
		}
		
		
		System.out.println("Meijer " + countM);
		System.out.println("Schnucks " + countS);
		System.out.println("Aldi " + countA);
	}
}