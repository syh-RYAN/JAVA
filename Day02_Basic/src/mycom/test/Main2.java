package mycom.test;

public class Main2 {
	public static void main(String[] args) {
		int i=0;
		double d=17.5;
		
		double result = 0.0;
		
		result = i; //double = int; (암묵적 형변환을 지원)
		
		//i = (int)result; // int(4b) = result(8b)
		
		i = (int)d;
		
		System.out.println("result="+i);
		
		int ch = 'c'; //문자 --> 숫자
		
		System.out.println(ch);
		
		ch = 0;
		//형변환 - 논리형을 제외한 7가지 기본자료형에 대해 암묵적 형변환, 명시적 형변환을 지원함
		
		//System.out.println("result="+result);
	}

};
