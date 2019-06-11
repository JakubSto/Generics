public class Tool extends Item {
    Tool hammer = new Tool("hammer", false);
    Tool drill = new Tool("drill", true);
    Tool keyboard = new Tool("keyboard", true);

    public boolean electricTool;

    public Tool(String itemName,  boolean electricTool) {
        super(itemName);
        this.electricTool = electricTool;
    }


}
