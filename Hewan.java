class Hewan {
	
	public void makan() {
		System.out.println("Hewan Bisa Makan");

	} 
}


class Ayam extends Hewan {
	
	@Override
	public void makan () {
		System.out.println("Ayam Bisa Makan");
		super.makan();
	}
}