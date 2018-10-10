package calculates.calculateV;

public class Max_Min_Test {
	private float[][] V;
	private float Max;
	private float Min;
	
	public Max_Min_Test() {
		V=new float[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				V[i][j]=(float)j;
				System.out.print(V[i][j]+"   ");
			}
			System.out.print("\n");
		}
	}

	public float[][] getV(){
		return this.V;
	}
	
	public float MaxMinusMin(float[][] inputV) {
		Max=Min=inputV[0][0];
		int I=inputV.length;
		int J=inputV[0].length;
		for(int i=0;i<I;i++) {
			for(int j=0;j<J;j++) {
				if(Max<inputV[i][j]) {
					Max=inputV[i][j];
				}
				if(Min>inputV[i][j]) {
					Min=inputV[i][j];
				}
			}
		}
		return Max-Min;
	}
	
	public static void main(String[] args) {
		Max_Min_Test mmt=new Max_Min_Test();
		float[][] in=mmt.getV();
		float result=mmt.MaxMinusMin(in);
		System.out.println(result);
	}

}
