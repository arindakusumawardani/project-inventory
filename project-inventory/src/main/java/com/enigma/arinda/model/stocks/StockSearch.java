package com.enigma.arinda.model.stocks;

import com.enigma.arinda.model.PageSearch;
import com.enigma.arinda.model.items.ItemResponse;

public class StockSearch extends PageSearch {
    private Integer id;
    private Integer quantity;
    private Integer totalPrice;
    private ItemResponse itemId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ItemResponse getItemId() {
        return itemId;
    }

    public void setItemId(ItemResponse itemId) {
        this.itemId = itemId;
    }
}
