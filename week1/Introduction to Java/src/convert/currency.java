package convert;

import java.util.Scanner;

// chuyển đổi tiền tệ
public class currency {
    public static void main(String[] args) {
double vnd = 23000;
double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền tệ usd : ");
        usd = sc.nextDouble();
        double quydoi=usd * 23000;
        System.out.print("Gía trị VNĐ:" +quydoi);
    }
}
