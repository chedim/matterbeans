package technology.hard.electric.devices;

import economy.EconomicEntity;
import technology.hard.electric.CircuitElement;

public interface DigitalDevice extends CircuitElement {
    int pinNumber();
    DigitalPin pin(int index);
    EconomicEntity producer();
}
