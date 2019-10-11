package factory.simple;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:00.
 */
public class OperationSub extends Operation{

    @Override
    public double getResult(){
        return getValue1() - getValue2();
    }
}
