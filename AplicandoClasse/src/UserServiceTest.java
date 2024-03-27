import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
    private UserRepository userRepository;
    private UserService userService;

    @Before
    public void setUp() {
        userRepository = new UserRepository();
        userService = new UserService(userRepository);
    }

    @Test
    public void testLoginUser() {
        User user = new User(1, "teste@teste.com", "email@teste.com", "senha");
        userRepository.addUser(user);

        User usuarioLogado = userService.loginUser("teste@teste.com", "senha");

        Assert.assertEquals(user, usuarioLogado);
    }

    @Test
    public void testRegisterUser() {
        userService.registerUser("testeRegister@teste.com", "email@teste.com", "senha");

        User usuarioRegistrado = userRepository.getUserByEmail("email@teste.com");

        Assert.assertEquals("testeRegister@teste.com", usuarioRegistrado.getUsername());
        Assert.assertEquals("email@teste.com", usuarioRegistrado.getEmail());
        Assert.assertEquals("senha", usuarioRegistrado.getPassword());
    }
}