import java.util.Scanner;
class Image{
    
    public void add(int[] arr){
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length;i++){
                arr[i][j] = arr[i][j]+ arr[i][j];
             }
        }
    }
    public void multi(int[] arr){
        int[][] res = new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                res[i][j] = 0;
                for(int k=0;k<arr.length;k++){
                   res[i][j]+=arr[i][k]*arr[k][j];
                }
                System.out.print(res[i][j]+" "); 
            }
               System.out.println();
        }

        
    }
}
public class Sample1{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    Image im = new Image();
    
    im.multi(arr);

}
