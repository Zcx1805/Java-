package package2;
	class People {
	private String name;
	private int age;
	int num;
	
	public People(String name,int age,int num) {
		this.name=name;
		this.age=age;
		this.num=num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String toString() {
		return "People[name="+name+",age="+age+",num="+num+"]";
	}
}
