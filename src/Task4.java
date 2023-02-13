import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String n = in.nextLine();
        StringBuilder sb = new StringBuilder(n);
        n= n.replaceAll("\\D+",""); // так можно оставлять в строке только цифры, используя регулярное выражение для String
        //System.out.println(n);
        StringBuilder myNumbers = new StringBuilder();
        for (int index = 0; index < sb.length(); index++) {
            if (Character.isDigit(sb.charAt(index)))
                myNumbers.append(sb.charAt(index));
        }
        System.out.println("Your numbers: " + myNumbers.toString());

    }
}
