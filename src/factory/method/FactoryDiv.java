package factory.method;

import factory.simple.Operation;
import factory.simple.OperationDiv;
import factory.simple.OperationMul;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:25.
 */
public class FactoryDiv implements iFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
