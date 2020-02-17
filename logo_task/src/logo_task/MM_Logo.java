package logo_task;
import java.util.Scanner;

public class MM_Logo {
	public int n;
	
	//method which prints a charrecter n times 
	private void print_symbols(int n, char c)
	{
		for (int i=0; i<n; ++i)
		{
			System.out.print(c);
		}
	}
	
	public MM_Logo (int n)
	{
		this.n=n;
	}
	
	public MM_Logo ()
	{
		this.n=5;
	}
	
	public void set_n(int n)
	{
		this.n=n;
	}
	
	public int get_n(MM_Logo obj)
	{
		return obj.n;
	}
	
	//Method for printing the upper half of the logo
	public void print_upperHalf(int n)
	{
		int lines=n+1;
		n+=2;
		for(int i=0; i<=lines/2-1; ++i)
		{
			print_symbols(n-i-2, '-');
			print_symbols((n+i*2)-2, '*');
			print_symbols(n-(i+1)*2, '-');
			print_symbols((n+i*2)-2, '*');
			print_symbols(n-i-2, '-');
			print_symbols(n-i-2, '-');
			print_symbols((n+i*2)-2, '*');
			print_symbols(n-(i+1)*2, '-');
			print_symbols((n+i*2)-2, '*');
			print_symbols(n-i-2, '-');
			System.out.println();
		}
	}
	
	//Method for printing the lower half of the logo
	public void print_lowerHalf(int n)
	{
		int lines=n+1;
		int h=n+lines-2;
		n+=2;
		for (int i=lines/2; i<lines; ++i)
		{
			print_symbols(n-i-2, '-');
			print_symbols(n-2, '*');
			print_symbols(n-2*i+(i-lines/2)*4, '-');
			print_symbols(h, '*');
			print_symbols(n-2*i+(i-lines/2)*4, '-');
			print_symbols(n-2, '*');
			print_symbols(n-i-2, '-');
			print_symbols(n-i-2, '-');
			print_symbols(n-2, '*');
			print_symbols(n-2*i+(i-lines/2)*4, '-');
			print_symbols(h, '*');
			print_symbols(n-2*i+(i-lines/2)*4, '-');
			print_symbols(n-2, '*');
			print_symbols(n-i-2, '-');
			h-=2;
			System.out.println();
		}
	}
	
	//Method for receiving input, until the input is within the given limitations 
	static int enterWidth()
	{
		int width=1;
		Scanner s = new Scanner(System.in);
		Boolean correct=false;
		while(!correct)
		{
			System.out.print("Enter width: ");

			width = s.nextInt();
			if(width%2!=0 && width>=1)
			{
				correct=true;
			}
			else
			{
			System.out.print("Wrong input, enter an odd number greater than 0!\n");
			}
		}
		s.close();
		return width;
	}
	
	//Method that prints the whole logo
	static void printMMLogo(MM_Logo obj)
	{
		obj.print_upperHalf(obj.n);
		obj.print_lowerHalf(obj.n);
	}

}
