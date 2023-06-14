public class FixPayWorker extends BaseWorker{

    private final double fixSalary;
    @Override
    void setSalary() {
        this.salary = fixSalary;
    }

    public FixPayWorker(String name, double fixSalary) {
        super(name);
        this.fixSalary = fixSalary;
    }

}
