/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;


public class App {


    public static void main(String[] args) throws FileNotFoundException {



        System.out.println(new App().randoQuote());
    }

    public static Quotes randoQuote()throws FileNotFoundException{
        String fileName = "assets/allQuotes.json";

        Gson gson = new Gson();

            FileReader fileReader = new FileReader(fileName);
            JsonReader reader = new JsonReader(fileReader);
            Quotes[] data = gson.fromJson(reader, Quotes[].class);
            Random random = new Random();
            int pos = random.nextInt(data.length);
            return data[pos];

    }
}
