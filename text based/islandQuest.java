import java.util.Scanner;

public class islandQuest {


	
public static void main(String[] args) {
int a = 0;
//PrintWriter writer = new PrintWriter("saveFile.txt", "UTF-8");	
while (  a==1  ) {
a=0;
String one = oof("You wash up on an island with know idea on how you got there. There you have a backpack. (To acess it use the command bp) \n  You see a forest. There is a column of smoke above the trees in the distence. There might be a village! \n Would you like to (a) Go twords the village? or (b) Camp out on the beach ");

if(one.equals("a")) {

aTwo = oof("You decided to go twords the village. \n As you get closer, you hear screams, and its almost night. \nWould you like to (a) go into the forest? or (b) Sleep in the forest."  );

	if(aTwo.equals("")){
	
}

} else if(one.equals("b")) {

bTwo = oof("You decided to camp on the beach");

} else {
oof("I dont understand. please choose a or b ");
a++;
}

}

}
	
	




Publuc static save(String choice) {
writer.println(choice);
writer.close();	
}

Public static bp() { //GT work on this later
	System.out.print("Nothing in here yet!")
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

