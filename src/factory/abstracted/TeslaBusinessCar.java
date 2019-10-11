package factory.abstracted;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:43.
 */
public class TeslaBusinessCar implements TeslaCar{
    @Override
    public void charge() {
        System.out.println("给特斯拉跑车充满电");
    }
}
