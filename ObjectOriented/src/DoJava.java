
import java.awt.List;

import AvatarBase.*;
import AvatarPackage.Avatar;
//import AvatarBase.NamekAvatar;


public class DoJava {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Test1");
		
		Avatar markshine = new Avatar("markshine");
		markshine.walk();
		
		Avatar vivi = new Avatar("vivi");
		vivi.walk();
		
		
		SaiyanAvatar sa = new SaiyanAvatar("悟空");
		NamekAvatar nav = new NamekAvatar("比克");
		
		//利用陣列去達到多型
		Avatar[] avatars = new Avatar[] {sa, nav};
		
		for(int i = 0; i < avatars.length; i++)
			avatars[i].walk();
	}
}
