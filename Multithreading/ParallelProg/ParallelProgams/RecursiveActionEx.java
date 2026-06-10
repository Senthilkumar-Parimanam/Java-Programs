package Multithreading.ParallelProg.ParallelProgams;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionEx extends RecursiveAction {

    private long workLoad = 0;

    public RecursiveActionEx(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {

        //if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 16) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            List<RecursiveActionEx> subtasks =
                new ArrayList<RecursiveActionEx>();

            subtasks.addAll(createSubtasks());

            for(RecursiveAction subtask : subtasks){
                subtask.fork();
            }

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
    }

    private List<RecursiveActionEx> createSubtasks() {
        List<RecursiveActionEx> subtasks =
            new ArrayList<RecursiveActionEx>();

        RecursiveActionEx subtask1 = new RecursiveActionEx(this.workLoad / 2);
        RecursiveActionEx subtask2 = new RecursiveActionEx(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }

}