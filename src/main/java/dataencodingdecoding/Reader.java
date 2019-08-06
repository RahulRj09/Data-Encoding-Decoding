package dataencodingdecoding;

import java.io.*;
import java.util.Scanner;

class Reader {
    String reader(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String input= String.valueOf(sc.next());
        return input;
    }
}


