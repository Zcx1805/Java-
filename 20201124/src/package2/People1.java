package package2;

public class People1 {

	public static void main(String[] args) {
		People people=new People("ÕÅÈý",15,100);
		System.out.println(people.toString());
		people.num=200;
		//people.age=20;±¨´í
		System.out.println(people.toString());
		people.setAge(20);
		System.out.println(people.toString());
		System.out.println(people.getAge());
			}
		}
	

