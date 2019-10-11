package factory.simple;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:00.
 */
public class OperationDiv extends Operation{

    @Override
    public double getResult(){
        if(getValue2() != 0){
            return getValue1() / getValue2();
        }
        throw new IllegalArgumentException("除数不能为0");
    }
}
