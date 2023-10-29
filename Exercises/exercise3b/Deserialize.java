import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Deserialize {
    public static void deserialize(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Shape shape = (Shape) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized data from " + filename);
            return;
        } catch (IOException i ) {
            i.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("Shape class not found");
            c.printStackTrace();
            return;
        }
    }
}
