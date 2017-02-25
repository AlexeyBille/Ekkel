package ch18.ex15;//: io/StoringAndRecoveringData.java

import java.io.*;

public class StoringAndRecoveringData {
    public static void main(String[] args)
            throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("That was pi");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.writeBoolean(true);
        out.writeUTF("Boolean");
        out.writeByte(1);
        out.writeUTF("Byte");
        out.writeChar('c');
        out.writeUTF("Char");

        out.close();
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
        // Only readUTF() will recover the
        // Java-UTF String properly:
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readBoolean());
        System.out.println(in.readUTF());
        System.out.println(in.readByte());
        System.out.println(in.readUTF());
        System.out.println(in.readChar());
        System.out.println(in.readUTF());
    }
} /* Output:
3.14159
That was pi
1.41413
Square root of 2
*///:~
