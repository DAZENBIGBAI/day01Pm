package oo.day01;
//Cell类的测试类
public class CellTest {
	public static void main(String[] args) {
		/*
		Cell c = new Cell(); //创建格子对象
		//访问成员变量
		c.row = 4;  //行号为4
		c.col = 5;  //列号为5
		//调用方法
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
		print(c); //相当于Cell cc = c
		
		System.out.println("下落一行");
		c.drop();
		print(c);
		
		System.out.println("左移一行");
		c.moveLeft(2);
		print(c);
	}
	public static void print(Cell cc){
		for(int i=0;i<20;i++){   //行号
			for(int j=0;j<10;j++){ //列号
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
