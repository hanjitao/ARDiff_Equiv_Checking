package demo.benchmarks.ModDiffEq.LoopUnreach5.instrumented;
public class oldV{
	public static double snippet(int x) {
		if (x>=5 && x<7) {
			int c = 0;
			if (x < 0) {
				for (int i = 1; i <= x; ++i)
					c += 5;
			}
			return c;
		}
		return 0;

	}
}