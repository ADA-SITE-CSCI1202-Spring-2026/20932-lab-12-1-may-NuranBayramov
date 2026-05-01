import java.util.HashMap;
public class GradeFilter {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Ali", 85);
        grades.put("Leyla", 92);
        grades.put("Murad", 55);
        grades.put("Nigar", 70);
        grades.put("Kamran", 40);

        // ===== TODO 1 =====
        // Create passedRule lambda.
        GradeRule passedRule = grade -> grade >= 60;

        // ===== TODO 2 =====
        // Create excellentRule lambda.
        GradeRule excellentRule = grade -> grade >= 90;

        System.out.println("Passed students:");

        // ===== TODO 3 =====
        // Print passed students.
        grades.forEach((student, grade) -> {
            if (passedRule.test(grade)) {
                System.out.println(student + " -> " + grade);
            }
        });

        System.out.println("\nExcellent students:");

        // ===== TODO 4 =====
        // Print excellent students.
        grades.forEach((student, grade) -> {
            if (excellentRule.test(grade)) {
                System.out.println(student + " -> " + grade);
            }
        });
    }
}