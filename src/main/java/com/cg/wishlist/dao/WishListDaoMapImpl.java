package com.cg.wishlist.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.wishlist.bean.WishList;
import com.cg.wishlist.exception.WishListException;

public class WishListDaoMapImpl implements WishListDao {
private Map<Integer,WishList> map;
	
	public WishListDaoMapImpl()
	{
		map=new HashMap<Integer,WishList>();
	}
	public int addProductToWishList(WishList product) throws WishListException {
		boolean flag = map.containsKey(product.getProductId());
		if(flag)
		{
			throw new WishListException("Product already Exist");
		}
		map.put(product.getProductId(), product);
		return product.getProductId();
	}
	
	public WishList deleteProductInWishList(int productId) throws WishListException {
		WishList product = null;
		if(map.containsKey(productId))
			product = map.remove(productId);
		else
			throw new WishListException(productId+" Id not found");
		return product;
		
		
	}
	public List<WishList> findAllProductsInWishList() throws WishListException {
		Collection<WishList> col = map.values();
		List<WishList> list = new ArrayList<>();
		
		for(WishList w : col)
		{
			list.add(w);
		}
		return list;
	}
	
	

}
