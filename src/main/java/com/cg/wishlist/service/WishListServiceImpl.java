package com.cg.wishlist.service;

import java.util.List;
import java.util.Random;

import com.cg.wishlist.bean.WishList;
import com.cg.wishlist.dao.WishListDao;
import com.cg.wishlist.dao.WishListDaoMapImpl;
import com.cg.wishlist.exception.WishListException;

public class WishListServiceImpl implements WishListService {

	private WishListDao wlDao;
	
	public WishListServiceImpl()
	{
		wlDao = new WishListDaoMapImpl();
	}

public int addProductToWishList(WishList product) throws WishListException {
	int id = product.getProductId();
	id=wlDao.addProductToWishList(product);
	return id;
}

public List<WishList> findAllProductsInWishList() throws WishListException {
	return wlDao.findAllProductsInWishList();
}

public WishList deleteProductByIdInWishList(int productId) throws WishListException {
	// TODO Auto-generated method stub
	return wlDao.deleteProductInWishList(productId);
}

}
