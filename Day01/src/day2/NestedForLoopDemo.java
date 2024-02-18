package day2;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// program to print the multiplication tables in a given range by using nested
				// for loop
				int beg=10;
				int end=12;

				for (int i = beg; i <= end; i++) {
					for (int j = 1; j <= 20; j++) {
						System.out.println(i + "*" + j + "= " + i * j);
					}
					System.out.println("this is tables");

				}
	}

}
