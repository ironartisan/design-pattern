package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:20.
 * ����ʽ
 */
public class StaticInner {
    // �����ڲ�ʵ����һ��ʵ��
    private static class SingletonHolder{

    private static final StaticInner INSTANCE = new StaticInner();
    }
    // ˽�л����캯�����ⲿ�޷�����
    private StaticInner(){
    }
    // �����ṩ��ȡʵ���ľ�̬����
    public static StaticInner getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
