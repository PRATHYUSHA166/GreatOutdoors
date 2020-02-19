package com.cg.wishlist.service;

import java.util.List;

import com.cg.wishlist.bean.WishList;
import com.cg.wishlist.exception.WishListException;

public interface WishListService {

	//public boolean validateId(int productId);
	public int addProductToWishList(WishList product) throws WishListException;
	public List<WishList> findAllProductsInWishList() throws WishListException;
	public WishList deleteProductByIdInWishList(int productId) throws WishListException;
		
}
