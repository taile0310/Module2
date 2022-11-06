import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dollar to be exchanged");
        int dola = scanner.nextInt();

        int rate = 23000;

        int vnd = dola * rate;

        System.out.println("dollars after exchange is: " + vnd + "VND");

    }
}
