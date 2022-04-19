package dsaA;

public class Pattern {

	public static void main(String[] args) {
		
 		//pattern5formula2(5);
		//pattern8();
		//pattern8();
		//practicePattern();
		//pattern0();
		//pattern3();
		patterncombined();
		

	}
	
	static void patterncombined() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern6() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		}
	
	
	static void pattern7() {
		int n = 5;
		int i,j;

		for (i = 1; i <= n; i++) {

			for (j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			for (j = 1; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern8() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("*  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void pattern9() {
		int n = 5;
		int i,j;

		for (i = 1; i <= n; i++) {

			for (j = i; j <= n; j++) {
				System.out.print("*  ");
			}
			for (i = 1; i <= n; i++) {

				for (j = i; j <= n; j++) {
					System.out.print("*  ");
				}
				
			}
			System.out.println();
			i=1;
			for (j = 1; j <= i; j++) {
				System.out.print("  ");
					
			}
			
		}
	}
	
	
	
	static void pattern10() {
		int n = 5;
		int i,j;

		for (i = 1; i <= n; i++) {

			for (j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			for (j = 1; j < i; j++) {
			System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}
	
	static void practicePattern() {
		int n = 5;
		int i,j;
		for (i = 1; i <= n; i++) {
			for (j = 5; j <= i; j++) {
			System.out.print("* ");
			}
		}
		System.out.println();
		}
	
	
	
	static void pattern1() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			System.out.print("* ");

		}
	}

	static void pattern2() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern0() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern4() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern5() {
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		}
		
	
	
	static void pattern5formula(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int ColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < ColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	
	static void pattern5formula2(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int ColsInRow;
            if(row > n) {
            	ColsInRow=2 * n - row; 
            }else {
            	ColsInRow=row;
            }
            for (int col = 0; col < ColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

	static void pattern20() {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	 static void pattern8(int n) {
	        for (int row = 0; row < 2 * n; row++) {
	            int totalColsInRow = row > n ? 2 * n - row: row;

	            int noOfSpaces = n - totalColsInRow;
	            for (int s = 0; s < noOfSpaces; s++) {
	                System.out.print(" ");
	            }

	            for (int col = 0; col < totalColsInRow; col++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }

	    
}
