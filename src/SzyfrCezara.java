import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class SzyfrCezara {
    public static String szyfrowanie (String tekst, int klucz){
        char[] charArray = tekst.toCharArray();
        String wynik = "";
        for (int i = 0; i < charArray.length; i++) {
            int znak = ((int)charArray[i]);
            System.out.println("aktualna litera to: " + charArray[i] + " " + znak);
            int zaszyfrowanaLiczba = znak + klucz;
            char zaszyfrowanyZnak = ((char)zaszyfrowanaLiczba);
            System.out.println("aktualny znak: "+ zaszyfrowanyZnak + " "+ zaszyfrowanaLiczba);
            wynik += String.valueOf(zaszyfrowanyZnak);

        }
        return wynik;
    }public static String odszyfrowanie (String tekst, int klucz){
        char[] charArray = tekst.toCharArray();
        String wynik = "";
        for (int i = 0; i < charArray.length; i++) {
            int znak = ((int)charArray[i]);
            System.out.println("aktualna litera to: " + charArray[i] + " " + znak);
            int zaszyfrowanaLiczba = znak - klucz;
            char zaszyfrowanyZnak = ((char)zaszyfrowanaLiczba);
            System.out.println("aktualny znak: "+ zaszyfrowanyZnak + " "+ zaszyfrowanaLiczba);
            wynik += String.valueOf(zaszyfrowanyZnak);

        }
        return wynik;
    }


    public static void main(String[] args) throws IOException {
        String zaszyfrowanyTekst = szyfrowanie("Agnieszka", 1000);
        System.out.println(zaszyfrowanyTekst);
        System.out.println(odszyfrowanie(zaszyfrowanyTekst,1000));
        String content = Files.readString(Path.of("C:\\Users\\Qnio\\Desktop\\prijrkt\\Wektory\\.gitignore"));
        System.out.println(content);
        content = szyfrowanie(content,15);
        Path path = Path.of("C:\\Users\\Qnio\\Desktop\\prijrkt\\Wektory\\.zaszyfrowanytekst");
        Files.writeString(path, content, StandardCharsets.UTF_8);

    }

}
