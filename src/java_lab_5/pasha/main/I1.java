package java_lab_5.pasha.main;

public interface I1 {

	public default String i1() {

		return "Interface I1, Method i1";
		
		/*
		 * Class<?> enclosingClass = getClass().getEnclosingClass(); if
		 * (enclosingClass != null) {
		 * System.out.println(enclosingClass.getName()); } else {
		 * System.out.println(getClass().getName()); }
		 * 
		 * String name = new
		 * Object(){}.getClass().getEnclosingMethod().getName();
		 * System.out.println("Method name: " + name);
		 */
	};
}
