import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the number");
        int n= sc.nextInt();
        if(n%5==0 && n%11==0)
        {
            System.out.println("The number is divisble by 5 and 11 ");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11");
        }
        
        
    
    }
}
