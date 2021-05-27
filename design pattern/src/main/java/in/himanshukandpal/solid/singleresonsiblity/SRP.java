/*
 * Copyright (c) 2021.
 * Developer: Himanshu Kandpal
 * Date: 27/05/21, 11:56 AM
 * Email: hk@himanshukandpal.in
 * Github: https://github.com/himanshuKp
 */

package in.himanshukandpal.solid.singleresonsiblity;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class Persistence {
    public void saveToFile(Journal journal, String filename, boolean overwrite) throws Exception
    {
        if (overwrite || new File(filename).exists()){
            try (PrintStream out = new PrintStream(filename)){
                out.println(journal.toString());
            }
        }
    }

    public void load(Journal journal, String filename) {}
    public void load(Journal journal, URL url){}
}

class SRP
{
    public static void main(String[] args) throws Exception{
        Journal j = new Journal();
        j.addEntry("I Cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "c:\\temp\\SRP.txt";
        p.saveToFile(j, filename, true);

//        windows
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}