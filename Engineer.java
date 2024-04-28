
class Engineer extends Employee implements PerformanceEvaluation, Training {
    public Engineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
       
        return salary * 0.05; 
    }

    @Override
    public void evaluatePerformance() {
        System.out.println("Engineer evaluated.");
    }

    @Override
    public void scheduleTraining() {
        System.out.println("Training scheduled Engineer.");
    }
}
