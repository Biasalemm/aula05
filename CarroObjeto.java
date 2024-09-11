package POOAula2;

public class CarroObjeto {

	public static void main(String[] args) {
		Carro  carro1 = new Carro();
		Carro  carro2 = new Carro();
		Carro  carro3 = new Carro();
		Carro  carro4 = new Carro();
		
		carro1.setcor("Amarelo e preto");
		carro1.setpreço(1000000);
		carro1.setportas("O carro possui 4 portas");
		carro1.setmarca("Mitsubish");
		carro1.setmodelo("lancer");
		carro1.setaceleracao(180);
		
		carro2.setcor("cinza");
		carro2.setpreço(500000);
		carro2.setportas("O carro possui 4 portas");
		carro2.setcor("Honda");
		carro2.setmodelo("civic");
		carro2.setaceleracao(170);
		
		carro3.setcor("Preto");
		carro3.setpreço(500000);
		carro3.setportas("O carro possui 4 portas");
		carro3.setcor("Chevrolet");
		carro3.setmodelo("onix");
		carro3.setaceleracao(160);
		
		carro4.setcor("Vermelho");
		carro4.setpreço(500000);
		carro4.setportas("O carro possui 2 portas");
		carro4.setcor("fiat");
		carro4.setmodelo("uno");
		carro4.setaceleracao(130);
		
		System.out.println("--Caracteristas do carro--");
		System.out.println(carro1.getcor());
		System.out.println(carro1.getpreço());
		System.out.println(carro1.getportas());
		System.out.println(carro1.getmarca());
		System.out.println(carro1.getmodelo());
	
		System.out.println("--Caracteristas do carro2--");
		System.out.println(carro2.getcor());
		System.out.println(carro2.getpreço());
		System.out.println(carro2.getportas());
		System.out.println(carro2.getmarca());
		System.out.println(carro2.getmodelo());
		
		System.out.println("--Caracteristas do carro3--");
		System.out.println(carro3.getcor());
		System.out.println(carro3.getpreço());
		System.out.println(carro3.getportas());
		System.out.println(carro3.getmarca());
		System.out.println(carro3.getmodelo());
		
		System.out.println("--Caracteristas do carro4--");
		System.out.println(carro4.getcor());
		System.out.println(carro4.getpreço());
		System.out.println(carro4.getportas());
		System.out.println(carro4.getmarca());
		System.out.println(carro4.getmodelo());
		
		
	}

}
