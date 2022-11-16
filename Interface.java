package assignment;

interface Interface{
	void a();
}  
class A implements Interface{  
public	void a() {
		System.out.println("Hi");
	}
public void b()
{System.out.println("b method");}  
}  
class B implements Interface{ 
	public	void a() {
		System.out.println("Hi");
	}
public void c(){System.out.println("c method");}  
}  
  
class Call{  
void invoke(Interface p){  
if(p instanceof A){  
A b=(A)p;   
b.b();  
}  
if(p instanceof B){  
B c=(B)p;  
c.c();  
}  
  
}  
} 
  
class Interfaces{  
public static void main(String args[]){  
A p=new A();
p.a();
Call c=new Call(); 
c.invoke(p); 
B d=new B();
d.a();
Call e=new Call(); 
e.invoke(d); 
 
}  
}  