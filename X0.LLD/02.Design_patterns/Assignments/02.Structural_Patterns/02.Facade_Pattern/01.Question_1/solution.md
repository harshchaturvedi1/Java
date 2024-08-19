```java
// Device classes
class Lights {
public void on() {
System.out.println("Lights are on");
}

    public void off() {
        System.out.println("Lights are off");
    }

}

class Thermostat {
public void setTemperature(int temperature) {
System.out.println("Thermostat is set to " + temperature + " degrees");
}

    public void off() {
        System.out.println("Thermostat is off");
    }

}

class SecurityCamera {
public void on() {
System.out.println("Security cameras are on");
}

    public void off() {
        System.out.println("Security cameras are off");
    }

}

// Facade class
class SmartHomeFacade {
private Lights lights;
private SecurityCamera cameras;
private Thermostat thermostat;

    public SmartHomeFacade(Lights lights, SecurityCamera cameras, Thermostat thermostat) {
        this.lights = lights;
        this.cameras = cameras;
        this.thermostat = thermostat;
    }

    public void activateHome() {
        lights.on();
        cameras.on();
        thermostat.setTemperature(22); // Set a default temperature
        System.out.println("Home system is activated");
    }

    public void deactivateHome() {
        lights.off();
        cameras.off();
        thermostat.off();
        System.out.println("Home system is deactivated");
    }

}

// Usage
public class Main {
public static void main(String[] args) {
Lights lights = new Lights();
Thermostat thermostat = new Thermostat();
SecurityCamera cameras = new SecurityCamera();

        SmartHomeFacade smartHome = new SmartHomeFacade(lights, cameras, thermostat);

        smartHome.activateHome();
        smartHome.deactivateHome();
    }

}
```
