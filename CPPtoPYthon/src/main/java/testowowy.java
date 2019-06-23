import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testowowy {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/in.cpp";
        String cokolwiek = zewFunkcyjny(fileName);
        System.out.println("Otrzymany String:");
        System.out.println(cokolwiek);

        zewFunkcyjny2(cokolwiek);



    }



public static String zewFunkcyjny(String sciezka){
    try (BufferedReader br = new BufferedReader(new FileReader(sciezka))) {
        StringBuilder file = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            file.append(line);
            file.append("\n");
        }
        return file.toString();

    } catch (IOException e) {
        e.printStackTrace();
        return "Plik nie został wczytany";
    }

}

    static void zewFunkcyjny2(String content){
        try (FileWriter writer = new FileWriter("src/main/resources/test.py");
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(content);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}

