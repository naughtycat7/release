package taskRelease.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FunUtil {
	/**
	 * 将以微秒表示的时间转换为指定格式时间的字符串
	 * @author Administrator
	 * @param sec long型时间
	 * @param pattern 返回时间的格式
	 * @return str指定格式时间的字符串*/
	public static String longToDateTimeStr(long sec,String pattern){
		Date date = new Date(sec);
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(date);
		return str;
	}
}
