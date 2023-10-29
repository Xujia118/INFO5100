import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void serialize(Shape shape) {
        try {
            FileOutputStream fileOut = new FileOutputStream(shape.getClass().getSimpleName() + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(shape);
            out.close();
            fileOut.close();

            System.out.println("Serialized data is saved in " + shape.getClass().getSimpleName() + ".ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
