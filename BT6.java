package bt.lthđt.pkg19.pkg02.pkg2023;
    import java.util.Scanner;
public class BT6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       float a;
       do{
            System.out.println("Diem cua HS la: ");
             a=input.nextFloat();
             if(a<0){
                 System.out.println("loi!!! vui long nhap lai!!!");
             }
       }while(a<0);
        if(0 < a && a <= 5.0){
           System.out.println("Xep loai Kem");
       }
        else if(a > 5.0 && a <= 7.0){
               System.out.println("Xep loai TB");
           }
        else if(a > 7.0 && a <= 8.0){
            System.out.println("Xep loai Kha");
        }
        else {
            System.out.println("Xep loai Gioi");
        }
    }
}
