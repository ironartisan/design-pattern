package factory.simple;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:12.
 * Factory:���Ǳ�ģʽ�ĺ���,����һ������ҵ�߼����ж��߼�����java���������� һ��������ʵ�֡���OperationFactory��
 * Product:��һ���Ǿ����Ʒ�̳еĸ������ʵ�ֵĽӿڡ���java���ɽӿڻ��߳�������ʵ�֡���Operation��
 * ConcreteProduct:�������������Ķ�����Ǵ˽�ɫ��ʵ������java����һ��������ʵ�֡�
 * ������ͼ�������ı�ʾ�µ�����֮��Ĺ�ϵ��OperationAdd\OperationSub�ȣ�
 */
public class OperationMain {
    public static void main(String[] args) {
        Operation operation = OpeartionFactory.createOpeartion("+");
        operation.setValue1(10);
        operation.setValue2(5);
        System.out.println("The result is " + operation.getResult());
    }
}
