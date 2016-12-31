package cn.snow.rabbitmq.spring;

/**
 * 消费者
 * @author zhijun
 * 具体的spring rabbitmq
 * 生产者使用参考淘淘商城项目taotao-manager-web
 * 消费者使用参考淘淘商城项目taotao-web
 * 注意绑定关系该项目通过网页管理端进行设置的，当然也可以通过配置文件设置
 */
public class Foo {

    //具体执行业务的方法
    public void listen(String foo) {
        System.out.println("消费者： " + foo);
    }
}