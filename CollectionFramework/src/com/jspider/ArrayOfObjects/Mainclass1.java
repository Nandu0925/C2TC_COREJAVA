package com.jspider.ArrayOfObjects;

public class Mainclass1 {
	public static void main(String[] args) {
		TextBook[] books=new TextBook[5];
		books[0]=new TextBook(222, "java", "pavan", 2, 150.00);
		books[1]=new TextBook(859, "sql", "krihna", 3, 250.00);
		books[2]=new TextBook(983, "web", "Harish", 1, 100.00);
		books[3]=new TextBook(682, "lp", "Sameer", 3, 250.00);
		books[4]=new TextBook(910, "dsa", "Dharsan", 2, 350.00);
		
		System.out.println("ArraySize:"+books.length);
		System.out.println("elements of array");
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}
		System.out.println("program ends");
		
		System.out.println("Books details");
		System.out.println("-----------------------------------------------------");
		System.out.println("Id\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("------------------------------------------------------");
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i].id+"\t"+books[i].title+"\t"+books[i].author+"\t"+books[i].edition+"\t"+books[i].price);
		}
		
		
		System.out.println("Books >above 200 price");
		System.out.println("-----------------------------------------------------");
		System.out.println("Id\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("------------------------------------------------------");
		for(int i=0;i<books.length;i++) {
			if(books[i].price>200.00)
			System.out.println(books[i].id+"\t"+books[i].title+"\t"+books[i].author+"\t"+books[i].edition+"\t"+books[i].price);
		}
		
		
		
		System.out.println("Coding related Books");
		System.out.println("-----------------------------------------------------");
		System.out.println("Id\tTitle\tAuthor\tEdition\tPrice");
		System.out.println("------------------------------------------------------");
		for(int i=0;i<books.length;i++) {
			if(books[i].title.equalsIgnoreCase("java")||books[i].title.equalsIgnoreCase("lp")||books[i].title.equalsIgnoreCase("dsa"))
			System.out.println(books[i].id+"\t"+books[i].title+"\t"+books[i].author+"\t"+books[i].edition+"\t"+books[i].price);
		}
		
		

	}

}
