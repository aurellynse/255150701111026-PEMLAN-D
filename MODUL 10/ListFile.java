import java.io.File;

public class ListFile {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\USER\\Documents\\garden\\OperatingFiles");

        if(dir.exists() && dir.isDirectory()){

            File[] files = dir.listFiles();

            for(File f : files){
                System.out.println(f.getName());
            }

        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}