volatile关键字的使用

对于volatile修饰的变量，jvm虚拟机只是保证从主内存加载到线程工作内存的值是最新的

在java虚拟机并发编程上看到这样的一句话: 由于针对每个volatile字段的访问都是各自独立处理的, 并且也无法将这些访问统一协调称一次访问, 
所以volatile关键字无法保证整体操作的原子性. 该问题所造成的后果是, 线程很可能对某些字段只能看到其中间的结果, 而对另一些变量则看到的是最终
的变更结果.作者给出的解决方法之一就是用synchronized修饰的get,set方法去访问这个volatile变量

volatile虽然可以保证多线程对修改可见，但笔者的代码中用到了
count++， 主要是count++不是原子性操作，这个会编译成count = count +1； 所以会出现多线程访问冲突问题

ConcurrentHashMap 中 volatile 中的用法。