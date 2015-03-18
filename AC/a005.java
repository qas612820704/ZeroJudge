import java.util.Scanner;
public class a005 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] line ;
	int[] series = new int[5];
	while (scan.hasNext()) {
	    line = scan.nextLine().split(" ");
	    if ( line.length != 4)
		continue;
	    for(int i=0; i< line.length ; i++) {
		series[i] = Integer.parseInt(line[i]);
		System.out.print(series[i] + " ");
	    }
	    if ( ( (series[3] - series[2]) == (series[1] - series[0]) ))
		series[4] = 2* series[3] - series[2];
	    else
		series[4] = series[3] * series[3] /series[2];
	    System.out.println(series[4]);
	}
    }
}
