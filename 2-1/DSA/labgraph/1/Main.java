import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int n;
		System.out.println("enter no of vertices");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int x[]=new int [n*n];
		int y[]=new int [n*n];
		System.out.println("enter no of edges");
		int l=s.nextInt();
		for(int i=1;i<=l;i++){
			System.out.print("enter coordinates of edges\n");
			x[i]=s.nextInt();
			y[i]=s.nextInt();
		}
		for(int i=1;i<=l;i++){
			System.out.println(x[i]+" "+y[i]);
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				int flag=0;
				for(int k=1;k<=l;k++){
					if((i==x[k])&&(j==y[k])){
						System.out.print("1 ");
						flag=-1;
						break;
					}
				}
				if(flag==0){
				System.out.print("0 ");
				}
			}
		System.out.println();
	}
}
}
