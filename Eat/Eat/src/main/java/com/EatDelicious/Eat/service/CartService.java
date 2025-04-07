package com.EatDelicious.Eat.service;

import com.EatDelicious.Eat.io.CartRequest;
import com.EatDelicious.Eat.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
