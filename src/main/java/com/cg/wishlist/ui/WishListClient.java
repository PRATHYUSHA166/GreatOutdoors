package com.cg.wishlist.ui;

import java.util.List;
import java.util.Scanner;

import com.cg.wishlist.bean.WishList;
import com.cg.wishlist.exception.WishListException;
import com.cg.wishlist.service.WishListService;
import com.cg.wishlist.service.WishListServiceImpl;

public class WishListClient {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    WishListService wlService = new WishListServiceImpl();
		
		int choice = 0;
		WishList wl = null;
		List<WishList> list = null;
		while(true)
		{
			System.out.println("1.Add product to wishlist");
			System.out.println("2.delete product from wishlist");
			System.out.println("3.View Wishlist");
			System.out.println("4.Exit");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Product ID : ");
			    int pid = sc.nextInt();
				wl = new WishList();
				wl.setProductId(pid);
				try
				{
				int id = wlService.addProductToWishList(wl);
				System.out.println("Product Id = "+id+ " succesfully added to wishlist");
				}
				catch(WishListException e)
				{
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				try
				{
					System.out.println("Enter Product Id : ");
					int id1 = sc.nextInt();
					wl = wlService.deleteProductByIdInWishList(id1);
					System.out.println("Item Deleted From Cart");
				}
				catch(WishListException e)
				{
					System.err.println(e.getMessage());
				}
				break;
	            
			case 3:
				try
				{
					list = wlService.findAllProductsInWishList();
					for(WishList w : list)
						System.out.println("productId = "+w.getProductId());
				}
				catch(WishListException e)
				{
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("thank you");
				return;
			default:
				System.err.println("Incorrect choice");
				System.err.println("enter correct choice");
				break;
			}
		}
	}
}
		
		
		
		
		