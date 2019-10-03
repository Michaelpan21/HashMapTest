package ru.mishapan.hashmaptest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Player> playerMap = new HashMap<>();

        Path path = Paths.get("./data.txt").toAbsolutePath();

        try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {

            String fileString;

            /**
             * @param splitFileString[0] Player's surname
             * @param splitFileString[1] Player's name
             * @param splitFileString[2] Player's number
             */
            while ((fileString = br.readLine()) != null) { //read lines while file isnt empty!

                String[] splitFileString = fileString.split(" ");

                Integer number = Integer.parseInt(splitFileString[2]);

                playerMap.put(number, new Player(splitFileString[0], splitFileString[1], number));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
