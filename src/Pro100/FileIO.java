package Pro100;

import java.io.*;

public class FileIO {

    public static void searchFileRace(String file) {


        if (file.isEmpty()) {
            System.out.println("Either String is null or empty");


        } else {
            String a = file;
            File filePath = new File("src\\Pro100\\DND_CHARACTERS\\" + a + ".txt");//this changes to current project and folder


            if (!filePath.exists()) {
                System.out.println("File does not exist, try again");
            } else {
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader(filePath));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                String st = null;
                while (true) {
                    try {
                        if (!((st = br.readLine()) != null)) break;

                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    System.out.println(st);
                }
            }
        }
    }
}
