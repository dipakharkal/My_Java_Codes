

public class pattern71 {

	public static void main(String[] args) {

		int num = 0;
		for (int i = 0; i < 9; i=i+2) {
			num = 1;
			for (int j = 0; j < 9; j++) {
				if (j - i <= 0) {

					System.out.print(num);
					if (j < i / 2)
						num++;
					else
						num--;
				}

			}
			System.out.println();

		}

	}

}
