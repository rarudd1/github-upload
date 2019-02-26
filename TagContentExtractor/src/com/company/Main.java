package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) throws IOException {
        try(Scanner scan = new Scanner(new FileReader("tests.txt"))) {
            int testCases = scan.nextInt();

            while (testCases-- > 0) {
                String line = scan.nextLine();


                boolean matchFound = false;
                Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");

                Matcher m = r.matcher(line);


                while (m.find()) {

                    System.out.println(m.group(2));
                    matchFound = true;
                }
                if (!matchFound) {
                    System.out.println("None");
                }
            }
        }
    }
}

