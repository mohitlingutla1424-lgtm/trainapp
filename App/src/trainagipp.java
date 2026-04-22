import java.util.LinkedList;

public class trainagipp {

    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 3: Display initial consist
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Step 4: Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Step 5: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(trainConsist);

        // Step 6: Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}