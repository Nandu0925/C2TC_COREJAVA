package com.jspider.ArrayOfObjects;

public class Mainclass2 {
	public static void main(String[] args) {
		Nanda[] n=new Nanda[3];
		n[0]=new Nanda(1, "nanda", "tirupati");
		n[1]=new Nanda(2, "kumar","kalhasti");
		n[2]=new Nanda(3, "kishore", "talakona");
		
		System.out.println("arraysize: "+n.length);
		System.out.println("Sid\tSname\tLoc");
		System.out.println("--------------------------------------");
		
		for(int i=0;i<n.length;i++) {
			if(n[i].loc.equalsIgnoreCase("tirupati")||n[i].loc.equalsIgnoreCase("kalhasti"))
			System.out.println(n[i].sid+"\t"+n[i].sname+"\t"+n[i].loc);
		}
		
		
	}

}
