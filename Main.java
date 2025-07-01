import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int var[] = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            var[i] = sc.nextInt();
        }
        Arrays.sort(var);
        for(int i=0;i<n;i++){
        System.out.print(var[i]+" ");

}
 

          }
        }
