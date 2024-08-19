```java
// Interfaces for new devices
interface LockControl {
    void lock();
    void unlock();
}

interface SpeakerControl {
    void playMusic();
    void stopMusic();
}

// Implementations for new devices
class SmartLock implements LockControl {
    public void lock() {
        System.out.println("Smart lock is locked");
    }

    public void unlock() {
        System.out.println("Smart lock is unlocked");
    }
}

class SmartSpeaker implements SpeakerControl {
    public void playMusic() {
        System.out.println("Smart speaker is playing music");
    }

    public void stopMusic() {
        System.out.println("Smart speaker has stopped music");
    }
}

// Existing device interfaces and implementations
interface LightControl {
    void on();
    void off();
}

interface ThermostatControl {
    void setTemperature(int temperature);
    void off();
}

interface CameraControl {
    void on();
    void off();
}

class Lights implements LightControl {
    public void on() {
        System.out.println("Lights are on");
    }

    public void off() {
        System.out.println("Lights are off");
    }
}

class Thermostat implements ThermostatControl {
    public void setTemperature(int temperature) {
        System.out.println("Thermostat is set to " + temperature + " degrees");
    }

    public void off() {
        System.out.println("Thermostat is off");
    }
}

class SecurityCamera implements CameraControl {
    public void on() {
        System.out.println("Security cameras are on");
    }

    public void off() {
        System.out.println("Security cameras are off");
    }
}

// Updated Facade class
class SmartHomeFacade {
    private LightControl lights;
    private CameraControl cameras;
    private ThermostatControl thermostat;
    private LockControl smartLock;
    private SpeakerControl smartSpeaker;

    public SmartHomeFacade(LightControl lights, CameraControl cameras, ThermostatControl thermostat, LockControl smartLock, SpeakerControl smartSpeaker) {
        this.lights = lights;
        this.cameras = cameras;
        this.thermostat = thermostat;
        this.smartLock = smartLock;
        this.smartSpeaker = smartSpeaker;
    }

    public void activateHome() {
        lights.on();
        cameras.on();
        thermostat.setTemperature(22); // Set a default temperature
        smartLock.unlock();
        smartSpeaker.playMusic();
        System.out.println("Home system is activated");
    }

    public void deactivateHome() {
        lights.off();
        cameras.off();
        thermostat.off();
        smartLock.lock();
        smartSpeaker.stopMusic();
        System.out.println("Home system is deactivated");
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        LightControl lights = new Lights();
        ThermostatControl thermostat = new Thermostat();
        CameraControl cameras = new SecurityCamera();
        LockControl smartLock = new SmartLock();
        SpeakerControl smartSpeaker = new SmartSpeaker();

        SmartHomeFacade smartHome = new SmartHomeFacade(lights, cameras, thermostat, smartLock, smartSpeaker);

        smartHome.activateHome();
        smartHome.deactivateHome();
    }
}
```
