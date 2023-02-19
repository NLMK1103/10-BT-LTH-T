package bt.lthđt.pkg19.pkg02.pkg2023;
import java.util.Scanner;

public class BT4 {
     public static void BT1() {
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
     public static void BT2(){
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
            System.out.println("PT có nghiem Kep: " + x);
        } else {
            System.out.println("PT VN!!");
        }
        
    }
    public static void BT3(){
        Scanner input= new Scanner(System.in);
        float sodien;
        do{
           System.out.print("nhap so dien dung trong thang: ");
           sodien = input.nextFloat();    
       }while(sodien<0); 
        if(sodien > 0 && sodien < 50){
            float tien=sodien*1000;
            System.out.println("so tien dien trong thang la: "+ tien);
        }
        else if(sodien>50) {
            float tien=50*1000+(sodien-50)*1200;
            System.out.println("so tien dien trong thang la: "+ tien);

        }
            }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("*   1:ham bac nhat                                 * ");
        System.out.println("*   2:ham bac hai                                  *");
        System.out.println("*   3:tinh tien dien                               *");
        System.out.println
        ("****************************************************");
        System.out.print("nhap so chon phuong phap: ");
        int a=input.nextInt();
        switch(a){
            case 1 -> BT1();
            case 2 -> BT2();
            case 3 -> BT3();
            default -> System.out.println("loi!! nhap lai!!!");
        }
    }
}    