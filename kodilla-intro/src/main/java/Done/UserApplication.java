public class UserApplication {
    public static void main(String[] args) {
        UserDetails user = new UserDetails("Adam", 40.5, 178);
        user.ifOlderAndTaller();
    }
}
