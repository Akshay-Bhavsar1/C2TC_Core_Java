
public class Array_3D {

	public static void main(String[] args) {

		byte[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		
		System.out.println("Length of x : "+x.length);
		System.out.println("\nLength of x[0] : "+x[0].length);
		System.out.println("Length of x[1] : "+x[1].length);
		System.out.println("\nLength of x[0][0] : "+x[0][0].length);
		System.out.println("Length of x[0][1] : "+x[0][1].length);
		System.out.println("\nLength of x[1][0] : "+x[1][0].length);
		System.out.println("Length of x[1][1] : "+x[1][1].length);
		
		System.out.println("");
		
/*
		System.out.println("\nElement of x[0][0][0] : "+x[0][0][0]);
		System.out.println("\nElement of x[0][0][1] : "+x[0][0][1]);
		System.out.println("\nElement of x[0][0][2] : "+x[0][0][2]);
		
		System.out.println("\nElement of x[0][1][0] : "+x[0][1][0]);
		System.out.println("\nElement of x[0][1][1] : "+x[0][1][1]);
		System.out.println("\nElement of x[0][1][2] : "+x[0][1][2]);
		

		System.out.println("\nElement of x[1][0][0] : "+x[1][0][0]);
		System.out.println("\nElement of x[1][0][1] : "+x[1][0][1]);
		
		System.out.println("\nElement of x[1][1][0] : "+x[1][1][0]);
		System.out.println("\nElement of x[1][1][1] : "+x[1][1][1]);
		System.out.println("\nElement of x[1][1][2] : "+x[1][1][2]);
		*/
		
		System.out.println("\n\n\nForEach Loop");
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
