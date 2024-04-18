import java.util.ArrayList;

//Client
public class AndroidPhone {
    private ArrayList<AndroidText> texts;
    public AndroidPhone(){
        this.texts = new ArrayList<AndroidText>();
    }
    //requestInformation()
    public AndroidText receiveText(AndroidText txt) {
        texts.add(txt);
        return txt;
    }
}
