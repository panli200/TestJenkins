import java.util.Scanner; 

public class Demo{
    public static void main (String [] args){
        System.out.println("Please enter the two int:");

        Scanner input = new Scanner (System.in);

        int first = input.nextInt();
        int second = input.nextInt();

        Sum sum = new Sum(first,second);
        
        System.out.println(sum.getSum());
    

    }
}