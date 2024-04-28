public interface Training {
    void scheduleTraining();
    static void conductTraining() {
        System.out.println("Conducted.");
    }
}