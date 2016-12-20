package AvatarBase;

import AvatarPackage.Avatar;

public class NamekAvatar extends Avatar {
	
	public NamekAvatar(String _name)
	{
		super(_name);
	}
	
	public void walk() {
		System.out.println("那美克星人" + getName() + "走路有事!!");
		this.LocationX = 5;
		this.LocationY = -50;
	}
}
