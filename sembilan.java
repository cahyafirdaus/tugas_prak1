/**
 * Created by User on 3/25/2015.
 */
public class sembilan {

    public static void main(String[] args) {
        int awal = 1;
        int akhir = 110;
        for(awal=1; awal<=110; awal++){
            if(awal % 5 == 0){
                System.out.print("JONI JOMBLO NGODING");
            }else {
                System.out.print(awal + " ");
            }
            if (awal%11==0){
                System.out.print("\n");
            }
        }
    }
}
