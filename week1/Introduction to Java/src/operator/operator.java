package operator;

import java.util.Scanner;

// Sử dụng toán tử
public class operator {
    public static void main(String[] args) {
         float width;
         float height;

        Scanner scanner = new Scanner(System.in);//khai báo đối tượng Scanner

        System.out.println("Enter Width : ");
        width = scanner.nextFloat();//nhập chiều rộng

        System.out.println("Enter Height");
        height = scanner.nextFloat();//nhập chiều dài
        float area = width * height;

        System.out.println(" Area is : " +area);
    }
}
