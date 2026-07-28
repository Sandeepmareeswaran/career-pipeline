import java.util.*;
public class Stock {
          public static void main(String[] args){
                    /* in the array[1,8,7,5,4] without sorting and no other new aarray i have to get the element order as 1st max then 1min then 2nd max then 2 min like that  */
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Enter the no of elements in array: ");
                    int n=scan.nextInt();
                    int[] arr = new int[n];
                    for(int i=0;i<n;i++){
                              arr[i]=scan.nextInt();
                    }
                    int max=0;
                    int buy=arr[0];
                    for(int i=1;i<arr.length;i++){
                              int cur=arr[i]-buy;
                              max=Math.max(max,cur);
                              buy=Math.min(arr[i],buy);
                    }
                    System.out.println("Profit earned is: "+max);
          }
}
