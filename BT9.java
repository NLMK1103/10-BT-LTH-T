package bt.lthđt.pkg19.pkg02.pkg2023;
    import java.util.Scanner;
public class BT9 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, n, i, xoa;
        int dem = 0;
        int tam =0;
        do{
            System.out.print("Nhap so luong phan tu: ");
            n = input.nextInt();
            if(n<0){
                 System.out.println("loi!!! nhap lai!!!!!");
            }
        }while(n<0);
        System.out.println("Nhap cac phan tu: ");
         double[] a = new double [n];
        for (i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu a[" + i + "]: ");
            a[i] = input.nextDouble();
        }
        for(i=0;i<(n-1);i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tam= (int) a[i];
                    a[i]=a[j];
                    a[j]=tam;
                }
            }
        }
        
        System.out.print("Phan tu can xoa: ");
        xoa = input.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == xoa) {
                for (int j = i+1; j < (n - 1); j++) {
                a[j] = a[j + 1];
                }
                dem++;
                break;
            }
        }
        
        if (dem == 0) {
            System.out.print("Khong hop le, hay nhap lai");
        }   
        else {
            System.out.print("Da xoa thanh cong");
            System.out.println("Sau khi xoa: ");
            for (i = 0; i < (n - 1); i++) {
                System.out.print(a[i] + " ");
            }
        } 
     }
}
