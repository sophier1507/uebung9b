package p1;
import java.util.Random;
import java.util.Arrays;


public class P1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(randomArray(6)));
		System.out.println(Arrays.toString(randomArray2(6)));
		System.out.println(Arrays.toString(randomArray3()));
		System.out.println(Arrays.toString(randomArray4(3)));

	}

	public static int[] randomArray(int x) {
		Random r = new Random();
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			
			a[i] = r.nextInt();
		}
		return a;
	}
	
	public static int[] randomArray2(int x) {
		Random r = new Random();
		int[] a = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = r.nextInt(x);
		}
		return a;
	}
	
	public static int[] randomArray3() {
		Random r = new Random();
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = r.nextInt(55,76);
		}
		return a;
	}
	
	public static int[] randomArray4(int n) {
		Random r = new Random();
		int[] a = new int[n + 1];
		double s = 0;
		int next;
		for (int i = 0; i < n; i++) {
			next = r.nextInt(1, 51);
			a[i] = next;
			s += next;
		}
		s = Math.ceil(s / n);
		a[n] = (int) s;
		
		return a;
	}
}
