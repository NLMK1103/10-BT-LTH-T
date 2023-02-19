package bt.lthđt.pkg19.pkg02.pkg2023;
        import java.util.Scanner;
public class BT2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Giai PT bac 2: y=ax^2+bx+c");
        System.out.print("nhap gia tri a: ");
        float a = input.nextFloat();
        System.out.print("nhap gia tri b: ");
        float b = input.nextFloat();
        System.out.print("nhap gia tri c: ");
        float c = input.nextFloat();
        if(a==0){
            System.out.println("PT thanh bac 1!!");
            if(b==0){
            if(c==0){
                System.out.println("PT VSN!!");
            }
            else{
                System.out.println("PT VN!!");
            }   
        }
        else{
            System.out.println("nghiem cua PT la : " + (-c/b));
        }
        }
       float delta = b*b - 4*a*c;
        float x1,x2,x;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("PT co 2 nghiem la:"+x1+" va "+x2 );
        } else if (delta == 0) {
            x=(-b / (2 * a));
            System.out.println("PT co nghiem Kep: " + x);
        } else {
            System.out.println("PT VN!!");
        }
    }
}
