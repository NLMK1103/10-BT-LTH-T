package bt.lthđt.pkg19.pkg02.pkg2023;
    import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        do{
            System.out.println("nhap so nguyen a: ");
            a = input.nextInt();
            if(a<=0){
                System.out.println("loi!!! vui long nhap lai!!!!");
            }
        }while(a<=0);
        int i= (int) Math.sqrt(a);
        if(a==i*i){
           System.out.println(a+" la so chinh phuong");
        }
        else{
            System.out.println(a+"a khong la so chinh phuong");
        }
    }
}
