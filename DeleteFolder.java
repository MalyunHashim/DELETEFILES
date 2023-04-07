package DELETEFILES;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File myobj= new File("C:\\Users\\muniish\\OneDrive\\Desktop\\funny");
        if(myobj.delete()){
            System.out.println("Deleted the folder:" + myobj.getName());
        }else{
            System.out.println("failed to delete the folder.");
        }
    }
}
