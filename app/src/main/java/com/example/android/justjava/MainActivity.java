/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);

    }

    public void submitOrder(View view){
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);
    }

    /**
     * Calculates the price of the order
     *
     * @return the total price
     */

    private int calculatePrice() {
        return quantity * 5;
    }

    /**
     * Create Summary of the Order
     *
     * @param price of the order
     * @return text summary
     */
    private String createOrderSummary(int price) {
        String priceMessage = "Name: Rosa Perez";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: = $" + price;
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}

//    /**
//     * This method displays the given price on the screen.
//     */
//    private void displayPrice(int number) {
//        TextView priceTextView = (TextView) findViewById(price_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
//    }
//}

