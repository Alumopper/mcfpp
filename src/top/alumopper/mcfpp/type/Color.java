package top.alumopper.mcfpp.type;

import top.alumopper.mcfpp.exception.IllegalFormatException;

import java.util.regex.Pattern;

/**
 颜色类，储存了颜色有关的信息
*/
public class Color
{
    public Color() {

    }

    /**
	 聊天栏颜色枚举
	*/
	public enum Colors
	{
		black,
		dark_blue,
		dark_green,
		dark_aqua,
		dark_red,
		dark_purple,
		gold,
		gray,
		dark_gray,
		blue,
		green,
		aqua,
		red,
		light_purple,
		yellow,
		white;

		public static final int SIZE = java.lang.Integer.SIZE;

		public int getValue()
		{
			return this.ordinal();
		}

		public static Colors forValue(int value)
		{
			return values()[value];
		}
	}

	public static Color black = new Color(0, 0, 0);
	public static Color dark_blue = new Color(0, 0, 170);
	public static Color dark_green = new Color(0, 170, 0);
	public static Color dark_aqua = new Color(0, 170, 170);
	public static Color dark_red = new Color(170, 0, 0);
	public static Color dark_purple = new Color(170, 0, 170);
	public static Color gold = new Color(255, 170, 0);
	public static Color gray = new Color(42, 42, 42);
	public static Color dark_gray = new Color(85, 85, 85);
	public static Color blue = new Color(85, 85, 255);
	public static Color green = new Color(85, 255, 85);
	public static Color aqua = new Color(85, 255, 255);
	public static Color red = new Color(255, 85, 85);
	public static Color light_purple = new Color(255, 85, 255);
	public static Color yellow = new Color(255, 255, 85);
	public static Color white = new Color(255, 255, 255);

	/** 
	 hex颜色码
	*/
	public Vector3<String> hex;

	public int r;
	public int g;
	public int b;
	public int alpha = 255;

	/** 
	 根据RGB数值创建一个颜色对象
	*/
	public Color(int red, int green, int blue)
	{
		this.r = red;
		this.g = green;
		this.b = blue;
	}

	/** 
	 根据RGBA数值创建一个颜色对象
	*/
	public Color(int red, int green, int blue, int alpha)
	{
		this.r = red;
		this.g = green;
		this.b = blue;
		this.alpha = alpha;
		hex = RGBtoHEX(red, green, blue);
	}

	/** 
	 根据一个hex码字符串创建一个颜色对象
	 @exception IllegalFormatException 传入的hex码格式不正确
	*/
	public Color(String hex)
	{
		if (!Pattern.matches("^#[a-zA-Z0-9]{6}$",hex))
		{
			throw new IllegalFormatException("无效的HEX颜色码:" + hex);
		}
		this.hex.set(0, hex.substring(1, 3));
		this.hex.set(1, hex.substring(3, 5));
		this.hex.set(2, hex.substring(5, 7));
		Vector3<Integer> qwq = HEXtoRGB(this.hex);
		r = qwq.get(0);
		g = qwq.get(1);
		b = qwq.get(2);
	}

	/** 
	 将rgb转换为hex
	 
	 @return 
	*/
	private static Vector3<String> RGBtoHEX(int R, int G, int B)
	{
		return new Vector3<String>(String.format("%1$.2x", R), String.format("%1$.2x", G), String.format("%1$.2x", B));
	}

	/** 
	 将hex转换为rgb
	 
	 @return 
	*/
	private static Vector3<Integer> HEXtoRGB(Vector3<String> hex)
	{
		return new Vector3<Integer>(Integer.parseInt(hex.get(0), 16), Integer.parseInt(hex.get(1), 16), Integer.parseInt(hex.get(2), 16));
	}

	@Override
	public String toString()
	{
		return "#" + hex.get(0) + hex.get(1) + hex.get(2);
	}

	public final String ToParticleRGBString()
	{
		return r / 255.0 + " " + g / 255.0 + " " + b / 255.0;
	}
}
