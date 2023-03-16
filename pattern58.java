
public class pattern58 {

	public static void main(String[] args) {
int num=0;
		
for (int i = 0; i < 9; i++) {
			num=1;
			for (int j = 0; j < 5; j++) {
				if (j+i<=4 || j-i<=-4) {
					System.out.print(num);
					num++;
					}
				else {
					System.out.print(" ");					
				}
			}
			System.out.println();

	}

}
	}