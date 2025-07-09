import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width, height, area, circumference;

        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();

        System.out.print("Nhập chiều cao: ");
        height = sc.nextFloat();

        // chu vi va dien tich
        area = width * height; 
        circumference = 2 * (width + height);

        System.out.println("Diện tích hình chữ nhật là: " + area);
        System.out.println("Chu vi hình chữ nhật là: " + circumference);

        sc.close();
    }
}
