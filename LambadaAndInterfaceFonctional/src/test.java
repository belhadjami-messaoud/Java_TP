import java.util.function.BiFunction;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tab[] = {10 ,25 , 6 ,2};
		
		
		class Multi implements operationlCalc {

			@Override
			public double calc(double[] c) {
				double s = 1;
				
				for(double v:c) {
					s*=v;
				}
				return s;
			}

		}
		
		 class add implements operationlCalc {

				@Override
				public double calc(double[] c) {
					double s = 0;
					
					for(double v:c) {
						s+=v;
					}
					return s;
				}

			}
		
		//add a = new add();
		//Multi m = new Multi();
		 
		//System.out.println(a.calc(tab));
		//System.out.println( m.calc(tab));
		
		 operationlCalc a = new operationlCalc() {
			
			 @Override
				public double calc(double[] c) {
					double s = 0;
					
					for(double v:c) {
						s+=v;
					}
					return s;
				}
		};
		
		
		operationlCalc m= new operationlCalc() {
			
			@Override
			public double calc(double[] c) {
				double s = 1;
				
				for(double v:c) {
					s*=v;
				}
				return s;
			}
		};
		
		
		
		
		System.out.println(new operationlCalc() {
			
			@Override
			public double calc(double[] c) {
				double s = 1;
				
				for(double v:c) {
					s*=v;
				}
				return s;
			}
		}.calc(tab));
		
		
		operationlCalc op = (double[] t)-> {
			double s = 1;
			
			for(double v: t) {
				s*=v;
			}
			return s;
		};
		
		System.out.println(op.calc(tab));
		
        BiFunction<Integer, Integer, Long> addd = (aa, bb) -> (long) aa + bb;
        System.out.println(addd.apply(10, 20)); // 30
        
		
		BiFunction<Integer, Integer, Long> add = new BiFunction<Integer, Integer, Long>() {
			@Override
			public Long apply(Integer t, Integer u) {
				return (long) t + u;
			}
		};
		
		System.out.println(add.apply(10, 20));
		
		
	}

}
