package dreamco.project.web;


import dreamco.project.model.Role;
import dreamco.project.model.User;
import dreamco.project.web.matcher.ModelMatcher;

import java.util.Objects;

import static dreamco.project.model.BaseEntity.START_SEQ;

public class UserTestData {
    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;

    public static final User USER = new User(USER_ID, "User", "user@yandex.ru", "password", Role.ROLE_USER);
    public static final User ADMIN = new User(ADMIN_ID, "Admin", "admin@gmail.com", "admin", Role.ROLE_ADMIN);

    public static final ModelMatcher<User> MATCHER = new ModelMatcher<>(
            (expected, actual) -> expected == actual ||
                    (Objects.equals(expected.getPassword(), actual.getPassword())
                            && Objects.equals(expected.getId(), actual.getId())
                            && Objects.equals(expected.getName(), actual.getName())
                            && Objects.equals(expected.getEmail(), actual.getEmail())
//                            && Objects.equals(expected.getCaloriesPerDay(), actual.getCaloriesPerDay())
                            && Objects.equals(expected.isEnabled(), actual.isEnabled())
//                            && Objects.equals(expected.getRoles(), actual.getRoles())
                    )
    );
}