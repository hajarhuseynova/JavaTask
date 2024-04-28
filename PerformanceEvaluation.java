public interface PerformanceEvaluation {
    void evaluatePerformance();
    default void notifyResult() {
        System.out.println("Notified.");
    }
}

