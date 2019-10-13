package builder.case2;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/13 11:10.
 * https://www.hollischuang.com/archives/1477
 */
public abstract class Builder {
    protected Role role = new Role();

    public abstract void buildHead();
    public abstract void buildFace();
    public abstract void buildBody();
    public abstract void buildHp();
    public abstract void buildSp();
    public abstract void buildMp();

    public Role getRole(){
        return role;
    }

}
