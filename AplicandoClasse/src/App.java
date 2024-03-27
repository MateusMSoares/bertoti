public class App {
    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        userService.registerUser("Mateus", "mateus@fatec.com", "123456");
        userService.registerUser("João", "joao@fatec.com", "123456");
        userService.registerUser("Maria", "maria@fatec.com","123456");

        User usarioLogado = userService.loginUser("Mateus","123456");
        if (usarioLogado != null) {
            System.out.println("Usuário " + usarioLogado.getUsername() + " logado com sucesso.");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
    }
}
