package demo.benchmarks.ModDiffEq.LoopUnreach5.instrumented;
public class newV{
	public static double snippet(int x) {
		if (x>=5 && x<7) {
			int c = 0;
			if (x < 0) {
				for (int i = 1; i <= 5; ++i)
					c += x;
			}
			return c;
		}
		return 0;

	}
}