package mypackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * mvn clean package to create a jar in the target dir
 *
 * java -cp target/Java-1.0-SNAPSHOT.jar mypackage.MainClass
 * as the command to run the main method
 *
 * Or use intellij to run the main method/class for you
 *
 * If target release 1.8 is not found set JAVA_HOME to your Java 8 directory and install JDK 8 if needed
 *
 */

public class MainClass {

    public static void main(String[] args) {


        System.out.println("Your development environment is set for upcoming chapter meeting! Nice.");





        // Remove comments for part 3 & 4 and also uncomment the method filterMembers at the bottom of this page

/*        System.out.println("Part 3");

        ArrayList<ChapterMembers.Member> members = ChapterMembers.getDataset();*/






        // Uncomment for part 5

/*        System.out.println("Part 5");

        String fileName = "/home/fi54iw/projects/Java-8/inputFile";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            // Print the entire Lorem Ipsum text
            stream.onClose( () -> System.out.println("The file has been closed!") )
                    .forEach(System.out::println);

            // Change all the letters to lowercase letter, use the dot as separator between sentences and print all the sentences

            // Count all the words that start with an L or l and are longer than 5 letters

        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }


    // uncomment for part 3 and 4

/*    public static void filterMembers(ArrayList<ChapterMembers.Member> members, String filter, Predicate condition) {
        members.stream().filter(member -> condition.test(member)).forEach(member -> System.out.println("Filtered on " + filter + " : " + member.getName()));
    }*/

}
