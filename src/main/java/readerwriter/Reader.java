package readerwriter;

import java.io.*;
import java.util.Scanner;

public class Reader {
    public String read(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        return String.valueOf(sc.next());
    }
}


