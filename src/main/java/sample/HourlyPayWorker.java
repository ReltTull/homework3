public class HourlyPayWorker extends BaseWorker{

    private final int hourlyPay;
    public HourlyPayWorker(String name, int hourlyPay) {
        super(name);
        this.hourlyPay = hourlyPay;
    }

    @Override
    void setSalary() {
        this.salary = 20.8 * 8 * hourlyPay;
    }
}
