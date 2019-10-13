package builder.case2;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/13 11:17.
 */
public class Director {
    public void construct(Builder builder){
        builder.buildHead();
        builder.buildFace();
        builder.buildBody();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
