package bt.lthđt.pkg19.pkg02.pkg2023;
   import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giai PT bac 1 y=ax+b");
        System.out.println("nhap gia tri a: ");
        float a= input.nextFloat();
        System.out.println("nhap gia tri b: ");
        float b= input.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("PT VSN!!");
            }
            else{
                System.out.println("PT VN!!");
            }   
        }
        else{
            System.out.println("nghiem cua PT la : " + (-b/a));
        }
    }
}
