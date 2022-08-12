package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		
		int n =21;
		for (int i = 2; i <= n; i++) { 
			int count = 0;
			for (int j = 2; j < i; j++) { 
				if (i % j == 0) {
					count=count+1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i+ "  number is prime");
			} else {
				System.out.println(i+ "  number is not prime");
			}
		}
	}

	}


