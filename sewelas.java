/**
 * Created by User on 3/25/2015.
 */
public class sewelas {

    public static void main(String[] args) {
        //variabel
        int pagar = 5;
        //proses
        for (int i = 1; i <= pagar; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            for (int j = 1; j <= pagar; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }
}
