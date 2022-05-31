public class LeapYear2 {
    public static void main(String[] args) {
        int rok = 1953;
        if(rok%4 ==0 && rok%100!=0 || rok%400==0){
            System.out.println("Rok " + rok + " jest przestępny.");
        }else{System.out.println("Rok " + rok + " nie jest przestępny.");
        }
    }
    }
