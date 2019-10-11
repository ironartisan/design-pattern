package factory.abstracted;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 10:47.
 */
public interface CarFactory {
    public BenzCar getBenzCar();
    public TeslaCar getTeslaCar();
}
