class salary {

    private double sum;
    private int month;
    private double tax;

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getSum() {
        return sum;
    }

    public int getMonth() {
        return month;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return "salary [sum=" + sum + ", month=" + month + ", tax=" + tax + "]";
    }

}

public class ex4_salary {
    public static void main(String[] args) {
 
    }
}