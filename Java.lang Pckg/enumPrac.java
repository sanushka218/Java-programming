enum dept{
	CS("032","A block"),
	IT("035", "B block"),
	CIVIL("021","c block"),
	MECH("022","D block"),
	ECE("030","E block");
	String code;
	String block;
	private dept(String c, String b)
	{
		this.code=c;
		this.block=b;
		System.out.println(this.name()+" "+this.code+" "+this.block);
	}
	public void display()
	{
		System.out.println(this.name()+" "+this.ordinal());
	}
	public String getCode()
	{
	    return code;	
	}
	public String getBlock()
	{
		return block;
	}
}
public class enumPrac {

	public static void main(String[] args) {

		dept d=dept.ECE;
		d.display();
		System.out.println(d.getCode());
		System.out.println(d.getBlock());
		/*
		switch(d)
		{
		case CS: System.out.println("Cs department student");
		break;
		case IT: System.out.println("IT department student");
		break;
		case CIVIL: System.out.println("CIVIL department student");
		break;
		case MECH: System.out.println("MECHANICAL department student");
		break;
		case ECE: System.out.println("ELECTRONICS department student");
		break;
		}
		*/
	}

}
