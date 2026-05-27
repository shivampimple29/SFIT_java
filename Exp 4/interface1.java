interface Device {
    void On();

    void Off();
}

interface smartFeature {
    void voiceControl();
}

class Light implements Device {
    Light() {
        System.out.println("-------------LIGHT-------------");
    }

    public void On() {
        System.out.println("turning ON...");
        System.out.println("Light turned ON successfully!");
    }

    public void Off() {
        System.out.println("turning OFF...");
        System.out.println("Light turned OFF successfully!");
    }
}

class Fan implements Device {

    public void On() {
        System.out.println("turning ON...");
        System.out.println("Fan turned ON successfully!");
    }

    public void Off() {
        System.out.println("turning OFF...");
        System.out.println("Fan turned OFF successfully!");
    }
}

class smartLight implements Device, smartFeature {
    public void On() {
        System.out.println("SmartLight ON");
    }

    public void Off() {
        System.out.println("SmartLight OFF");
    }

    public void voiceControl() {
        System.out.println("Listening for voice commands...");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Light l = new Light();
        Fan f = new Fan();
        smartLight s = new smartLight();

        l.On();
        l.Off();
        System.out.println();
        System.out.println("------------FAN------------");
        f.On();
        f.Off();
        System.out.println();
        System.out.println("------------SMARTLIGHT------------");
        s.On();
        s.Off();
        s.voiceControl();

    }
}
