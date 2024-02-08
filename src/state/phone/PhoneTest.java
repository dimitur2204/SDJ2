package state.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.onMessage("Hello");
        phone.onVolumeDown();
        phone.onMessage("Hello");
        phone.onClick();
        phone.onMessage("Hello");
        phone.onClick();
        phone.onMessage("Hello");
        while(phone.getVolume() < 10) {
            phone.onVolumeUp();
        }
        while(phone.getVolume() != 0) {
            phone.onVolumeDown();
        }
        phone.onVolumeDown();
        phone.onClick();
    }
}
