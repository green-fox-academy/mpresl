package PrintableInterface;

public class toDo implements Printable {
    private String task;
    private String priority;
    private boolean complete;

    toDo(String task, String prio, boolean complete){
        this.task = task;
        this.priority = prio;
        this.complete = complete;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: "+this.getTask()+" | Priority: "+this.getPriority()+" | Done: "+this.getPriority());
    }
}
