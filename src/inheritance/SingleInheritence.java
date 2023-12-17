package inheritance;

public class SingleInheritence {
	
	public static void main(String [] args) {
		//AdvCalc ob = new AdvCalc();
		SciCalc ob = new SciCalc();
		System.out.println("Sum : " +ob.getAdd(4,3));
		System.out.println("Sub: " +ob.getSub(4,3));
		System.out.println("Multipication: " +ob.getMulti(4,3));
		System.out.println("Div: " + ob.getdiv(4,2));
		System.out.println("Power: " + ob.getPower(4,2));
}
}