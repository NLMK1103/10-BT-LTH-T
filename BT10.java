package bt.lthđt.pkg19.pkg02.pkg2023;
    import java.util.Scanner;
public class BT10 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap ma tran vuong cap: ");
            n= input.nextInt();
            if(n<0){
                System.out.println("loi!! nhap lai!!");
            }
        }while(n<0);
        float [][] a = new float [n][n];
        System.out.println("nhap gia tri ma tran vuong");
        for(int i=0;i<n;i++){
            for(int m=0;m<n;m++){
                System.out.print( "phan tu ma tran a [" + i + "][" + m + "] ");
                a[m][i]=a[i][m]= input.nextFloat();
            }
        }
        for(int i=0; i<n ; i++){
            for (int j=0; n>j; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
