package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter p = new PrintWriter(new FileOutputStream("/result.xml"));

    }
}