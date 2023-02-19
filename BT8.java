package bt.lthđt.pkg19.pkg02.pkg2023;
    import java.util.Scanner;
public class BT8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n=0;
       int i=1;
       int s=1;
       do{
            System.out.println("nhap so : ");
             n=input.nextInt();
             if(n<0){
                 System.out.println("loi!!! vui long nhap lai!!!");
             }
       }while(n<0);
       if(n==0){
           s = 1;
       }
       else{
           do{
           s=n*i;
           i++;
       }while(i<=n);
       }
       System.out.println(n+"! = "+s);
   }
}
