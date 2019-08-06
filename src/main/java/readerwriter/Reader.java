package readerwriter;

import java.io.*;
import java.util.Scanner;

public class Reader {
    public String reader(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String input= String.valueOf(sc.next());
        return input;
    }
}


