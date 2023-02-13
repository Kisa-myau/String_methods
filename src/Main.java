import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String str1 = "Циклом называется многократное выполнение одних и тех же действий.";
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ, количество букв до которого нужно сосчитать");
        String n = in.nextLine();
        String newStr1 = str1.replace(" ","").replace(".","");

        int indexN = newStr1.indexOf(n);
        String str2 = newStr1.substring(0,indexN);
        int str2Lenght = str2.length();

        System.out.println("Количество букв (без пробелов и точки) в заданной строке до указанного Вами символа (не включая его) = " + str2Lenght);

    }
}