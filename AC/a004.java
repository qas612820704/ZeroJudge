import java.util.Scanner;
public class a004 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int year;
	String leap;
	while(scan.hasNext()) {
	    year = scan.nextInt();
	    if ( ( year%4== 0 && year%100 != 0) || year%400 == 0 )
		leap = "閏年";
	    else
		leap = "平年";
	    System.out.println(leap);
	}
    }
}
