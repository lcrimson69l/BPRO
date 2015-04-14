public class Perkalian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, j = 1, hasil;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                hasil = i * j;
                System.out.print(i + "x" + j + "="  + hasil +" ");
				if ( hasil <= 9) ; {
					System.out.print(" ");
				}
				if ( j == 10 ) {
					System.out.println(" ");
				}
            }
        }
    }
}
