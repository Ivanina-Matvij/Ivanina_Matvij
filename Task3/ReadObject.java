package Task3;

import java.io.*;

public class ReadObject {
    public static void serialize(Object obj, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Объект усп1шно сер1ал1зований у файл " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

