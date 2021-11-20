package com.example.application.JavaProf;

import java.io.*;


public class MainStart {
    public static void main(String[] args) {
        try {
            BufferedReader br = null;
            File file = new File("/Users/pro/Desktop/testFule.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < 4; i++) {
                printWriter.write("test");
                printWriter.append(";");
            }
            printWriter.close();

//            br = new BufferedReader(new FileReader("/Users/pro/Desktop/testFule.txt"));
//            String line;
//            for (String arg : br.readLine().toString()) {
//
//            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
