import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin Boyutu: ");
        int n = scanner.nextInt();

        double[] list = new double[n];
        System.out.print("Dizi Elemanlarini Giriniz :");
        for (int i = 0; i < n; i++){
            list[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / list[i];
        }

        double harmonik = n / sum;
        System.out.println("Dizinin Harmonik Ortalaması :" + harmonik);
    }

}