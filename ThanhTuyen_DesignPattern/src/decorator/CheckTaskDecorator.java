package decorator;

class CheckTaskDecorator extends JobDecorator {

    public CheckTaskDecorator(Job job) {
        super(job);
    }

    @Override
    public void performTask() {
        super.performTask();
        System.out.println("Kiểm tra công việc đã hoàn thành.");
    }
}
