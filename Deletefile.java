package DELETEFILES;

import java.io.File;

public class Deletefile {
    public static void main(String[] args) {
        File myobj = new File("stream.txt");
        if (myobj.delete()) {
            System.out.println("Deleted the file:" + myobj.getName());

        } else {
            System.out.println("Failed to delete the file.");
        }
    }
    }