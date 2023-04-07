import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/ipdum"));

        List<String> ipdum = sc.tokens().toList();
        List<String> trim = ipdum.stream().map(s -> s.replace(",", ""))
                .map(s -> s.replace(".", ""))
                .toList();
        System.out.println("Liczba słow zaczynajace sie znakiem s " + sStringNumber(trim));
        System.out.println("Liczba wyrazow skladajace sie z 5 znakow "+fiveLettersString(trim));
    }
    public static long sStringNumber(List<String> num){
        return num.stream()
                .map(String::toLowerCase)
                .filter(s-> s.charAt(0) =='s')
                .count();

    }
    public static long fiveLettersString(List<String> five){
        return five.stream()
                .filter(s -> s.length()<5)
                .count();
    }
}
