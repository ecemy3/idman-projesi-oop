
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman Programına Hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler...\n"
                + "Burpee\n"
                +"Pushup(Şınav)\n"
                +"Situp(Mekik)\n"
                +"Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.print("Burpee Sayısı : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squat = scanner.nextInt();

        scanner.nextLine();


        idman idmann = new idman(burpee, pushup, situp, squat);

        System.out.println("İdmanınız Başlıyor.....");

        while (idmann.idmanbitti_mi()==false)
        {

            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            idmann.hareket_yap(tur,sayi);

        }
        System.out.println("Idmanını başarıyla bitirdin....");


    }
}
