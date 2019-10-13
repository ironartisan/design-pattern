package builder.case2;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/13 11:13.
 * https://www.hollischuang.com/archives/1477
 */
public class CommonBuilder extends Builder {
    @Override
    public void buildHead() {
        role.setHead("common head");
    }

    @Override
    public void buildFace() {
        role.setFace("common face");

    }

    @Override
    public void buildBody() {
        role.setBody("common body");

    }

    @Override
    public void buildHp() {
        role.setHp(120d);

    }

    @Override
    public void buildSp() {
        role.setSp(140d);

    }

    @Override
    public void buildMp() {
        role.setMp(160d);

    }
}
