package factory.simple;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:05.
 * the core of the pattern
 */
public class OpeartionFactory {
    public  static Operation createOpeartion(String operation){
        Operation oper = null;
        switch (operation){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                    throw  new UnsupportedOperationException("不支持的操作");
        }
        return oper;
    }
}
