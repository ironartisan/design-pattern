package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:20.
 * ����ʽ
 */
public class HungerManVariant {
    // �����ڲ�ʵ����һ��ʵ��
    private static HungerManVariant instance;
    static {
        instance = new HungerManVariant();
    }
    // ˽�л����캯�����ⲿ�޷�����
    private HungerManVariant(){
    }
    // �����ṩ��ȡʵ���ľ�̬����
    public static HungerManVariant getInstance(){
        return instance;
    }

}
