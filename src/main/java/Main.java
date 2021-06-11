import controller.ApplicationController;
import view.UI;

public class Main {
    public static void main(String[] args) {

        ApplicationController.getInstance();
        UI userInterface = new UI();

        userInterface.showBasicMenu();
//        userInterface.fillItemForm();
//        userInterface.fillAuctionForm();
    }
}
