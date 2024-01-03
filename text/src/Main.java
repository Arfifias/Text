import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            writer.write("Hello my name is Arfifias" + "\n");
            writer.write("I like apples" + "\n");
            writer.write("I love sandwiches and sausages");
            writer.close();
            /*BufferedWriter is a String Stream
            *Also what ever stream ends with a writer is a String Stream
            * Additionally like streams a Java developer must close the stream!!!
             */
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}