package fan;

public class Fan {
    private boolean isOn = false;
    private fan.FanSpeed speed;
    private String brandName;

    public Fan() {
        this.speed = fan.FanSpeed.OFF;
    }

    public void switchOnTheFan() {
        isOn = true;
        speed = fan.FanSpeed.LOW;
        System.out.println("Starting the fan with speed: " + speed);
    }

    public void switchOffTheFan() { // ✅ fixed typo "Of" to "Off"
        isOn = false;
        speed = FanSpeed.OFF;
        System.out.println("Turning off the fan");
    }

    public boolean isSwitchedOn() { // ✅ fixed spelling
        return isOn;
    }

    public void increase() {
        if (!isOn) {
            System.out.println("Please switch on the fan");
        } else {
            speed = speed.increase(); // assumes FanSpeed has increase() method
        }
    }

    public void decrease() {
        if (!isOn) {
            System.out.println("Please switch on the fan");
        } else {
            speed = speed.decrease(); // assumes FanSpeed has decrease() method
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public FanSpeed getSpeed() {
        return speed;
    }

    public void setSpeed(FanSpeed speed) {
        this.speed = speed;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "isOn=" + isOn +
                ", speed=" + speed +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
