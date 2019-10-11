package factory.abstracted;

import factory.method.FactoryAdd;
import factory.method.iFactory;
import factory.simple.Operation;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:27.
 * 抽象工厂模式包含如下角色：
 * AbstractFactory(抽象工厂)：用于声明生成抽象产品的方法(CarFactory)
 * ConcreteFactory(具体工厂)：实现了抽象工厂声明的生成抽象产品的方法，生成一组具体产品，这些产品构成了一个产品族(BusinessCarFactory/SportsCarFactory)
 * AbstractProduct(抽象产品)：为每种产品声明接口，在抽象产品中定义了产品的抽象业务方法；(BenzCar/TeslaCar)
 * Product(具体产品)：定义具体工厂生产的具体产品对象，实现抽象产品接口中定义的业务方法。(TeslaSportsCar/TeslaBusinessCar)
 */
public class OperationMain {
    public static void main(String[] args) {
        SportsCarFactory sportsCarFactory = new SportsCarFactory();
        BenzCar benzCar = sportsCarFactory.getBenzCar();
        benzCar.gasUp();
    }
}
