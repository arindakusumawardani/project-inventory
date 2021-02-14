package com.enigma.arinda.model.stocks;


import com.enigma.arinda.model.items.ItemResponse;

public class StockResponse {
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

    public ItemResponse getItem() {
        return itemId;
    }

    public void setItem(ItemResponse itemId) {
        this.itemId = itemId;
    }


}
