
    import java.util.*;
    public class array_assg {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y[] = new int[x];
            int count=0;
            int m,n,sum = 0;
            for(m=0;m<x;m++)
            {
                y[m] = sc.nextInt();
            }
            sc.close();
            for(m=0;m<x;m++)
            {
                sum = 0;
                for(n=m;n<x;n++)
                {
                    sum = y[n] + sum;
                    if(sum<0){count++;}
                }
            }
            System.out.println(count);
        }
    }
