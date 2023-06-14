package sample;

public class HourlyPayWorker extends BaseWorker implements Comparable<BaseWorker>{

    private final double salary;

    public HourlyPayWorker(String name, int hourlyPay) {
        super(name);
        this.salary = 20.8 * 8 * hourlyPay;

    }

    @Override
    public double getSalary() {
        return  salary;
    }

    @Override
    public int compareTo(BaseWorker o) {
        return Double.compare(this.getSalary(), o.getSalary());
    }
}
