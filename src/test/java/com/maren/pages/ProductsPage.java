package com.maren.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath ="//div[@class='inventory_item_name ']")
    private List<WebElement> products;

    public List<String> getProductsName(){
        List<String> products_name = new ArrayList<>();
        for (int i = 0; i < products.size() ; i++) {
            System.out.println(products.get(i).getText().trim());
           products_name.add(products.get(i).getText().trim());
        }
        return products_name;
    }
}
