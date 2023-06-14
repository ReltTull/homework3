import sample.BaseWorker;
import sample.FixPayWorker;
import sample.HourlyPayWorker;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        BaseWorker[] workers = new BaseWorker[5];
        workers[0] = new FixPayWorker("Jack", 25000.0);
        workers[1] = new FixPayWorker("Charles", 10000.0);
        workers[2] = new HourlyPayWorker("Shawn", 15);
        workers[3] = new HourlyPayWorker("Dan", 50);
        workers[4] = new FixPayWorker("Damien", 7200);
        Arrays.sort(workers);
        for (BaseWorker worker : workers) {
            System.out.println(worker.getName() + " - " + worker.getSalary());
        }
    }
}
