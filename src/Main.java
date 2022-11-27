import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] names1 = sc.nextLine().split(" ");
		String[] names2 = sc.nextLine().split(" ");
		
		HashMap<String, String> pairs = new HashMap<>();
		
		for (int i=0;i<n;i++) {
			String name1 = names1[i];
			String name2 = names2[i];
			
			if (pairs.containsKey(name1)) {
				if (!pairs.get(name1).equals(name2)) {
					System.out.println("bad");
					return;
				}
			} else {
				pairs.put(name2, name1);
			}
			
			
		}
		System.out.println("good");
	}

}
