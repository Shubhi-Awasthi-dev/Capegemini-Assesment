import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {

        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Software Engineer", 2, 100000));
        jobs.add(new Job("Data Scientist", 1, 120000));
        jobs.add(new Job("Product Manager", 3, 110000));

        Collections.sort(jobs);

        for (Job job : jobs) {
            System.out.println(job);
        }
    }
}