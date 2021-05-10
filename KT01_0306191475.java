/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0306191467;
import java.util.Scanner;
/**
 *
 * @author ThomDoan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int n;
        Scanner input = new Scanner(System.in);  
        
        //Bai 1
        System.out.println("Bai 1");
        System.out.print("Nhap so luong phan tu: ");
        n = input.nextInt();
        int[] A;
        A= new int[n];
        A = TaoMang(n,1,50);
        XuatMang(n , A);
        System.out.println("Tong so nguyen to la: "+TongSNT(n,A));
        for(int i = 0; i < 8;i++)
            System.out.print("- ");
       
        
        
        // Bai 2
        System.out.println("Bai 2:");
        do
        {
            System.out.print("Nhap N: ");
            n = input.nextInt();
            if(n < 10 || n > 100)
                System.out.println("Loi roi! Vui long nhap lai n");
        }while (n < 10 || n > 100);
        int [] B;
        B = new int[n];
        B = TaoMang(n,5,30);
        XuatMang(n,B);
        int Tong = TongSNT(n, B);
        System.out.println("Tong So nguyen to la: " + Tong);
        int dem = 0;
        for (int i = 1; i < Tong ;i++)
            if (Tong % i == 0)
                dem++;
        if (dem == 1)
            System.out.println("Tong La so nguyen to");
        else
            System.out.println("Tong Khong phai so nguyen to");
                
        
  
    }
    public static int TaoSoNgauNhien(int min, int max)
    {
        return (int)(Math.random() * ( max - min + 1)+ min);
    }
    public static int[] TaoMang(int n,int max, int min)
    {
        int []a= new int[n];
        for(int i = 0;i < n;i++)
        {
            a[i]=TaoSoNgauNhien(min,max);
        }
        return a;
    }
    public static void XuatMang(int n, int[] a)
    {
        for (int i = 0;i < n;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println();
            
    }
    public static int TongSNT(int n, int []a)
    {
        int tong = 0;
        for (int i = 0;i < n;i++)
        {
            int dem =0;
            for(int j = 1;j < a[i];j++)
                if (a[i] %j == 0)
                    dem++;
            if (dem == 1 )
                tong += a[i];
        }
        return tong;
    }
    
    
}
