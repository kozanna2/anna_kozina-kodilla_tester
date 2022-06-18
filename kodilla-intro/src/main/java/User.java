public class User {
    String imie;
    int wiek;

    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public static void main(String[] args) {
        User anna = new User("Anna", 8);
        User joanna = new User("Jonna", 10);
        User kasia = new User("Kasia", 9);
        User andrzej = new User("Andrzej", 7);
        User robert = new User("Robert", 8);
        User basia = new User("Basia", 11);
        User michal = new User("Michal", 10);
        User dawid = new User("Dawid", 7);
        User zosia = new User("Zosia", 9);
        User hania = new User("Hanna", 11);

        User[] user = {anna, joanna, kasia, andrzej, robert, basia, michal, dawid, zosia, hania};


        int result = 0;
        for (int i = 0; i < user.length; i++) {
            result = result + user[i].wiek;
        }
        int srednia = result / user.length;

        for (int i = 0; i < user.length; i++) {
            if (user[i].wiek < srednia) {
                System.out.println(user[i].imie);
            }
        }
    }
}
