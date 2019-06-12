public class Tool extends Item {

    public boolean electricTool;

    public Tool(String itemName,  boolean electricTool) {
        super(itemName);
        this.electricTool = electricTool;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "electricTool=" + electricTool +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
