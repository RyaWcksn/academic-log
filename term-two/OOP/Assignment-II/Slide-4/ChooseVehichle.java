import java.util.Scanner;

class ChooseVehicle {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Vehicle Chooser =====\t");
        System.out.println("== 1. Pesawat Terbang \t==");
        System.out.println("== 2. Kereta Api \t\t==");
        System.out.println("== 3. Bus   \t\t\t==");
        System.out.println("== 4. Taksi \t\t\t==");
        System.out.println("== 5. Mobil \t\t\t==");
        System.out.println("== 6. Motor \t\t\t==");
        System.out.println("===== Vehicle Chooser =====\t\n");

        System.out.print("pilih kendaraan\t:");
        int userInput = input.nextInt();
        String result = null;

        switch (userInput) {
            case 1:
                result = "Naik Pesawat Terbang";
                break;
            case 2:
                result = "Naik Kereta Api";
                break;
            case 3:
                result = "Naik Bus";
                break;
            case 4:
                result = "Naik Taksi";
                break;
            case 5:
                result = "Naik Mobil";
                break;
            case 6:
                result = "Naik Motor";
                break;
            default:
                result = "Anda salah memilih";
        }

        System.out.println(result);
    }
