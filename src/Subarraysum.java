import java.util.Scanner;

public class Subarraysum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();

        int array[]=new int[size];
        array[0]=scan.nextInt();
        int sum=array[0];
        for (int i=1;i<size;i++){
            array[i]=scan.nextInt();
            array[i]=array[i]+array[i-1];
            sum=sum+array[i];

        }
        for(int i=1 ;i<size;i++){
            for (int j=i;j<size;j++){
                sum=sum+array[j]-array[i-1];

            }
        }
        System.out.println(sum);

    }
}
