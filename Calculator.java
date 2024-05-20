import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String inputOperasi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n~~ Selamat datang di Kalkulator Sederhana! ~~");


        while (true) {
            System.out.print("Masukan bilangan pertama: ");
            // Memeriksa apakah input pertama adalah integer
            while (!scanner.hasNextInt()) {
                System.out.println("Bukan integer! \nMasukan bilangan pertama (int): ");
                scanner.next(); // Membersihkan buffer
            }
            int num1 = scanner.nextInt();

            System.out.print("Masukan bilangan kedua : ");
            // Memeriksa apakah input kedua adalah integer
            while (!scanner.hasNextInt()) {
                System.out.println("Bukan integer! \nMasukan bilangan kedua (int): ");
                scanner.next(); // Membersihkan buffer
            }
            int num2 = scanner.nextInt();

            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.print("Masukan Pilihan Anda: ");
            int input = scanner.nextInt();


            switch (input) {
                case 1:
                    System.out.println("Hasil penjumlahan " +
                            num1 +
                            " + " +
                            num2 +
                            " adalah " +
                            summary(num1, num2));
                    break;
                case 2:
                    System.out.println("Hasil pengurangan " +
                            num1 +
                            " - " +
                            num2 +
                            " adalah " +
                            subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Hasil perkalian " +
                            num1 +
                            " * " +
                            num2 +
                            " adalah " +
                            multiplication(num1, num2));
                    break;
                case 4:
                    System.out.println("Hasil pembagian " +
                            num1 +
                            " / " +
                            num2 +
                            " adalah " +
                            distribution(num1, num2));
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");

            }
                boolean stat;
                do{
                    System.out.println("Apakah anda ingin melakikan operasi lain? (yes/no)");
                    inputOperasi = scanner.next();
                    stat = !(inputOperasi.equalsIgnoreCase("no")||inputOperasi.equalsIgnoreCase("yes"));
                    if(stat){
                        System.out.println("Masukan input dengan benar!");
                    }
                }while(stat);

                if (inputOperasi.equalsIgnoreCase("yes")){
                    continue;
                }else{

                    System.out.println("\nTerimakasih telah menggunakan Kalkulator sederhana!");
                    break;
                }
            }
        }

    public static int summary(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int distribution(int num1, int num2) {
        return num1 / num2;
    }

}
