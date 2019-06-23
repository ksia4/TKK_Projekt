import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Zaczynamy!");

        String inputFileName = "src/main/resources/in4.cpp";
        String outputFileName = "src/main/resources/o.py";

        String textFromFile;
        try {
            textFromFile = readFile(inputFileName);
        }
        catch (FileNotFoundException e){
            System.out.println("Podany plik źródłowy nie istnieje");
            return;
        }
        System.out.println("Wczytano plik źródłowy");
        System.out.println(textFromFile);


        Converter c = new Converter();
        BufferedWriter bw = bw(outputFileName);
        c.convert(textFromFile, bw);

        try {
            closeBufferWritter(bw);
        }
        catch (IOException e){
            System.out.println("Wpisywanie do pliku nie zadziałało :(");
            return;
        }

    }

    private static String readFile(String pathToFile) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            StringBuilder file = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                file.append(line);
                file.append("\n");
            }
            return file.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "Plik nie został wczytany";
        }
    }

    private static BufferedWriter bw(String pathToFile) throws IOException {
        FileWriter writer = new FileWriter(pathToFile);
        BufferedWriter bw = new BufferedWriter(writer);
        return bw;
    }

    private static void closeBufferWritter(BufferedWriter bw) throws IOException {
        bw.close();
    }
}
