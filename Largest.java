public class Main{
    public static void main(String [] args){
        int a =10;
        int b=100,c=80;
        int max = a;
        System.out.println("Largest number ");
        if(a>b&& a>c){
            
            System.out.println("Largest number is : "+max);
            
        }
        else if(b>a&& b>c){
            max = b;
            System.out.println("Largest number is : "+max);
        }
        else{
            max= c;
            System.out.println("Largest number is : "+max);
        }
    }
}
