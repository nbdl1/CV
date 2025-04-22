import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStoryString {
    private static final long delayMS = 10;

    public static void printStringToConsole(String input) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            try {
                Thread.sleep(delayMS);
            } catch (InterruptedException e) {
                System.out.println("Oops, we got an exception: " + e);
            }
        }
        System.out.print("\n");
    }
}