public class LeapYear {
    public static void main(String[] args) {
        int rok = 1933;
        int reszta4 = rok % 4;
        int reszta100 = rok % 100;
        int reszta400 = rok % 400;

        if (reszta4 == 0) {
            if (reszta100 == 0) {
                if (reszta400 == 0) {
                    System.out.println("Rok " + rok + " jest przestępny!");
                } else {
                    System.out.println("Rok " + rok + " nie jest przestępny!");
                }
            } else {
                System.out.println("Rok " + rok + " jest przestępny!");
            }
        } else {
            System.out.println("Rok " + rok + " nie jest przestępny!");
        }
    }
}