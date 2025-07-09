import java.util.Scanner;
public class EX03 {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Nhap R (ban kinh hinh tron)");
        double r;
        r = sc.nextDouble();
        double dienTich;
        dienTich = Math.PI *r*r;

        System.out.println("Dien tich hinh tron co ban kinh " + r + " la " + dienTich);

        sc.close();
    }
}

