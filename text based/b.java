import java.util.Scanner;

public class b {

public static void main(String[] args) {
int a = 0;
while (  a==1 ) {

String one = oof("You wash up on an island with know idea on how you got there. There you have a backpack. (To acess it use the command bp) \n  You see a forest. There is a column of smoke above the trees in the distence. There might be a village! \n Would you like to (a) Go twords the village? or (b) Camp out on the beach ");

if(one.equals("a")) {

oof("You decided to go twords the village.");

} else if(one.equals("b")) {

oof("You decided to camp on the beach...");

} else {
oof("I dont understand. please choose a or b ");
a++;
}

}

}







public static String oof(String foo) {
	System.out.println(foo);

	Scanner kb = new Scanner(System.in);
	
	String in = kb.next();

		for (int i = 0; i < 50; i++) {
		System.out.print("\f");
	}
	return in;
	}


}

