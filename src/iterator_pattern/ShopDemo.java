package iterator_pattern;




public class ShopDemo {
    public static void main(String args[]) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Shop shop = new Shop(pancakeMenu, dinerMenu);

        shop.printMenu();
    }
}
