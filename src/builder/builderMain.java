package builder;

import builder.case1.User;
import builder.case2.CommonBuilder;
import builder.case2.Director;
import builder.case2.Role;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/13 10:22.
 */
public class builderMain {
    public static void main(String[] args) {
        Director director = new Director();
        CommonBuilder commonBuilder = new CommonBuilder();
        director.construct(commonBuilder);
        Role role = commonBuilder.getRole();
        System.out.println(role);
    }
}
