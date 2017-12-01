package oo.day01;
//格子类
public class Cell {
	int row;   //行号
	int col;   //列号
	
	void drop(){  //下落1格
		row++;
	}
	void moveLeft(int n){  //左移n格
		col -= n;
	}
	String getCellInfo(){  //获取格子坐标
		return row+",,,"+col;
	}

}





