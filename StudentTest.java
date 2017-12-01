package oo.day01;
//学生类测试类
public class StudentTest {
	public static void main(String[] args) {
		Student zs = new Student();
		zs.name = "zhangsan";
		zs.age = 25;
		zs.address = "河北廊坊";
		zs.study();
		zs.sayHi();
		
		Student ls = new Student();
		ls.name = "lisi";
		ls.age = 26;
		ls.address = "黑龙江";
		ls.study();
		ls.sayHi();
		
		//new创建对象后，成员变量有默认值
		Student ww = new Student();
		ww.sayHi();
		
	}
}
