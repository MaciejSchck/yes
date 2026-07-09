import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Macirz macirz = new Macirz();

        macirz.setMacirzLength(fetchUserLengthInput());
        macirz.setMacirzWidth(fetchUserWidthInput());
        macirz.createMacirz();
        macirz.executeUserOperationChoice(fetchUserOperationChoice());
    }

    public static int fetchUserLengthInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows u want?");
        return scanner.nextInt();
    }

    public static int fetchUserWidthInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many columns u want?");
        return scanner.nextInt();
    }

    public static int fetchUserOperationChoice() {
        Scanner scanner = new Scanner(System.in);
        int response;
        System.out.println();
        System.out.println("Whacha finna do with it?" + "\n" + "Yo options are:" + "\n" + "1 - invert diagonally to the right" + "\n" + "2 - invert diagonally to the left" + "\n" + "3 - invert horizontally" + "\n" + "4 - invert vertically");
        response = scanner.nextInt();
        if (response == 1 || response == 2 || response == 3 || response == 4) {
            return response;
        }
        else {
            System.out.println();
            System.out.println("U blind? Choose a number between 1 and 4.");
            return fetchUserOperationChoice();
        }
    }
}
