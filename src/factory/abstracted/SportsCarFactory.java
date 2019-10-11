package factory.abstracted;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/11 16:57.
 */
public class SportsCarFactory implements CarFactory {
    @Override
    public BenzCar getBenzCar() {
        return new BenzSportCar();
    }

    @Override
    public TeslaCar getTeslaCar() {
        return new TeslaSportCar();
    }
}
