package service;

/**
 * 获取本地接口代理对象并完成调用
 * @author Administrator
 */
public class Invoke {
    public static void main(String[] args) {
        //获取本地接口代理对象
        SayHello sayHelloPort = new SayHelloService().getSayHelloPort();
        System.out.println(sayHelloPort.getClass());
        //通过代理对象调用远程服务方法
        System.out.println(sayHelloPort.sayHello("张三  "));
    }
}

