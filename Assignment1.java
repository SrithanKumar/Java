package in.ineuron.pattern.programing;

public class Assignment1 {

	public static void main(String[] args) {
		
		int n = 15;
	
		System.out.println("1)");
		for (int i = 0; i < n; i++) {

			// j loop for letter "I"
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 || i == n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}

			System.out.print("  ");

			// j loop for letter "N"
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");

			// j loop for letter "E"
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");

			// j loop for letter "U"
			for (int j = 0; j < n; j++) {
				if (j == 0 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1 || j == n - 1 && i != n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");

			// j loop for letter "R"
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != n - 1 || j == 0 || j == n - 1 && i != 0 && i < (n - 1) / 2
						|| i == (n - 1) / 2 && j != n - 1 || i == j && i > (n - 1) / 2) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");

			// j loop for letter "O"
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0 && j != n - 1 || j == 0 && i != 0 && i != n - 1
						|| i == n - 1 && j != 0 && j != n - 1 || j == n - 1 && i != 0 && i != n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.print(" ");

			// j loop for letter "N"
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

		System.out.println("2)");
		int m = 5;
		for (int i = 1; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}

		System.out.println("3)");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i + j <= (n - 1) / 2 || j - i >= (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("4)");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == n - 1 / 2 || j >= n - 1 / 2 || i - j >= (n - 1) / 2 || i + j >= (n - 1) + (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("5)");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || i - j >= (n - 1) / 2 || i + j <= (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
