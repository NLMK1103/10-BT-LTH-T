package bt.lthđt.pkg19.pkg02.pkg2023;
    import java.util.Scanner;
public class BT3 {
    public static void main(String[] args){
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
}
