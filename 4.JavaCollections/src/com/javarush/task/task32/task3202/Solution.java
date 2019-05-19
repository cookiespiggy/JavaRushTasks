package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter stringWriter = new StringWriter();
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String s;
            while ((s = reader.readLine()) != null) {
                stringWriter.write(s);
            }
            reader.close();
        }
        return stringWriter;
    }
}