package Constructorspractice;

public class PiggieBank {
	
	int Amount = 50;
	
	public PiggieBank()
	{
	System.out.println(Amount);
	}
	
	public PiggieBank(int AmountToAdd) {
		Amount = Amount + AmountToAdd;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggieBank pb1 = new PiggieBank();
		PiggieBank pb = new PiggieBank(10);
		System.out.println(pb.Amount);
		
	}

}
