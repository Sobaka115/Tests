package test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class writetxt {

    public static void writeTo() {
        File file = new File("src/test/111.txt");

        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            String lineSeparator = System.getProperty("line.separator");
            writer.write("Hello world " + df.format(date.getTime()) + lineSeparator);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<String> readFrom() {
        File file = new File("src/test/111.txt");
        ArrayList<String> list = new ArrayList<>();

        try {
            Files.lines(Paths.get(file.getPath()), StandardCharsets.UTF_8).forEach(list::add);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return list;
    }

    public static void print(){
        ArrayList<String> list = readFrom();
        for (String x : list) System.out.println(x);
    }

    public static void main(String[] args) {

        writeTo();

        print();

    }
}
