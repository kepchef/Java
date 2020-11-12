package p213;

import p209.Amd;
import p209.GraphicCard;
import p210.Nvidia;

public class ObjectEx {
	public static void main(String[] args) {
		
		allobject(new GraphicCard());
		allobject(new Amd());
		allobject(new Nvidia());
		allobject("¾È³ç");
		
	}
	public static void allobject(Object obj) {
		System.out.println(obj.toString());
	}

}
