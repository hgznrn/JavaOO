package AvatarPackage;

//AvatarPackage.Avatar.

import Controller.PlayerController;

public class Avatar extends PlayerController{
	private String name;
	
	public Avatar(String _name)
	{
		setName(_name);
	}
	
	public void setName(String _name)
	{
		if(_name.equals(""))
			System.out.println("名字是空白");
		else
			this.name = _name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void walk() {
		System.out.println(name+ "走路!!");
		this.LocationX = 50;
		this.LocationY = 10;
	}
	
	public void Attack() {
		System.out.println("打3下");
	}
}
