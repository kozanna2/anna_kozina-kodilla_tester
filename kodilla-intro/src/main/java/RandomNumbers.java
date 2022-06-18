import java.util.Random;

public class RandomNumbers {
    public int[] numbers;
    public int size;

    public RandomNumbers() {
        this.numbers = new int[5000];
        this.size = 0;
    }

    public void getSumOfRandomNumbers(int max) {

        int suma = 0;
        if (this.size > 5000) {
            return;
        } else {
            while (suma < 5000) {
                Random randomGenerator = new Random();
                int randomValue = randomGenerator.nextInt(31);
                RandomNumbers object = new RandomNumbers();
                object.add(randomValue);
                suma += randomValue;
                this.numbers[this.size] = randomValue;
                this.size++;
            }
            System.out.println("Wygenerowana suma to: " + suma + ", wylosowanych zostało " + this.size + " liczb.");

        }
    }

    public void add(int value) {
        this.numbers[this.size] = value;
        this.size++;
    }

    public void searchMaximum() {
        int max = this.numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (this.numbers[i] > max) {
                max = this.numbers[i];
            }
        }
        System.out.println("Największa wylosowana liczba to: " +max);
    }
    public void searchMinimum() {
        int min = this.numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (this.numbers[i] < min) {
                min = this.numbers[i];
            }
        }
        System.out.println("Najmniejsza wylosowana liczba to: " +min);
    }
}
