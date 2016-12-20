package AvatarBase;

import AvatarPackage.Avatar;

public class SaiyanAvatar extends Avatar  {	
	
	public SaiyanAvatar(String _name) 
	{
		super(_name);
	}
	
	public void Transformer() {
		setName("aaaa");
		System.out.println("賽亞人" + getName() + "變身超級賽亞人!!");
	}
	
	public void walk() {
		System.out.println("賽亞人" + getName() + "走路路會裂!!");
		this.LocationX = 5;
		this.LocationY = -50;
	}
	
	public void Attack() {
		super.Attack();
		System.out.println(getName() + "使出龜派氣功!!!");
	}
}
