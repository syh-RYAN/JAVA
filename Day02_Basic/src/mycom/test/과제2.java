package mycom.test;

import java.util.Arrays;

public class 과제2 {
	public static void main(String[] args) {
		String[] pocket = {"paper","money","collphone"};
		String stringToSearch = "money";
		boolean card = true;
		
		/*
		 * for(String str : pocket) { if(str.equals("money")) {
		 * System.out.println("pass"); }else { System.out.println("카드를 꺼내라"); } }
		 */
		if (Arrays.asList(pocket).contains(stringToSearch)|| card) {
			System.out.println("택시를 타고가라");
		}else {
			System.out.println("걸어가라");
		}
	}
};
