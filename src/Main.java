import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import net.salesianos.launcher.ProcessLauncher;
import net.salesianos.utils.Utils;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<String> lines = Utils.getAllTextLineCounter("src\\lorem_ipsum.txt");
        ArrayList<Process> allProcesses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer lineCounter = 0;
        String letter ;

        System.out.println("Introduzca la letra a contar: ");
        letter = scanner.next();
        for (String line : lines) {
            lineCounter++;
            String outputFileName = "outputLine" + lineCounter + ".txt";
            Process javaProcess = ProcessLauncher.initVowelCounter(line, letter, outputFileName);
            allProcesses.add(javaProcess);
        }

        for (Process process : allProcesses) {
            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Integer totalVowels = 0;

        for (int i = 1; i <= lineCounter; i++) {
            String outputFileName = "outputLine" + i + ".txt";
            String outputFileRoute = "src/net/salesianos/outputs/" + outputFileName;
            Integer letterssFromFile = Utils.getTotalCharsFrom(outputFileRoute);
            totalVowels += letterssFromFile;
            File outputFile = new File(outputFileRoute);
            outputFile.delete();
        }

        System.out.println("El fichero tiene " + totalVowels + " letras "+letter+" en total");
    }
}
