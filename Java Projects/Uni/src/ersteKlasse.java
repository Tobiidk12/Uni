import java.util.Arrays;

public class ersteKlasse {

    public ersteKlasse(){

    }


    public static void ersteMethode(){
        int[] arr= new int[]{1,2,3,4,5,6};
        Arrays.fill(arr,18);
        for (int array : arr){
            System.out.println(array);
        }


    }


}
