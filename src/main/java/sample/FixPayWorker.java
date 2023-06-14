package sample;

public class FixPayWorker extends BaseWorker implements Comparable<BaseWorker> {

    private final double salary;
    public FixPayWorker(String name, double fixSalary) {
        super(name);
        this.salary = fixSalary;
//        this.salary = fixSalary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(BaseWorker o) {
        return Double.compare(this.getSalary(), o.getSalary());
    }

}
