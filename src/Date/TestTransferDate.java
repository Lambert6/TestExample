package Date;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTransferDate {

	public static void main(String[] args) throws ParseException {//��Ҫ�׳�ת���쳣
		Date a = new Date();//�½�����
		String s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(a);//����תString
		System.out.println(s);
		Date date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);//Stringת����
		System.out.println(date);
		String q = "qqq";
		String w = "www";
		String e =q+w;
		System.out.println(e);
	}

}
