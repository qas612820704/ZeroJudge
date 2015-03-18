import java.util.Scanner;
import java.lang.Math;
public class a006 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] line;
	int[] factors = new int[3];
	int[] root = new int[2];
	int determine;
	while (scan.hasNext()) {
	    line = scan.nextLine().split(" ");
	    if (line.length != 3)
		continue;
	    for (int i=0; i<line.length; i++) {
		factors[i] = Integer.parseInt(line[i]);
	    }
	    determine = (int)Math.pow(factors[1],2) - 4 * factors[1] * factors[2];
	    if (determine > 0) {
		root[0] = (-factors[1] + (int)( Math.sqrt((double)determine) ) )/ 2*factors[0];
		root[1] = (-factors[1] - (int)( Math.sqrt((double)determine) ) )/ 2*factors[0];
		System.out.format("Two different roots x1=%d , x2=%d\n",root[0],root[1]);
	    }
	    else if (determine == 0) {
		System.out.format("Two same roots x=%d\n", -factors[1]/2*factors[0]);
	    }
	    else {
		System.out.print("No real root\n");
	    }
	}
    }
}
