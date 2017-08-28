package com.zhiyou100.vrm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date>{
	//Converter<S, T>
	//S:source,需要转换的源的类型
	//T:target,需要转换的目标类型
	@Override
	public Date convert(String str) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		Date date = null;
		try {
			date = df.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
