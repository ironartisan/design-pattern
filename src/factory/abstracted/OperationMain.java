package factory.abstracted;

import factory.method.FactoryAdd;
import factory.method.iFactory;
import factory.simple.Operation;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:27.
 * ���󹤳�ģʽ�������½�ɫ��
 * AbstractFactory(���󹤳�)�������������ɳ����Ʒ�ķ���(CarFactory)
 * ConcreteFactory(���幤��)��ʵ���˳��󹤳����������ɳ����Ʒ�ķ���������һ������Ʒ����Щ��Ʒ������һ����Ʒ��(BusinessCarFactory/SportsCarFactory)
 * AbstractProduct(�����Ʒ)��Ϊÿ�ֲ�Ʒ�����ӿڣ��ڳ����Ʒ�ж����˲�Ʒ�ĳ���ҵ�񷽷���(BenzCar/TeslaCar)
 * Product(�����Ʒ)��������幤�������ľ����Ʒ����ʵ�ֳ����Ʒ�ӿ��ж����ҵ�񷽷���(TeslaSportsCar/TeslaBusinessCar)
 */
public class OperationMain {
    public static void main(String[] args) {
        SportsCarFactory sportsCarFactory = new SportsCarFactory();
        BenzCar benzCar = sportsCarFactory.getBenzCar();
        benzCar.gasUp();
    }
}
