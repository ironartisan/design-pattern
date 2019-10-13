package builder.case1;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/13 10:01.
 * 创建一个类，有必选和可选属性。
 * 若使用getter和setter方法，创建一个对象，所有的属性都要赋值.
 * 创建者模式方法
 * https://www.hollischuang.com/archives/1533
 */
public class User {
    // required
    private final String firstName;
    private final String lastName;
    // optional
    private final int age;
    private final String phone;
    private final String address;

    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        public User build() {
            return new User(this);
        }


    }
}