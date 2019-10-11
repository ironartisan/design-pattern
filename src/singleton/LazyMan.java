package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:37.
 */
public class LazyMan {
    //����ʵ��
    private static LazyMan instance;

    //˽�й��췽��
    private LazyMan(){
    }

    // ���徲̬��������
    public static LazyMan getInstance(){
        //�ڶ���ʹ�õ�ʱ���ʵ����
        if ( instance == null) {
            instance = new LazyMan();
        }
        return instance;
    }
}
