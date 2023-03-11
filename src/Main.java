import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("dizinin eleman sayısını giriniz : ");
        int elemanSayisi = input.nextInt();

        double[] list = new double[elemanSayisi];
        double sum = 0;
        for(int i = 0; i<list.length; i++){
            System.out.print("dizinin "+i+". elemanını giriniz : ");
            list[i] = input.nextInt();

            sum += 1/(list[i]);
        }

        System.out.print("oluşturulan dizi : [ ");

        for(double sayi: list){
            System.out.print(sayi+" ");
        }

        System.out.print("]");
        System.out.println("\nSayıların harmonik serisi : "+sum);
        System.out.println("Sayıların harmonik ortalaması : "+elemanSayisi/sum);

    }
}
