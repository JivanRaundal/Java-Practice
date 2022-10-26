/* # toString() :-

-non-static method defined in Object class but, we have to override it in our local class.
-When we print refrence variable of class this method will automatically get called.
-As it is non-static method, it works for calling object. Hence, members of calling object becomes directly accessible in toString().
-SYNTAX :- public String toString()
*/

class Student
{
	int age;
	String name;
	
	public Student(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()	//Overriding 'toString()' method of Object class here (must be public only)
	{
		return "Student Class Object, name = " + name + "  age = " + age;		
	}
}

class Pro29_toString
{
	public static void main(String args[])
	{
		Student st = new Student("Jivan",21);
		
		System.out.println(st);		//Student Class Object, name = Jivan  age = 21
		//Note :- here, toString() method get's called automatically
		//Sequence :-   s.o.p(st); => String.valueOf(st);  => st.toString();
	}
}