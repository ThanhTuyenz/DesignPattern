package decorator;

class ReportTaskDecorator extends JobDecorator {

    public ReportTaskDecorator(Job job) {
        super(job);
    }

    @Override
    public void performTask() {
        super.performTask();
        System.out.println("Báo cáo công việc cho cấp trên.");
    }
}
