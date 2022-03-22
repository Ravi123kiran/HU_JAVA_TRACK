
import User_data.register_data;
import java.util.Scanner;
public class home
    {
        public static void main(String[] args)
        {
            Scanner Sc = new Scanner(System.in);
            System.out.println("-----------WELCOME TO USER DATABASE-----------");
            System.out.println("1.LOGIN");
            System.out.println("2.REGISTER");
            System.out.println("Select an option");
            int p=Sc.nextInt();
            if(p==1)
            {
                Login lg =new Login();
                lg.login();
            }
            else if(p==2)
            {
                register_data reg = new register_data();
                reg.register_data();
            }
            else
            {
                System.out.println("Enter an valid Option");
            }

        }
    }

