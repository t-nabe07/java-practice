
public class Chapter05 {
	public static void main(String[] args) {

		// プリミティブ型変数に値を代入して出力
		long l = 1000000000000L;
		System.out.println(l);
		double d = 3.14;
		System.out.println(d);
		boolean b = true;
		System.out.println(b);

		// ラッパークラスの変数に値を代入して出力
		Integer i = 100;
		System.out.println(i);
		Float f = 1.435235f;
		System.out.println(f);
		Character c = 'う';
		System.out.println(c);

		int[] array = { 0, 10, 20, 30, 40 };
		System.out.println(array[3]);
	}
}
