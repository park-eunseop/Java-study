package scheduler;

public interface Scheduler {
    /**
     * 다음 전화를 가져오는 기능
     */
    public void getNextCall();

    /**
     * 상담원에게 전화를 배분하는 기능
     */
    public void sendCallToAgent();
}
