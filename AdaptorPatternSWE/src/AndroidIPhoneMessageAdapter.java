//Adapter
public class AndroidIPhoneMessageAdapter {
    private final AndroidPhone android;
    private final IPhone iphone;
    public AndroidIPhoneMessageAdapter(AndroidPhone android, IPhone iphone){
        this.android = android;
        this.iphone = iphone;
    }

    //sendInformation()
    public void sendToIPhone(AndroidText text){
        //convertRequest()
        IPhoneMessage adapted = new IPhoneMessage(text.getText());
        //sendInformation()
        this.iphone.receiveMessage(adapted);
    }

    //returnInformation()
    public void receiveFromIPhone(IPhoneMessage msg){
        //convertResponse()
        AndroidText adapted = new AndroidText(msg.getMessage());
        //returnInformation()
        this.android.receiveText(adapted);
    }
}
