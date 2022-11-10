import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double r,pi=3.14,a,alan;

        System.out.print("Yarıçapı giriniz: ");
        r=inp.nextInt();

        System.out.print("Merkez açısını giriniz: ");
        a=inp.nextInt();

        alan=(pi*(r*r)*a)/360;
        System.out.println("Daire Dilim Alanı: "+ alan);
    }
}