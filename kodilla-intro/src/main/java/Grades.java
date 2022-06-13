public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        {
            this.grades[this.size] = value;
            this.size++;
        }
    }

    public void lastGrade() {
        System.out.println("Ostatnia wprowadzona ocena to: " + this.grades[this.size]);
    }

    public double avarage() {
        int result = 0;
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
        }
        return result / grades.length;
        }
}