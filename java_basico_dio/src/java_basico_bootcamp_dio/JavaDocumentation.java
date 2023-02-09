package java_basico_bootcamp_dio;

/**
 * @author Michael Soares
 * @version 1.o
 * @since 09/02/2023
 * */
public class JavaDocumentation {
     public static void main(String[] args) {
    	 int num = 5, count = 1;
         while(count <= 3) {
             ++count;
             num += count;
         }
         System.out.println(num);
	}
}
