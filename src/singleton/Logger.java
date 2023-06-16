package singleton;

public enum Logger {

    LOGGER;

    Logger() {
    }

    public void info(String message) {
        System.out.println("LOG.INFO :: " + message);
    }

    public void error(String message) {
        System.out.println("LOG.ERROR :: " + message);
    }

}
