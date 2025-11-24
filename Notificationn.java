
interface Notification{
    void send(String msg);

    default void log(){
        System.out.println("Sending Notification");
    }

    static void help(){
        System.out.println("use send() to send a notificaiton");
    }
}

interface Alert extends Notification{

    void alertLevel();

}

class EmailNotification implements Alert{

    @Override
    public void send(String msg){

        System.out.println("Your food is getting prepared : " + msg);

    }
    
    @Override 
    public void alertLevel(){
        System.out.println("Our delivery agent is  nearing your location to deliver your food");
    }
}


public class Notificationn {
    public static void main(String[] args) {

        EmailNotification E1 = new EmailNotification();
        E1.send("Pizza Order");
        E1.alertLevel();
        Notification.help();
        E1.log();


        
    }
}
