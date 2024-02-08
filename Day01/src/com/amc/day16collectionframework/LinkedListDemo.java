package com.amc.day16collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Queue que=new LinkedList();
		
		for(int i=0;i<5;i++) {
			que.add(i);
			
		}
		System.out.println("elememnts in the queue:" +que);
		boolean re=que.remove(4);
		System.out.println("element remove:"+re);
		System.out.println(que);
		int s=que.size();
		System.out.println("size of queue:"+s);
		int head=(int) que.peek();
		System.out.println(head);
		System.out.println(que);
		int i=(int) que.poll();
		System.out.println(i);

	}

}
