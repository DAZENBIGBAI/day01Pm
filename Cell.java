package oo.day01;
//������
public class Cell {
	int row;   //�к�
	int col;   //�к�
	
	void drop(){  //����1��
		row++;
	}
	void moveLeft(int n){  //����n��
		col -= n;
	}
	String getCellInfo(){  //��ȡ��������
		return row+",,,"+col;
	}

}





