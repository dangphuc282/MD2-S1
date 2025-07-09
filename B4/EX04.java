public class EX04 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;


        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int phanDu = a % b;

        // In kết quả ra màn hình
        System.out.println("Giá trị a: " + a);
        System.out.println("Giá trị b: " + b);
        System.out.println("Tổng của a và b: " + tong);
        System.out.println("Hiệu của a và b: " + hieu);
        System.out.println("Tích của a và b: " + tich);
        System.out.println("Thương của a chia cho b: " + thuong);
        System.out.println("Phần dư khi chia a cho b: " + phanDu);
    }
}

