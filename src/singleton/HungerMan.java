package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:20.
 * ����ʽ
 */
public class HungerMan {
    // �����ڲ�ʵ����һ��ʵ��
    private static HungerMan instance = new HungerMan();
    // ˽�л����캯�����ⲿ�޷�����
    private HungerMan(){
    }
    // �����ṩ��ȡʵ���ľ�̬����
    public static HungerMan getInstance(){
        return instance;
    }

}
