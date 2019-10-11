package factory.simple;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:12.
 * Factory:这是本模式的核心,含有一定的商业逻辑和判断逻辑。在java中它往往由 一个具体类实现。（OperationFactory）
 * Product:它一般是具体产品继承的父类或者实现的接口。在java中由接口或者抽象类来实现。（Operation）
 * ConcreteProduct:工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现。
 * 来用类图来清晰的表示下的它们之间的关系（OperationAdd\OperationSub等）
 */
public class OperationMain {
    public static void main(String[] args) {
        Operation operation = OpeartionFactory.createOpeartion("+");
        operation.setValue1(10);
        operation.setValue2(5);
        System.out.println("The result is " + operation.getResult());
    }
}
