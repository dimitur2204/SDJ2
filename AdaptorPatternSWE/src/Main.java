public class Main {
    public static void main(String[] args) {
        AndroidPhone android = new AndroidPhone();
        IPhone iphone = new IPhone();
        AndroidIPhoneMessageAdapter adapter = new AndroidIPhoneMessageAdapter(android, iphone);
        adapter.receiveFromIPhone(new IPhoneMessage("Hello"));
        adapter.sendToIPhone(new AndroidText("Hello"));
    }
}