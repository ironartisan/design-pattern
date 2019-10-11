package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:24.
 */
public class SingletonMain {
    public static void main(String[] args) {
        // code1: HungryMan
        HungerMan instance1 = HungerMan.getInstance();
        HungerMan instance2 = HungerMan.getInstance();
        System.out.println("饿汉模式结果是" + (instance1 == instance2));

        // code2: HungryManVariant
        HungerManVariant instance3 = HungerManVariant.getInstance();
        HungerManVariant instance4 = HungerManVariant.getInstance();
        System.out.println("饿汉变种模式结果是" + (instance3 == instance4));

        // code3: StaticInner
        StaticInner instance5 = StaticInner.getInstance();
        StaticInner instance6 = StaticInner.getInstance();
        System.out.println("静态内部类模式结果是" + (instance5 == instance6));

        // code4: LazyMan
        LazyMan instance7 = LazyMan.getInstance();
        LazyMan instance8 = LazyMan.getInstance();
        System.out.println("懒汉模式结果是" + (instance7 == instance8));

        // code5: DoubleCheckLock
        DoubleCheckLock instance9 = DoubleCheckLock.getInstance();
        DoubleCheckLock instance10 = DoubleCheckLock.getInstance();
        System.out.println("双重校验锁结果是" + (instance9 == instance10));

        // code6: SingletonEnum
        SingletonEnum instance11 = SingletonEnum.INSTANCE;
        SingletonEnum instance12 = SingletonEnum.INSTANCE;
        System.out.println("枚举式结果是" + (instance11 == instance12));
    }


}
