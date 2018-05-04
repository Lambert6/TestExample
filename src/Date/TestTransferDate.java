package Date;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTransferDate {

	public static void main(String[] args) throws ParseException {//需要抛出转换异常
		Date a = new Date();//新建日期
		String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(a);//日期转String
		System.out.println(s);
		Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);//String转日期
		System.out.println(date);
		String q = "qqq";
		String w = "www";
		String e =q+w;
		System.out.println(e);
	}

}
