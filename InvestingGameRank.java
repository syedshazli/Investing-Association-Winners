import java.util.*;
import java.util.stream.Collectors;

/**
 * A class that demonstrates the basic usage of {@link Map}s.
 *
 * @version 1.0
 */
public class InvestingGameRank {

    /**
     * The main entry point to the program.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {


        /**
         * How do I do this?
         *
         * Store the names and their corresponding scores
         */

        String[] names = {"Cmorreale", "Emre S.", "Artem F", "Mehul C.", "Anand P." , "Aravind S.", "Harsh", "John Ireland", "Soosup", "Walter t", "Helena young", "Brkeene", "Maysa F", "lily sigman", "wbfinv", "dsafdfa", "John K.", "Ronit K", "Gabe A.", "Daksh G", "Pdhakad", "Jpthesmar", "Sofiaxie", "Azizah", "Zach Newburg", "Talha Q", "Musalan", "Ryhannigan", "jetcloudz", "Syed S", "Luhai tang", "Amir J", "Abroche", "Ali R", "a12w", "Drago21", "Ethan F"};
        int[] wealth = {114570, 105978, 100666, 154351, 100452,100000, 100000,100000,100000,100000,100000,100000, 100000, 100000, 100000,101287,100000,100000, 100000,100000,100000,100249,100133, 100232,99216,99490,108812,97939,99884,99343, 99537, 99215, 98188, 98665,76507, 41312, 1000};

        int[] attendanceCount = {};


        Map<String, Integer> attendance = new HashMap<>();



        Map<String, Integer> nameValue = new HashMap<>();

        for(int i = 0; i< names.length; i++)
        {

            nameValue.put(names[i],wealth[i]);
            Scanner scan = new Scanner(System.in);

            System.out.println("How many meetings did " + names[i] + " attend?");
            int attendanceNum = scan.nextInt();
            System.out.println("attendance number is "+attendanceNum);

                nameValue.put(names[i],wealth[i]+ (5000) * attendanceNum );



        }




        // TODO: Add words and frequency
        Map<String, Integer> sortedMap = nameValue.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        sortedMap.entrySet().forEach(System.out::println);

    }//end main

}


/**
 * Winners
 * Mehul C.=154351
 * Cmorreale=129570
 * Emre S.=115978
 * Musalan=113812
 * Zach Newburg=109216
 */
