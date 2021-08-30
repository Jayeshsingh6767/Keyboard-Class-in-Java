package com.thinking.machines.utils;
import java.io.*;
public class Keyboard
{
private BufferedReader bufferedReader; 
public Keyboard()
{
bufferedReader=new BufferedReader(new InputStreamReader(System.in));
}
public String getString()
{
String str;
try
{
str=bufferedReader.readLine();
}catch(IOException ioException)
{
str="";
}
return str;
}
public String getString(String message)
{
System.out.print(message);
return getString();
}

public char getCharacter()
{
return getString().charAt(0);
}
public char getCharacter(String message)
{
System.out.print(message);
return getCharacter();
}

public int getInt()
{
int i=0;
String str=getString();
try
{
i=Integer.parseInt(str);
}catch(NumberFormatException nfe)
{
return 0;
}
return i;
}

public int getInt(String message)
{
System.out.print(message);
return getInt();
}

public long getLong()
{
long i=0;
String str=getString();
try
{
i=Long.parseLong(str);
}catch(NumberFormatException nfe)
{
return 0;
}
return i;
}

public long getLong(String message)
{
System.out.print(message);
return getLong	();
}

public short getShort()
{
short i=0;
String str=getString();
try
{
i=Short.parseShort(str);
}catch(NumberFormatException nfe)
{
return 0;
}
return i;
}

public short getShort(String message)
{
System.out.print(message);
return getShort();
}


public byte getByte()
{
byte i=0;
String str=getString();
try
{
i=Byte.parseByte(str);
}catch(NumberFormatException nfe)
{
return 0;
}
return i;
}

public byte getByte(String message)
{
System.out.print(message);
return getByte();
}

public double getDouble()
{
double i=0;
String str=getString();
try
{
i=Double.parseDouble(str);
}catch(NumberFormatException nfe)
{
return 0;
}
return i;
}

public double getDouble(String message)
{
System.out.print(message);
return getDouble();
}

public float getFloat()
{
float i=0;
String str=getString();
try
{
i=Float.parseFloat(str);
}catch(NumberFormatException nfe)
{
return 0;
}
return i;
}

public float getFloat(String message)
{
System.out.print(message);
return getFloat();
}

public boolean getBoolean()
{
boolean i=false;
String str=getString();
try
{
i=Boolean.parseBoolean(str);
}catch(NumberFormatException nfe)
{
return false;
}
return i;
}

public boolean getBoolean(String message)
{
System.out.print(message);
return getBoolean();
}


}
