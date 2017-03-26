class laptop{
	String warna;
	String merk;
	String type;
	
	
	void nyalakanLaptop(){
		System.out.println("Laptop Menyala");
	}
	
	void mainGame(){
		System.out.println("Bermain Game");
	}
	
	void matikanLaptop(){
		System.out.println("Laptop Mati");
	}
	
	public static void main(String[] args){
		laptop LaptopRizal=new laptop(); 
		LaptopRizal.merk="Merk : Lenovo"; 
		LaptopRizal.type="Type : G405"; 
		LaptopRizal.warna="Warna : Hitam"; 
						
		System.out.println(LaptopRizal.warna);
		System.out.println(LaptopRizal.merk);
		System.out.println(LaptopRizal.type);
				
		LaptopRizal.nyalakanLaptop();
		LaptopRizal.mainGame();
		LaptopRizal.matikanLaptop();
	}
}