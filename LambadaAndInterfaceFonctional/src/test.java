
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
		
		
		
		
		System.out.println(a.calc(tab));
		System.out.println( m.calc(tab));
	}

}
