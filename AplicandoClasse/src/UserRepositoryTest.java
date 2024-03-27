// FILEPATH: /c:/Users/mateu/Desktop/Backup/Estudos/Fatec/2 semestre/bertoti/AplicandoClasse/src/UserRepositoryTest.java
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRepositoryTest {
    private UserRepository userRepository;
    private User user;

    @Before
    public void setUp() {
        userRepository = new UserRepository();
        user = new User(1, "Teste", "teste@teste.com", "senha");
    }

    @Test
    public void testAddUser() {
        userRepository.addUser(user);
        Assert.assertEquals(user, userRepository.getUserByEmail("teste@teste.com"));
    }

    @Test
    public void testGetUserByEmail() {
        userRepository.addUser(user);
        User foundUser = userRepository.getUserByEmail("teste@teste.com");
        Assert.assertEquals(user, foundUser);
    }

    @Test
    public void testGetUserById() {
        userRepository.addUser(user);
        User foundUser = userRepository.getUserById(1);
        Assert.assertEquals(user, foundUser);
    }

    @Test
    public void testGetUserByUsername() {
        userRepository.addUser(user);
        User foundUser = userRepository.getUserByUsername("Teste");
        Assert.assertEquals(user, foundUser);
    }

    @Test
    public void testRemoveUser() {
        userRepository.addUser(user);
        userRepository.removeUser(user);
        Assert.assertNull(userRepository.getUserByEmail("teste@teste.com"));
    }
}