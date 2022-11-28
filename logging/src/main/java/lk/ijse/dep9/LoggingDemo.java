package lk.ijse.dep9;

/**
 * Challenge 1: Make it run, but you can't change the code inside the main()
 * Challenge 2: Write a log inside the exception
 * Challenge 3: Change the log level to display trace messages
 * Challenge 4: Save logs to a file
 */

public class LoggingDemo {

    public static void main(String[] args) {
        log.trace("This is a trace message");
        log.debug("This is a debug message");
        log.info("This is an information message");
        log.warn("This is a warning message");
        log.error("This is an error message");

        String value = "12a";
        try {
            int i = Integer.parseInt("12a");
        } catch (NumberFormatException e) {
            /* Handle the exception here */
            /* Exception message should be "value is not a valid number" */
        }
    }

}
