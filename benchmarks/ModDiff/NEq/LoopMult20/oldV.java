package demo.benchmarks.ModDiffNeq.LoopMult20;
public class oldV {
	public static double snippet(int x) {
		if (x>=18 && x<22){
			int c=0;
			for (int i=1;i<=20;++i)
				c-=x;
			return c;
		}
		return 0;
	}
}
