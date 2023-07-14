import java.util.Arrays;
import java.util.Scanner;

public class Even_Numbers_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        int queries= scanner.nextInt();
        int[][] query=new int[queries][2];
        for(int i=0;i<queries;i++) {
            for (int j = 0; j < 2; j++) {
                query[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(even_numbers_range(array,query)));

    }

    static int[] even_numbers_range(int[] array, int[][] query) {
        int[] result=new int[query.length];
        for(int i=0;i< query.length;i++){
            int count=0;
            int l = query[i][0];
            int r = query[i][1];
            for(int j=l;j<=r;j++){
                if(array[j]%2==0){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}
