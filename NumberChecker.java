@FunctionalInterface
interface NumberChecker {
    boolean check(int number);

    default void printResult() {
        System.out.println("Result checked");
    }
}