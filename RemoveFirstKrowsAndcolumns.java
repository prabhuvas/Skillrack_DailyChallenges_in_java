package skillrack_challenges;
import java.util.Scanner;

public class RemoveFirstKrowsAndcolumns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		
		for(int i=k; i<n; i++) {
			for(int j=k; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
