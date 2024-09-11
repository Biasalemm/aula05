package POOAula2;

public class AviaoObjeto {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();
		
		aviao.setcor("Branco");
		aviao.setpreço(1000000);
		aviao.setportas(2);
		aviao.setmotor(2);
		aviao.setpassageiro(45);
		aviao.setmarca("Airbus");
		aviao.setmodelo("Grande porte");
		
		aviao2.setcor("Branco e verde");
		aviao2.setpreço(1500000);
		aviao2.setportas(3);
		aviao2.setmotor(2);
		aviao2.setpassageiro(60);
		aviao2.setmarca("Airbus");
		aviao2.setmodelo("Extra Grande porte");
		
		aviao3.setcor("Branco e laranja");
		aviao3.setpreço(2500000);
		aviao3.setportas(2);
		aviao3.setmotor(2);
		aviao3.setpassageiro(25);
		aviao3.setmarca("Gol");
		aviao3.setmodelo("pequeno porte");
		
		aviao4.setcor("Branco e azul");
		aviao4.setpreço(200000);
		aviao4.setportas(2);
		aviao4.setmotor(2);
		aviao4.setpassageiro(37);
		aviao4.setmarca("Azul");
		aviao4.setmodelo("médio porte");
		
		
		
		
		System.out.println("--Caracteristas do avião 1--");
		System.out.println(aviao.getcor());
		System.out.println(aviao.getpreço());
		System.out.println(aviao.getportas());
		System.out.println(aviao.getmarca());
		System.out.println(aviao.getmodelo());
		

		System.out.println("--Caracteristas do avião 2--");
		System.out.println(aviao2.getcor());
		System.out.println(aviao2.getpreço());
		System.out.println(aviao2.getportas());
		System.out.println(aviao2.getmarca());
		System.out.println(aviao2.getmodelo());
		

		System.out.println("--Caracteristas do avião 3--");
		System.out.println(aviao3.getcor());
		System.out.println(aviao3.getpreço());
		System.out.println(aviao3.getportas());
		System.out.println(aviao3.getmarca());
		System.out.println(aviao3.getmodelo());
		
		
		System.out.println("--Caracteristas do avião 4--");
		System.out.println(aviao.getcor());
		System.out.println(aviao.getpreço());
		System.out.println(aviao.getportas());
		System.out.println(aviao.getmarca());
		System.out.println(aviao.getmodelo());

	}

}
