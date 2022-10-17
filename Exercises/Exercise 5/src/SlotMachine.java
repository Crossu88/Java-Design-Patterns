public abstract class SlotMachine {
    private final String cabinet;
    private final String display;
    private final String payment;
    private final String cpu;
    private final String os;

    protected SlotMachine(String cabinet, String display, String payment, String cpu, String os) {
        this.cabinet = cabinet;
        this.display = display;
        this.payment = payment;
        this.cpu = cpu;
        this.os = os;
    }

    public String getCabinet() {
        return cabinet;
    }

    public String getPayment() {
        return payment;
    }

    public String getDisplay() {
        return display;
    }

    public String getCPU() {
        return cpu;
    }

    public String getOS() {
        return os;
    }
}
