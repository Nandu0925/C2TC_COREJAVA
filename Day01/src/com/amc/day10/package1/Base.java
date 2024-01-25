package com.amc.day10.package1;

public class Base {
	//declaring variables with private,default,protected and public access modifiers
	private int varPrivate=10;
	int varDefoult=20;
	protected int varProtected=30;
	public int varPublic=40;
	
	@SuppressWarnings("unused")
	private void methodPrivate() {
		System.out.println("private variable:"+varPrivate );
	}
	void methodDefoult() {
		System.out.println("defoult variable:"+varDefoult);
		
	}
	protected void methodProtected() {
		System.out.println("protected variable:"+varProtected);
		
	}
	public void methodPublic() {
		System.out.println("public variable:"+varPublic);
	}

}
