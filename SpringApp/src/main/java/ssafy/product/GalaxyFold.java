package ssafy.product;
public class GalaxyFold implements Phone {
    private Camera cam;
    private int price;
    
    
    
    public GalaxyFold() {
    }
    public GalaxyFold(Camera cam, int price) {
        super();
        this.cam = cam;
        this.price = price;
    }
    public void powerOn() {
        System.out.println("폴드가 켜져요");
    }
    public void powerOff() {
        System.out.println("폴드가 꺼져요");
    }
    public void takePicture() {
        this.cam.takePicture();
    }
    public int howMuch() {
        
        return price;
    }
    
    
}