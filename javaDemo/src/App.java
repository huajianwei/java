public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println( "hello,java!");
    }
}


/*
 * 成员访问控制符
 * public
 * private
 * default
 * protect
 * 子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问
 * 子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法
 * protected 可以修饰数据成员，构造方法，方法成员，不能修饰类（内部类除外）
 */