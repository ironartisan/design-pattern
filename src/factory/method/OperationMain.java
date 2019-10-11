package factory.method;

import factory.simple.Operation;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:27.
 *工厂方法模式包含如下角色：
 * Product：抽象产品（Operation）
 * ConcreteProduct：具体产品(OperationAdd)
 * Factory：抽象工厂(IFactory)
 * ConcreteFactory：具体工厂(AddFactory
 */
public class OperationMain {
    public static void main(String[] args) {
        iFactory factory = new FactoryAdd();
        Operation operationAdd = factory.createOperation();
        operationAdd.setValue1(10);
        operationAdd.setValue2(2);
        System.out.println(operationAdd.getResult());
    }
}
