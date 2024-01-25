package com.amc.day10.package2;

import com.amc.day10.package1.Base;

public class Exicutor2 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();
		//bOne.methodDefoult(); //not accessible outside the package
		Exicutor2 ex=new Exicutor2();
		ex.methodProtected();
		bOne.methodPublic();
		
		
	}

}
