import java.util.Iterator;

public class add implements operationlCalc {

	@Override
	public double calc(double[] c) {
		double s = 0;
		
		for(double v:c) {
			s+=v;
		}
		return s;
	}

}
