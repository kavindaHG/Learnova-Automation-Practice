package factories;

import com.github.javafaker.Faker;
import models.User;

public class UserFactoryData {

    private static final String DEFAULT_PASSWORD = "Thepwd@2023";
    private static final Faker faker;

    static {
        faker = new Faker();
    }

    public static User createUserDefault(){
        User user = new User();
        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setEmail(faker.internet().safeEmailAddress());
        user.setPassword(DEFAULT_PASSWORD);
        user.setConfirmPassword(DEFAULT_PASSWORD);
        user.setAgreePrivacyPolicy(true);
        return user;
    }
}
