import java.io.File;


public class NumOfFiles {
    public static int numOfFiles(File file) {
        File[] files = file.listFiles();
        int count = 0;
        for (File f : files)
            if (f.isDirectory())
                count += numOfFiles(f);
            else
                count++;

        return count;
    }
    public static void main(String[] args){

        File a = new File("C:\\Users\\fanco\\Desktop");
        System.out.println(numOfFiles(a));

    }
}
