
public class pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 0;

		for (int i = 0; i < 6; i++) {
			num2 = num1;
			num1++;
			for (int j = 0; j < 6; j++) {
				if (j + i <= 4) {
					System.out.print(num2++);
					// System.out.print(count);
				}
			}
			System.out.println();
		}
	}

}
