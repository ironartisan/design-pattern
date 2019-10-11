package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:37.
 */
public class DoubleCheckLock {
    //定义实例
    private static DoubleCheckLock instance;

    //私有构造方法
    private DoubleCheckLock(){
    }

    // 定义静态工厂方法
    public static DoubleCheckLock getInstance(){
        //在对象被使用的时候才实例化
        if ( instance == null) {
            synchronized (DoubleCheckLock.class) {
                if (instance == null) {
                    instance = new DoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
