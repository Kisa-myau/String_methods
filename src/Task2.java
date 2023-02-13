import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь до некоторого файла");
        String n = in.nextLine();

        if (n.endsWith("/")|| n.endsWith("\\"))
            System.out.println("Введен некорректный путь до файла.");
        else {
            if (n.contains("/")) {
                int index1 = n.lastIndexOf('/');
                String road1 = n.substring(0, index1 + 1);
                String fileName1 = n.substring(index1 + 1);
                System.out.println("Путь: " + road1);
                System.out.println("Имя файла: " + fileName1);
            }
            if (n.contains("\\")) {
                int index2 = n.lastIndexOf('\\');
                String road2 = n.substring(0, index2 + 1);
                String fileName2 = n.substring(index2 + 1);
                System.out.println("Путь: " + road2);
                System.out.println("Имя файла: " + fileName2);
            }
        }
    }
}
