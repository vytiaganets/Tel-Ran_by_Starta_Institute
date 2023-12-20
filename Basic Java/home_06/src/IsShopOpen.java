public class IsShopOpen {
    public static void main(String[] args) {
        Boolean isEdekaOpen = false;
        Boolean isReweOpen = false;
        canBuy(isEdekaOpen, isReweOpen);
    }
    public static void canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        String store = "";
        if (isEdekaOpen && isReweOpen) {
            store = "Edeka и в Rewe";
            System.out.println("Я могу купить продукты в " + store);
        } else if (isReweOpen) {
            store = "Rewe";
            System.out.println("Я могу купить продукты в " + store);
        } else if (isEdekaOpen) {
            store = "Edeka";
            System.out.println("Я могу купить продукты в " + store);
        } else {
            System.out.println("Магазины закрыты");
        }
    }
}
