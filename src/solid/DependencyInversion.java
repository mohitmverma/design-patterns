package solid;


interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class Notification {
    private final MessageService messageService;

    public Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
}

/*
* Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions.
* */

public class DependencyInversion {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        Notification notification = new Notification(emailService);
        notification.notifyUser("Hello via Email!");

        notification = new Notification(smsService);
        notification.notifyUser("Hello via SMS!");
    }
}

