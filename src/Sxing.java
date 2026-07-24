import java.util.Scanner;
public class Sxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr =new int[n][m];
            int num = 1;
            for(int i = 0;i < n ;i++){
                if(n%2==0){
                    for(int j = 0;j<m;j++) {
                        arr[i][j] = num++;
                    }
                }else{
                    for(int j = m-1;j>=0;j--){
                        arr[i][j]=num++;
                    }
                }

            }
            for(int i = 0;i < n ;i++){
                for(int j = 0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
