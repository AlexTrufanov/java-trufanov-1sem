package arrays;


import java.util.Arrays;

public class ArraysTasks {
    public static void main(String[] args){
        System.out.println((Arrays.toString(evens(10))));
        int[] prov = new int[]{1, 2, 3, 2};
        System.out.println(hasSimilar(prov));
        System.out.println(averageofall(prov));
    }
    public static int[] evens(int n) {
        int[] a = new int[n / 2 ];
        int b = 0;
        for (int i = 2; i <= n; i++){
            if ((i % 2) == 0){
                a[b] = i;
                b++;
            }
        }
        return a;
    }

    public static boolean hasSimilar(int[] array){
        for (int a = 0; a <= array.length; a++){
            for (int b = 0; b <= array.length; b++){
                if(array[a] == array[b])
                    return true;
            }
        }
        return false;
    }

    public static int averageofall(int[] array){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            avg = sum / array.length;
        }
        return avg;
    }
}
