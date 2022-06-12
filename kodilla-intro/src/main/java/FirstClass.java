public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,1000, 2005);
        System.out.println("notebook.weight: " + notebook.weight + ", notebook.price: " + notebook.price );
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkWorth();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + ", heavyNotebook.price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkWorth();

        Notebook oldNotebook = new Notebook(1200, 500, 2020);
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + ", oldNotebook.price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkWorth();

        Notebook newNotebook = new Notebook(600, 900, 2022);
        System.out.println("newNotebook.weight: " + newNotebook.weight + ", newNotebook.price: " + newNotebook.price);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkWorth();
    }
}
