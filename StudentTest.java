package oo.day01;
//ѧ���������
public class StudentTest {
	public static void main(String[] args) {
		Student zs = new Student();
		zs.name = "zhangsan";
		zs.age = 25;
		zs.address = "�ӱ��ȷ�";
		zs.study();
		zs.sayHi();
		
		Student ls = new Student();
		ls.name = "lisi";
		ls.age = 26;
		ls.address = "������";
		ls.study();
		ls.sayHi();
		
		//new��������󣬳�Ա������Ĭ��ֵ
		Student ww = new Student();
		ww.sayHi();
		
	}
}
