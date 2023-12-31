package com.core.MultiThreading;

public class SynchronizedBlockEx {

	public static void main(String[] args) {
		Tables obj = new Tables();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.printTable(12);
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.printTable(14);
			}
		};
		Thread t3 = new Thread() {
			@Override
			public void run() {
				obj.printTable(19);
			}
		};
		t3.start();
		t2.start();
		t1.start();
		
	}

}

class Tables {
	
	public void printTable(int num){
		synchronized(this) {
			for(int k=1;k<=10;k++) {
				System.out.println(num+"*"+k+" = "+(num*k));
			}
		}
		
	}
}
