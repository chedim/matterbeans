package technology.electric.electronic.computer;

import economy.EconomicEntity;
import technology.electric.electronic.CircuitElement;

public interface DigitalDevice extends CircuitElement {
    int pinNumber();
    DigitalPin pin(int index);
    EconomicEntity producer();
}
