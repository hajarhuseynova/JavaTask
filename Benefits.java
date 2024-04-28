public interface Benefits {
    void calculateBenefits();
    private void displayReport() {
        System.out.println("Displayed.");
    }
    default void confirmBenefits() {
        displayReport();
        System.out.println("Confirmed.");
    }
}