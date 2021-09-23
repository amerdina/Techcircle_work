package day7whileloop;

public class WhileLoop2 {

	public static void main(String[] args) {
//		int i = 10;
//		do{
//			System.out.println(i);
//			i--;
//			
//		}while(i<1);
//		System.out.println(i);

		// for(int count=20;count<=30;count++) {
		// System.out.println(count);
		// System.out.println("done");

//		int x = 20;
//		while (x <= 30) {
//			System.out.println(x);
//			x++;

		int sum = 0;
	
		for (int count = 1; count <= 100; count++) {
			System.out.println(count);
			sum = count + sum;
			System.out.println(sum);
		}

		System.out.println(sum);

	}
}
