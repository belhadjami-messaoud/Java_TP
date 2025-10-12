
public class Multi implements operationlCalc {

	@Override
	public double calc(double[] c) {
		double s = 1;
		
		for(double v:c) {
			s*=v;
		}
		return s;
	}

}
