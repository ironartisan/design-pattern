package factory.method;

import factory.simple.Operation;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:27.
 *��������ģʽ�������½�ɫ��
 * Product�������Ʒ��Operation��
 * ConcreteProduct�������Ʒ(OperationAdd)
 * Factory�����󹤳�(IFactory)
 * ConcreteFactory�����幤��(AddFactory
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
