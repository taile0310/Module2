import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập tên");
        String name = scanner.nextLine();

        System.out.println("Hello: " + name);
    }
}
