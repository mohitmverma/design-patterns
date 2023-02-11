package proxy;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Proxy design Patterns!");

        DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
        nonAdminExecuter.executeDatabase("ADD");

        DatabaseExecuter nonAdminExecuterDELETE = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
        nonAdminExecuterDELETE.executeDatabase("DELETE");


        DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");
    }
}