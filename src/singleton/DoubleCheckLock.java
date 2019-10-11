package singleton;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 19:37.
 */
public class DoubleCheckLock {
    //����ʵ��
    private static DoubleCheckLock instance;

    //˽�й��췽��
    private DoubleCheckLock(){
    }

    // ���徲̬��������
    public static DoubleCheckLock getInstance(){
        //�ڶ���ʹ�õ�ʱ���ʵ����
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
