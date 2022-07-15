import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int arr[] = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        int siralama[] = Arrays.copyOf(arr, arr.length);
        System.out.println("Bir sayi giriniz : ");
        int sayi = girdi.nextInt();
        int yakinkucuk = 0, yakinbuyuk = 0;
        for (int i : arr) {
            if (i < sayi) {
                yakinkucuk = i;
            } else {
                yakinbuyuk = i;
                break;
            }
        }
        System.out.println("En yakin en kucuk sayi : " + yakinkucuk + "\n" + "En yakin en buyuk deger : " + yakinbuyuk);
    }
}
