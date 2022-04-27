package IOTextFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {
    public static void copyFile(File original, File clone) throws IOException {
        FileReader fileReader = new FileReader(original);
        FileWriter fileWriter = new FileWriter(clone);

        int count;
        while ((count = fileReader.read()) != -1) {
            fileWriter.write(count);
        }
        fileWriter.close();
        fileReader.close();
    }

    public static void main(String[] args){
        String pathOriginal = "E:\\CodeGymModule2\\original.txt";
        String pathClone = "E:\\CodeGymModule2\\cloneOriginal.txt";
        File original;
        File cloneOriginal;

        try {
            original = new File(pathOriginal);
            if (!original.exists()){
                original.createNewFile();
            }
            cloneOriginal = new File(pathClone);
            if (!cloneOriginal.exists()){
                cloneOriginal.createNewFile();
            }
            TextFileCopy.copyFile(original, cloneOriginal);
            System.out.println("Successful!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}