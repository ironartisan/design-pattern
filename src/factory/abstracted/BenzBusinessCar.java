package factory.abstracted;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:43.
 */
public class BenzBusinessCar implements BenzCar{
    @Override
    public void gasUp() {
        System.out.println("给奔驰商务车加一般的汽油");
    }
}
