package oo.day01;
//Cell��Ĳ�����
public class CellTest {
	public static void main(String[] args) {
		/*
		Cell c = new Cell(); //�������Ӷ���
		//���ʳ�Ա����
		c.row = 4;  //�к�Ϊ4
		c.col = 5;  //�к�Ϊ5
		//���÷���
		c.drop();
		c.moveLeft(3);
		String s = c.getCellInfo();
		System.out.println(s); //5,2
		
		Cell cc = new Cell();
		String ss = cc.getCellInfo();
		System.out.println(ss); //0,,,0
		*/
		
		Cell c = new Cell();
		c.row = 5;
		c.col = 4;
		print(c); //�൱��Cell cc = c
		
		System.out.println("����һ��");
		c.drop();
		print(c);
		
		System.out.println("����һ��");
		c.moveLeft(2);
		print(c);
	}
	public static void print(Cell cc){
		for(int i=0;i<20;i++){   //�к�
			for(int j=0;j<10;j++){ //�к�
				if(i==cc.row && j==cc.col){
					System.out.print("* ");
				}else{
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	
}
