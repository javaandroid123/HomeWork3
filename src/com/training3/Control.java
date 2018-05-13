package com.training3;

import java.util.Scanner;

public class Control {
	int a;
	
	public void setData() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhập một số nguyên dương bất kỳ (>0) : ");
		a=scanner.nextInt();
	}
	
	public void showData() {
		if(a%2 != 0) {
			System.out.println(a+" là số lẽ !");
		}else {
			while(a>0) {
				a--;
				
				if(a %3 == 0 ) {
					break;
				}
				if(a != 2) {	
					continue;
				}
			}
			System.out.println("a = "+a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control	 ex1 = new Control();
		ex1.setData();
		ex1.showData();
	}

}
