import java.util.Scanner;
public class a003 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while (scan.hasNext()) {
	    int s = (scan.nextInt()*2 + scan.nextInt()) % 3;
	    String divine = "";
	    switch (s) {
	    case 0:
		divine = "普通";
		break;
	    case 1:
		divine = "吉";
		break;
	    case 2:
		divine = "大吉";
		break;
	    default:
		break;
	    }
	    System.out.println(divine);
	}
    }
}
	    
