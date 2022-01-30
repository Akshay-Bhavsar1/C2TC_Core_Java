
public class Array_3D_2 {

	public static void main(String[] args) {

		byte[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		
		System.out.println("\nArray of Elements\n\n");
		for(int i = 0; i < x.length; i++)//(byte[][] x1 : x)
		{
			for(int j = 0; j < x[i].length; j++)//(byte[] x2 : x1)
			{
				for(int k = 0; k < x[i][j].length; k++)//(byte x3 : x2)
				{
					System.out.printf("\nElement of x[%d][%d][%d] : %d",i,j,k,x[i][j][k]);
				}
			}
		}
	}

	
}
