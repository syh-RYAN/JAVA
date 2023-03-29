package mycom.test;

public class Main3 {
	public static void main(String[] args) {
		//돈이 3000원 이상 있나 카드가 있다면 택시를 타고가라!!!!!
		//문제가 주어졌을때 데이터를 먼저 구해야한다
		
 		int money = 2000;
		boolean card = true;
		
 	/*	if(money>=3000) { 
			System.out.println("money : 택시를 타고 가라!");
		}else {
			if(card == true) {
				System.out.println("card : 걸어가라!!");
			}else {
				System.out.println("걸어가라!");	
			}*/
		
		
		if (money >=3000 || card) {
			System.out.println("택시를 타고 가라!!");
		}else {
			System.out.println("걸어가라");
		}
	}

};
