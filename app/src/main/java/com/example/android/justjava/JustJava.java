package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.justjava.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class JustJava extends AppCompatActivity {
    int orderQuantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_java);
    }

    // This method is called when the order button is clicked.

    public void submitOrder(View view) {
        displayPrice(orderQuantity*10);
    }

    //This method increments the order quantity.

    public void increment(View view) {
        orderQuantity+=1;
        display(orderQuantity);
    }

    //This method decrements the order quantity.

    public void decrement(View view) {
        orderQuantity-=1;
        display(orderQuantity);
    }

    //This method displays the given quantity value on the screen.

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    //This method displays the given price on the screen.

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}