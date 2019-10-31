package app;

public class Member implements IMember{
	String name = "이준호";
	int age = 27;
	String addr = "광산구";
	private BigMouse big;
   public void init() {
        System.out.println("init member");
    }
    
    public void destroy() {
        System.out.println("destroy member");
    }
	public Member(String name, int age, String addr,BigMouse big) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.big = big;
	}
	public BigMouse getBig() {
		return big;
	}

	public void setBig(BigMouse big) {
		this.big = big;
	}

	public Member() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + ", big=" + big + "]";
	}
}
