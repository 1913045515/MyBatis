package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE));
	}
}
