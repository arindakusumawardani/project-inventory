package com.enigma.arinda.model.transactions;


import com.enigma.arinda.entities.User;
import com.enigma.arinda.model.items.ItemElement;

public class TransactionElement {
    private Integer id;
    private ItemElement item;
    private User user;
    private Integer quantity;
    private Integer totalPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ItemElement getItem() {
        return item;
    }

    public void setItem(ItemElement item) {
        this.item = item;
    }

    public User getUserInfo() {
        return user;
    }

    public void setUserInfo(User user) {
        this.user = user;
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
}
