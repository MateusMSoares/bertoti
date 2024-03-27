public class UserService {
    private UserRepository userRepository;
    private static int id = 0;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username, String email, String password) {
        User novoUsuario = new User(gerarIdUnico(), username, email, password);
        userRepository.addUser(novoUsuario);
    }

    public User loginUser(String username, String password) {
        User user = userRepository.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void logoutUser(User user) {
        System.out.println("Usuario " + user.getUsername() + " deslogado com sucesso!");
    }

    private int gerarIdUnico() {
        id = id + 1;
        return id;
    }
}
