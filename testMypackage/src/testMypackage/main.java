package testMypackage;

import dz.edu.misso.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {

	public static void main(String[] args)  {
	try {
		Class clas = Class.forName("dz.edu.misso.Point");
		
		Class typeClass[] = {double.class,double.class};
		Constructor cons = clas.getDeclaredConstructor(typeClass);
		Point op = (Point)cons.newInstance(10.0,20.0);

		Method mthMethod = clas.getMethod("translate",double.class,double.class);
		mthMethod.invoke(op, 10.0,20.0);
		
		Field field = clas.getDeclaredField("x");
		field.setAccessible(true);
		
		double v = field.getDouble(op);
		System.out.println(v);
		

	} catch (Exception e) {
		System.out.println(e);
	}
		

	}

}
