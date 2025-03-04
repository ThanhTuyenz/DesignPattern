package decorator;

public class JobDecorator implements Job {
    protected Job decoratedJob;

    public JobDecorator(Job job) {
        this.decoratedJob = job;
    }

    @Override
    public void performTask() {
        decoratedJob.performTask();
    }
}
