package scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요");
        System.out.println("R: round robin");
        System.out.println("L: least one");
        System.out.println("P: priority");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch =='r')
            scheduler = new RoundRobin();
        else if(ch=='L' || ch=='l')
            scheduler = new LeastJob();
        else if(ch=='P' || ch=='p')
            scheduler = new PriorityAllocation();
        else{
            scheduler = new AgentGetCall();
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }
}
