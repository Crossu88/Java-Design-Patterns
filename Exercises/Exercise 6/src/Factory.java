public abstract interface Factory {
    public abstract SlotMachine createStraight();
    public abstract SlotMachine createBonus();
    public abstract SlotMachine createProgressive();
}
