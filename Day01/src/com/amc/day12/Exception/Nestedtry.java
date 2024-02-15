package com.amc.day12.Exception;
public class Nestedtry {
	public static int divide(int x,int y) {
		int z=x/y;
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int x,y,z;
    	  x=5;
    	  y=0;
    	  try {
    		  z=divide(x,y);
    	  }catch(ArithmeticException ex){
    		  System.out.println("Arithmetic exception occured:"+ex.getMessage());
//    		  e.printStackTrace();
    	  }
      }catch(Exception e) {
    	  System.out.println("Super class  exception occured:"+e.getMessage());
      }
	}
}
	
		



