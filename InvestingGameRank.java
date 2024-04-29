import java.util.*;

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
         * Update ranks for 4/29/2024
         * Store the names and their corresponding scores
         * Add $5,000 per meeting attended
         */

        String[] names = {"Cmorreale", "Emre S.", "Artem F", "Mehul C.", "Anand P." , "Aravind S.", "Harsh", "John Ireland", "Soosup", "Walter t", "Helena young", "Brkeene", "Maysa F", "lily sigman", "wbfinv", "dsafdfa", "John K.", "Ronit K", "Gabe A.", "Daksh G", "Pdhakad", "Jpthesmar", "Sofiaxie", "Azizah", "Zach Newburg", "Talha Q", "Musalan", "Ryhannigan", "jetcloudz", "Syed S", "Luhai tang", "Amir J", "Abroche", "Ali R", "a12w", "Drago21", "Ethan F"};
        int[] wealth = {102350, 104724, 100666, 144172, 100210,100000, 100000,100000,100000,100000,100000,100000, 100000, 100000, 100000,100000,100000,100000, 100000,100000,100000,100249,100077, 99812,99177,99485,99824,97791,97323,99343, 97711, 99215, 94647, 101402,67806, 41312, 1000};

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
            if(attendanceNum == 1){}
            else if(attendanceNum ==2){}
            else if(attendanceNum == 3){}
            else if(attendanceNum ==4){}

        }



        for (Map.Entry<String, Integer> pair : nameValue.entrySet()) {
            System.out.println(String.format("Name of student is: %s, Wealth is : $%s", pair.getKey(), pair.getValue()));
        }
        // TODO: Add words and frequency


    }//end main

}


/**
        Map<String, Integer> frequencyWordsAesop = new HashMap<>();
        String[] aesopByWord = aesop.replace("\n", " ").replaceAll("[^\\sa-zA-Z0-9']", "").split(" "); // Use regex to filter out punctuation
        // TODO: Add words and frequency
for(String word: aesopByWord){
    frequencyWordsAesop.put(word, frequencyWordsAesop.getOrDefault(word, 0)+1);
}

        // Task #2: Find the word with the highest frequency (looping over keys)
        System.out.println("----------------------------------------");
        String highestFreqWordInTale = "";
        int highestFreqInTale = Integer.MIN_VALUE;
        // TODO: Loop over all keys
        for(String key: frequencyWordsTale.keySet()){
            if(frequencyWordsTale.get(key)>highestFreqInTale);
            highestFreqInTale = frequencyWordsTale.get(key);
            highestFreqWordInTale = key;

        }
        System.out.println("Word with highest frequency in Tale: " + highestFreqInTale + " (" + highestFreqInTale + ")");

        // Task #3: Find the word with the highest frequency (looping over key-value pairs)
        System.out.println("----------------------------------------");
        String highestFreqWordInAesop = "";
        int highestFreqInAesop = Integer.MIN_VALUE;
        // TODO: Loop over all key-value pairs
        System.out.println("Word with highest frequency in Aesop: " + highestFreqWordInAesop + " (" + highestFreqInAesop + ")");




        // Task #4: Combining into one single map
        System.out.println("----------------------------------------");
        Map<String, Integer> combinedMap = new HashMap<>();
        // TODO: Combine into one single map





        String highestFreqWord = "";
        int highestFreq = Integer.MIN_VALUE;
        // TODO: Find word with highest frequency

        System.out.println("Word with highest frequency in Tale and Aesop combined: " + highestFreqWord + " (" + highestFreq + ")");

        // Task #5: Build inverse-lookup map
        System.out.println("----------------------------------------");
        Map<Integer, List<String>> inverseLookup = new HashMap<>();
        // TODO: Loop from 1 to highestFreq and build an inverse look up map

        System.out.println("----------------------------------------");
    }*/
