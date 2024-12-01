package day1;

import java.util.Scanner;

public class Datevalidornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dd,mm,yy");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		if(dd<1||dd>31||mm<1||mm>12||yy<1) {
			System.out.println("invalid");
		}
		else if((mm==4||mm==6||mm==9||mm==11)&&dd>30) {
			System.out.println("invalid");
		}
		else if(!(yy%4==0&&yy%100!=0||yy%400==0)&&mm==2&&dd>28) {
			System.out.println("invalid");
		}
		else if((yy%4==0&&yy%100!=0||yy%400==0)&&mm==2&&dd>29) {
			System.out.println("invalid");
		}
		else {
			System.out.println("valid");
		}

	}

}
