 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forLoop1;
import java.util.Scanner;
/**
 *
 * @author z.malik
 */
public class forLoop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verdict = sc.next();
		int passCount = 0;
		int failCount = 0;
		
		while (!verdict.equals("DONE")) {
			if (verdict.equals("PASS")) {
				passCount++;
			}
			else if (verdict.equals("FAIL")) {
				failCount++;
			}
			else {
				System.out.println("Invalid Input.");
			}
			verdict = sc.next();
		}
		System.out.println(failCount + " students failed and " + passCount + " students passed.");
        
    }
    
}
