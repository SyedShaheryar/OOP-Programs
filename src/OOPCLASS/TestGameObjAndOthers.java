package OOPCLASS;

public class TestGameObjAndOthers {

	public static void main(String[] args) {

		Menu m = new Menu();
		m.draw();
		Player p = new Player();
		p.draw();
		

		GameObj m1 = new Menu();
		m1.draw();
		GameObj p1 = new Player();
		p1.draw();
		
		GameObj A[] = new GameObj[2];
		A[0] = m;
		A[1] = p;
		
		for(int i=0;i<2;i++)
		{
			A[i].draw();
			
		}
	}



}


