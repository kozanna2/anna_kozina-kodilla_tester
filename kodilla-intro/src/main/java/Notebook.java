public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This laptop is very cheap.");
        }else if(this.price>=600 && this.price<=1000){
            System.out.println("This price is good.");
        }else{
            System.out.println("This laptop is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This laptop is light.");
        } else if (this.price >= 1000 && this.price <= 1500) {
            System.out.println("This weight is ok.");
        } else {
            System.out.println("This laptop is heavy.");
        }
    }
    public void checkWorth() {
        if (this.year>2017) {
            if(this.year>=2017 && this.year<=2020 && this.price<600) {
                System.out.println("It's a good choice.");
            }else if (this.year>2020 && this.price<600) {
            System.out.println("It's a bull's eye!");
            }else{
                System.out.println("it's good equipment for years.");
            }
        }else{
            System.out.println("It is not worth buing this laptop.");
        }
    }
}
