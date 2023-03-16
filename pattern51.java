
public class pattern51 {

	public static void main(String[] args) {
		//wrong output
		int num=0;
		
		for (int i = 0; i < 6; i++) {
			
			if(i<=4)
			num++;
			else
			num--;
			for (int j = 0; j < 9; j++) {
				if (j+i<=4) {
					System.out.print(num+" ");
					}
				else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
	}

}