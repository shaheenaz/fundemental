package fundemental;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class App{
    public static void rollingDice(int n) {
        for (int i = 0; i < n; i++) {
            Random rand = new Random(); //instance of random class
            int upperbound = 6;
            //generate random values from 0-24
            int int_random = rand.nextInt(upperbound);
            int arr[] = new int[n];
            System.out.println(int_random);
        }

    }


    public static boolean containsDuplicates (int [] array){

        Set<Integer> set = new HashSet<Integer>();

        set.add(1);

        for (Integer integer : array) {
            set.add(integer);
            System.out.println(integer);
        }
        if (set.size() != array.length){
            return true;
        } else
            return false;
    }

    public static double Averages(int[] array){
        int all = 0;
        for (Integer inger : array){
            all = all+inger;

        }
        return all/(double)array.length;
    }
    

    public static int[] collection(int[] array[]){
        int avarage=0;
        int smallArr[]= new int[array[0].length];
        for (int[] inger:array){
            if (Averages(inger)<avarage){
                smallArr = inger;

            } avarage= (int) Averages(inger);

        }
        return smallArr;

    }
    
    
    //lab 3
    public static String weather(int[][] arr){
        int max = arr[0][0] ;
        int min= arr[0][0];
        HashSet<Integer> wetherCast = new HashSet<Integer>();

        for (int[] ints : arr) {
            for (int Intger : ints) {
                if (Intger > max) {
                    max = Intger;
                }
                if (Intger < min) {
                    min = Intger;
                }
                wetherCast.add(Intger);
            }
        }
        String neverShown = "";
        for (int i = min; i < max; i++) {
            if (!wetherCast.contains(i)){
                neverShown+= ("nevershowed"+i);
            }
        }

        System.out.println("max " + max);
        System.out.println("min " + min);

        return neverShown;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    





    public  static void main(String[] arg){
        rollingDice(6);
        int[] array = {1,1,3};
        System.out.println(containsDuplicates(array));
        int value = 2;
        System.out.println(Averages(array));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(Arrays.toString(collection(weeklyMonthTemperatures)));

        System.out.println(weather(weeklyMonthTemperatures));

    }
}