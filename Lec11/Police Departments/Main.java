
public class Main {

	public static void main(String[] args) {

		Department p = new Police();
		Department m = new Moror();
		Department f = new FireFighting();
		
		p.start();
		m.start();
		f.start();
		


	}

}
