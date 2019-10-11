package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:20.
 * 饿汉式
 */
public class HungerMan {
    // 在类内部实例化一个实例
    private static HungerMan instance = new HungerMan();
    // 私有化构造函数，外部无法访问
    private HungerMan(){
    }
    // 对外提供获取实例的静态方法
    public static HungerMan getInstance(){
        return instance;
    }

}
