import java.io.File;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
//        System.out.println("Hello World");
//        Warmup1 w = new Warmup1("ad");
        File file = new File("input.txt");
        Scanner fr = new Scanner(file);
        String[] strings = new String[5];
        for(int i = 0; i < strings.length; i++){
            strings[i] = fr.nextLine();
        }
//        System.out.println(strings[0]);
        Functional func = new Functional(strings);
        System.out.println(func.getS_test());
    }
}
