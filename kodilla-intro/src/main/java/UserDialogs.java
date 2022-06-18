import java.util.Scanner;

public class UserDialogs {
    private String letter;

    public String getLetter() {
        return letter;
    }

    public static void getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first letter of colour");
            String letter = scanner.nextLine().trim().toUpperCase();
            if (letter.length() == 1) {
                switch (letter) {
                    case "B":
                        System.out.println("This colour is blue");
                        break;
                    case "G":
                        System.out.println("This colour is green");
                        break;
                    case "Y":
                        System.out.println("This colour is yellow");
                        break;
                    case "P":
                        System.out.println("This colour is pink");
                        break;
                    default:
                        System.out.println("I don't know any colour which start with letter " + letter + " .");
                        break;
                }
                return;
            }
            System.out.println("You should write down only one letter");
        }

    }
}
