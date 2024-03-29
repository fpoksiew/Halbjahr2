package PR1.KA6.Text2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TextWriter {

    //erstellen einer textdatei die im ordner H:\PR1\text\Demo_together-20230525\ gespeichert wird
    private static String speicherort = "H:\\PR1\\text\\Demo_together-20230525\\test.txt";

    public static void main(String[] args) {

        Charset charset = Charset.forName("UTF-8");
        BufferedWriter writer = null;

        try {

            // Get the file
            File f = new File(speicherort);

            // Create new file
            // Check if it does not exist
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");



            StringBuilder sb = new StringBuilder();
            sb.append("******************************\n");
            for (int i = 0; i <= 10; i++) {
                sb.append(i);
                sb.append("\t");
                sb.append(i * i);
                sb.append("\t");
                sb.append(Math.sqrt(i));
                sb.append("\n");
            }

            String ausgabe = sb.toString();

            //buffered Writer
            writer = Files.newBufferedWriter(Path.of(speicherort), charset, StandardOpenOption.WRITE);
            writer.write(ausgabe);

            writer.close();
        } catch (Exception e) {
            System.err.println(e);

        } finally {
            System.out.println("Text wurde geschrieben");

        }
    }
}
