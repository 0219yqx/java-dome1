import java.util.Scanner;
public class shexing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]arr =new int[n][m];
            int []dx = {0,1,0,-1};
            int []dy = {1,0,-1,0};
            int x = 0;
            int y = 0;
            int dir = 0;
            for(int i =1;i<=n*m ;i++){
                arr[x][y]=i;
                int nextX = x+dx[dir];
                int nextY = y+dy[dir];
                if(nextX<0||nextX>=n||nextY<0||nextY>=m||arr[nextX][nextY]!=0){
                    dir=(dir+1)%4;
                    nextX=x+dx[dir];
                    nextY=y+dy[dir];
                }
                x=nextX;
                y=nextY;
            }
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}