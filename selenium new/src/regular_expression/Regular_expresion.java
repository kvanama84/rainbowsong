package regular_expression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regular_expresion {

	public static void main(String[] args) {
		String str="hello wo%rld @#$ abc";
		String ptr="[@#$%]";
		Pattern p= Pattern.compile(ptr);
        Matcher m=p.matcher(str);
        while(m.find())
        {System.out.println(m.group());}
	}

}
