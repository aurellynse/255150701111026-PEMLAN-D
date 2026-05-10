import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\USER\\Downloads\\test pemlan");

        if(dir.exists() && dir.isDirectory()){

            File[] files = dir.listFiles();

            for(File f : files){
                f.delete();
            }

            dir.delete();

            System.out.println("Direktori berhasil dihapus");

        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}