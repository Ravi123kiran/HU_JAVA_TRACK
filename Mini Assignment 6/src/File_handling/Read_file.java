package File_handling;

import java.io.FileWriter;
import java.io.IOException;
class Read_file
{

        public static void main(String[] args) throws IOException
        {

                String str = "File Handling in Java using "+
                        " FileWriter and FileReader";


                FileWriter fw=new FileWriter("selectedStudents.csv");


                for (int i = 0; i < str.length(); i++)
                        fw.write(str.charAt(i));

                System.out.println("file read");

                fw.close();
        }
}