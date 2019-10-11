package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:20.
 * 饿汉式
 */
public class HungerManVariant {
    // 在类内部实例化一个实例
    private static HungerManVariant instance;
    static {
        instance = new HungerManVariant();
    }
    // 私有化构造函数，外部无法访问
    private HungerManVariant(){
    }
    // 对外提供获取实例的静态方法
    public static HungerManVariant getInstance(){
        return instance;
    }

}
