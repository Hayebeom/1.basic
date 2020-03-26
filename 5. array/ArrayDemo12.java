package array;

import java.util.Scanner;

public class ArrayDemo12 {
	public static void main(String[] args) {
		/*
		상품명, 가격, 구매수량을 입력받아서 총 구매가격을 출력하는 프로그램
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[3];
		int[] prices = new int[3];
		int[] amounts = new int[3];
		
		// 상품명, 가격, 구매수량을 입력받음
		for (int i=0; i<names.length; i++) {
			System.out.print("상품명을 입력하세요 : ");
			String name = sc.next();
			System.out.print("가격을 입력하세요 : ");
			int price = sc.nextInt();
			System.out.print("구매수량을 입력하세요 : ");
			int amount = sc.nextInt();
			
			names[i] = name;
			prices[i] = price;
			amounts[i] = amount;
		}
		
		// 구매정보 출력
		int totalOrderPrice = 0;
		System.out.println();
		System.out.println("순번	상품명	 가격	수량	구매가격");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int j=0; j<names.length; j++) {
			System.out.print(j+1 + "\t");
			System.out.print(names[j] + "\t");
			System.out.print(prices[j] + "\t");
			System.out.print(amounts[j] + "\t");
			System.out.println(prices[j] * amounts[j]);
			
			totalOrderPrice += prices[j] * amounts[j];
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("총 구매가격	" + totalOrderPrice);
		
		sc.close();
	}
}
// 잘 소화 안됨
