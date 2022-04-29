module com.hellocode.shoppingcart {
    requires javafx.controls;
    requires javafx.fxml;
    exports com.hellocode.shoppingcart.step1;
    exports com.hellocode.shoppingcart.step2 to javafx.graphics;
}