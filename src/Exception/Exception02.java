package Exception;

public class Exception02 {
	public static void main(String[] args) {
		// tryは例外が発生する可能性のある処理
		try {
			System.out.println("100 ÷ 0 は?");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		// catchは例外が発生した場合に実行する処理
		} catch (ArithmeticException e) {
			System.out .println("例外が発生");
		// finallyは例外発生の有無に関わらず必ず実行する処理
		} finally {
			System.out.println("プログラム終了");
		}
	}
}
