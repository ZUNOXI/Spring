package ssafy.product;
public class ApplePhone implements Phone {
    
    
    private int price;
    private Camera cam;
    
    
    
    public ApplePhone() {
    }
    public ApplePhone(int price, Camera cam) {
        super();
        this.price = price;
        this.cam = cam;
    }
    
    public void powerOn() {
        System.out.println("켜진다");
    }
    public void powerOff() {
        System.out.println("꺼져라");
    }
    public void takePicture() {
        this.cam.takePicture();
    }
    public int howMuch() {
        return price;
    }
}