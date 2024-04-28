class Manager extends Employee implements PerformanceEvaluation, Benefits {
    public Manager(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double calculateBonus() {
        return salary * 0.1;
    }
    @Override
    public void evaluatePerformance() {
        System.out.println("Evaluated");
    }
    @Override
    public void calculateBenefits() {
        System.out.println("Calculate");
    }
    @Override
    public void confirmBenefits() {
        System.out.println("Confirmed.");
    }
}
