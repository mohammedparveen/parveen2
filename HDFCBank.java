package samplejava;

public class HDFCBank extends RBIBank
{
HDFCBank()
{
	System.out.println("cons of HdFCBank");
}
	public static void main(String[] args) 
	{
	RBIBank r1=new RBIBank();
	r1.cibillscore();
RBIBank r2=new HDFCBank();
r2.cibillscore();
	}

	void cibillscore()
	{
		System.out.println("cbillscore of HDFCBank");
	}
}
