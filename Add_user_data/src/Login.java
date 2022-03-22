import User_data.register_data;
import java.io.*;
import java.util.Scanner;
    public class Login {
        void login() {
            String name;
            String password;
            System.out.println("Enter the name");
            Scanner sc = new Scanner(System.in);
            name = sc.next();
            System.out.println("Enter the password");
            password = sc.next();
            String line = " ";
            String splitBy = ",";
            Boolean c = false;
            int flag = 0;
            try {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ravikumaa\\HU_JAVA_TRACK\\Add_user_data\\Add_data.csv"));
                while ((line = br.readLine()) != null) {
                    String[] m = line.split(splitBy);
                    if ((m[0].contains(name) && m[1].contains(password))) {
                        flag++;
                    }
                }
                if (flag == 1) {
                    System.out.println("Login Is Successfull");
                    register_data hh = new register_data();
                    hh.register_data();
                } else
                    System.out.println("invalid name or Password");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
