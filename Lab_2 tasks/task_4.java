import java.util.Scanner;
public class task_4{
    public static void main(String []  args){

        Scanner a = new Scanner(System.in);
        int [] arr = {2,4,5,3,6,32,78,6,54,9,8,12};
        System.out.println("Enter start number:");
        int s = a.nextInt();
        System.out.println("Enter end number:");
        int e = a.nextInt();
        System.out.println("enter increment:");
        int  I = a.nextInt();
        for(int i = s; i < e; i+=I)
            System.out.println(arr[i]);

        }

    }
