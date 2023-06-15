package class_02;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Chapter02Exercise20 {

	public static void main(String[] args) {
		Date today;
		today = new Date();
		
		SimpleDateFormat simpleDateFormat;
		simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
		
		String formattedDate = simpleDateFormat.format(today);
		System.out.println(formattedDate);
	}

}
