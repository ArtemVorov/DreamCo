package dreamco.project.web;


import dreamco.project.model.Desire;
import dreamco.project.web.matcher.ModelMatcher;

import static dreamco.project.model.BaseEntity.START_SEQ;


public class DesireTestData {

    public static final ModelMatcher<Desire> MATCHER = new ModelMatcher<>();

    public static final int MEAL1_ID = START_SEQ + 2;
    public static final int ADMIN_MEAL_ID = START_SEQ + 8;

//    public static final Desire MEAL1 = new Desire(MEAL1_ID, of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500);
//    public static final Desire MEAL2 = new Desire(MEAL1_ID + 1, of(2015, Month.MAY, 30, 13, 0), "Обед", 1000);
//    public static final Desire MEAL3 = new Desire(MEAL1_ID + 2, of(2015, Month.MAY, 30, 20, 0), "Ужин", 500);
//    public static final Desire MEAL4 = new Desire(MEAL1_ID + 3, of(2015, Month.MAY, 31, 10, 0), "Завтрак", 500);
//    public static final Desire MEAL5 = new Desire(MEAL1_ID + 4, of(2015, Month.MAY, 31, 13, 0), "Обед", 1000);
//    public static final Desire MEAL6 = new Desire(MEAL1_ID + 5, of(2015, Month.MAY, 31, 20, 0), "Ужин", 510);
//    public static final Desire ADMIN_MEAL1 = new Desire(ADMIN_MEAL_ID, of(2015, Month.JUNE, 1, 14, 0), "Админ ланч", 510);
//    public static final Desire ADMIN_MEAL2 = new Desire(ADMIN_MEAL_ID + 1, of(2015, Month.JUNE, 1, 21, 0), "Админ ужин", 1500);

//    public static final List<Desire> MEALS = Arrays.asList(MEAL6, MEAL5, MEAL4, MEAL3, MEAL2, MEAL1);

//    public static Desire getCreated() {
//        return new Desire(null, of(2015, Month.JUNE, 1, 18, 0), "Созданный ужин", 300);
//    }
//
//    public static Desire getUpdated() {
//        return new Desire(MEAL1_ID, MEAL1.getDateTime(), "Обновленный завтрак", 200);
//    }
}
