package mycom.test;

import java.util.Arrays;

public class 과제1 {
	public static void main(String[] args) {
		String[] pocket = {"paper","money","collphone"};
		String stringToSearch = "money";
		
		/*
		 * for(String str : pocket) { if(str.equals("money")) {
		 * System.out.println("pass"); }else { System.out.println("카드를 꺼내라"); } }
		 */
		if (Arrays.asList(pocket).contains(stringToSearch)) {
			System.out.println("pass");
			
		}else {
			System.out.println("카드를 꺼내라");
		}
	}
};
