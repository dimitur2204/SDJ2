package state.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.getSpeakerState().alert(phone, "Hello");
        phone.getSpeakerState().volumeDown(phone);
        phone.getSpeakerState().alert(phone, "Hello");
        phone.onClick();
        phone.getSpeakerState().alert(phone, "Hello");
        phone.onClick();
        phone.getSpeakerState().alert(phone, "Hello");
        while(phone.getVolume() < 10) {
            phone.onVolumeUp();
        }
        System.out.println(phone.getSpeakerState().toString());
        while(phone.getVolume() != 0) {
            phone.onVolumeDown();
        }
        System.out.println(phone.getSpeakerState().toString());
        phone.onVolumeDown();
        System.out.println(phone.getSpeakerState().toString());
        phone.setSpeakerState(new Silent());
    }
}
