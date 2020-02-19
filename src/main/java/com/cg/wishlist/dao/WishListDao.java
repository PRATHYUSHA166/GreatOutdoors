package com.cg.wishlist.dao;

import java.util.List;

import com.cg.wishlist.bean.WishList;
import com.cg.wishlist.exception.WishListException;

public interface WishListDao {
	public int addProductToWishList(WishList product ) throws WishListException;
	public WishList deleteProductInWishList(int ProductId)  throws WishListException;
	public List<WishList> findAllProductsInWishList() throws WishListException;

}
