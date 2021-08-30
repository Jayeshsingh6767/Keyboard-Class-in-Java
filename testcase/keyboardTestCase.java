import com.thinking.machines.utils.*;
class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
System.out.print("Enter a String:");
String a=k.getString();
String b=k.getString("Enter another String:");
char c;
c=k.getCharacter("Enter gender:");
long d;
d=k.getLong("Enter a long type value:");
int e;
e=k.getInt("Enter an integer type value:");
short f;
f=k.getShort("Enter a short type value:");
byte g;
g=k.getByte("Enter a byte type value:");
double h;
h=k.getDouble("Enter a Double type value:");
float i;
i=k.getFloat("Enter a flaot type value:");
boolean j;
j=k.getBoolean("Enter a boolean type value:");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);
}
}