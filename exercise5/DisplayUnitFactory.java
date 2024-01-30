package exercise5;

interface DisplayUnitFactory {
    Observer createDisplayUnit(String name);
}

// Concrete Factory class implementing the DisplayUnitFactory
class SimpleDisplayUnitFactory implements DisplayUnitFactory {
    @Override
    public Observer createDisplayUnit(String name) {
        return new DisplayUnit(name);
    }
}
