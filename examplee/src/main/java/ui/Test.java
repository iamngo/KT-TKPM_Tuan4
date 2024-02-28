package ui;

import jdepend.xmlui.JDepend;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        PrintWriter p = new PrintWriter(new FileOutputStream("result.xml"));
        JDepend depend = new JDepend(p);
        depend.addDirectory("T:\\KTTKPM_Tuan4\\examplee");
        depend.analyze();
    }
}
