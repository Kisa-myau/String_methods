import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку, в составе которой есть символы 0 и 1 ");
        String n = in.nextLine();
        StringBuilder sb = new StringBuilder(n);
        for (int index = 0; index < sb.length(); index++) {
            if (sb.charAt(index) == '0') {
                sb.setCharAt(index, '1');
            }
            else if (sb.charAt(index) == '1') {
                sb.setCharAt(index, '0');
            }
        }
        System.out.println(sb);
    }
}
