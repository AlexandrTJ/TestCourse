import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getAllUsers_NO_NULL() {
        //добавим проверку на null
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }
    @Test
    public void getAllUsers() {
        //создаем тестовые данные
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);

        //создаем список expected и заполняем его данными нашего метода
        List<User> expected = User.getAllUsers();

        //создаем список actual в него помещаем данные для сравнения
        //то что мы предпологиаем метод должен вернуть
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
//        actual.add(user2);

        //запускаем тест, в случае если список expected и actual не будут равны
        //тест будет провален, о результатах теста читаем в консоли
        Assert.assertEquals("is not OK",expected, actual);
    }

//    @Test
//    public void testGetAllUsers() {
//    }
//
//    @Test
//    public void getHowManyUsers() {
//    }
//
//    @Test
//    public void testGetHowManyUsers() {
//    }
//
//    @Test
//    public void getAllAgeUsers() {
//    }
//
//    @Test
//    public void testGetAllAgeUsers() {
//    }
//
//    @Test
//    public void getAverageAgeOfAllUsers() {
//    }
//
//    @Test
//    public void testGetAverageAgeOfAllUsers() {
//    }
}