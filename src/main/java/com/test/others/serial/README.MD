序列化的目的和作用.从文件/内存存储和读取时


1、序列化是干什么的？
  简单说就是为了保存在内存中的各种对象的状态，并且可以把保存的对象状态再读出来。虽然你可以用你自己的各种各样的方法来保存Object States，但是Java给你提供一种应该比你自己好的保存对象状态的机制,那就是序列化。

2、什么情况下需要序列化 
a）当你想把的内存中的对象保存到一个文件中或者数据库中时候；
b）当你想用套接字在网络上传送对象的时候；
c）当你想通过RMI传输对象的时候；

3、当对一个对象实现序列化时，究竟发生了什么？
在没有序列化前，每个保存在堆（Heap）中的对象都有相应的状态（state），即实例变量（instance ariable）比如：

Foo myFoo = new Foo(); 
myFoo .setWidth(37); 
myFoo.setHeight(70); 

  当通过下面的代码序列化之后，MyFoo对象中的width和Height实例变量的值（37，70）都被保存到foo.ser文件中，这样以后又可以把它 从文件中读出来，重新在堆中创建原来的对象。当然保存时候不仅仅是保存对象的实例变量的值，JVM还要保存一些小量信息，比如类的类型等以便恢复原来的对 象。

FileOutputStream fs = new FileOutputStream("foo.ser"); 
ObjectOutputStream os = new ObjectOutputStream(fs); 
os.writeObject(myFoo); 

4、实现序列化（保存到一个文件）的步骤

a）Make a FileOutputStream 
java 代码
FileOutputStream fs = new FileOutputStream("foo.ser"); 
b）Make a ObjectOutputStream 

java 代码
ObjectOutputStream os = new ObjectOutputStream(fs); 
c）write the object

java 代码
os.writeObject(myObject1); 
os.writeObject(myObject2); 
os.writeObject(myObject3); 
d) close the ObjectOutputStream

java 代码
os.close(); 

5、举例说明

java 代码
import java.io.*; 

public class Box implements Serializable 
{ 
private int width; 
private int height; 

public void setWidth(int width){ 
this.width = width; 
} 
public void setHeight(int height){ 
this.height = height; 
} 

public static void main(String[] args){ 
Box myBox = new Box(); 
myBox.setWidth(50); 
myBox.setHeight(30); 

try{ 
FileOutputStream fs = new FileOutputStream("foo.ser"); 
ObjectOutputStream os = new ObjectOutputStream(fs); 
os.writeObject(myBox); 
os.close(); 
}catch(Exception ex){ 
ex.printStackTrace(); 
} 
} 

} 

6、相关注意事项

a）当一个父类实现序列化，子类自动实现序列化，不需要显式实现Serializable接口；
b）当一个对象的实例变量引用其他对象，序列化该对象时也把引用对象进行序列化；
c）并非所有的对象都可以序列化，,至于为什么不可以，有很多原因了,比如：

  1.安全方面的原因，比如一个对象拥有private，public等field，对于一个要传输的对象，比如写到文件，或者进行rmi传输 等等，在序列化进行传输的过程中，这个对象的private等域是不受保护的。
  2. 资源分配方面的原因，比如socket，thread类，如果可以序列化，进行传输或者保存，也无法对他们进行重新的资源分 配，而且，也是没有必要这样实现。

