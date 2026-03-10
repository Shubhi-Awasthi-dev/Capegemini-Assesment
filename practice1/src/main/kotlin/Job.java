class Job implements Comparable<Job> {
    String title;
    int priority;
    double salary;

     Job(String title, int priority, double salary) {
        this.title = title;
        this.priority = priority;
        this.salary = salary;
    }
    public int compareTo(Job other){
         return this.priority-other.priority;
    }

    public String toString() {
        return "Job{title='" + title + "', priority=" + priority + ", salary=" + salary + "}";
    }


}
