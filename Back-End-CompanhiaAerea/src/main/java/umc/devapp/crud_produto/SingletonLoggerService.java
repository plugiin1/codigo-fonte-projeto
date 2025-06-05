package umc.devapp.crud_produto;

public class SingletonLoggerService {
    private static SingletonLoggerService instance;

    private void SigletonLoggerService() {}

    public static SingletonLoggerService getInstance() {
        if (instance == null) {
            instance = new SingletonLoggerService();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
