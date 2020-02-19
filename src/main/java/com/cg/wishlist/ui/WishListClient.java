package com.cg.wishlist.ui;

import java.awt.List;
import java.util.Scanner;

import com.cg.wishlist.bean.WishList;
import com.cg.wishlist.exception.WishListException;
import com.cg.wishlist.service.WishListService;
import com.cg.wishlist.service.WishListServiceImpl;

public class WishListClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WishListService productService = new WishListServiceImpl();
		
		// TODO Auto-generated method stub
		int choice=0;
		WishList product=null;
		List<WishList> list=null;
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
				System.out.println("enter product id");
				int pid=sc.nextInt();
			product =new WishList();
			product.setProductId(pid);
			try
			{
				int id=productService.addToWishList(product);
				System.out.println("ProductId="+id);
			}
			catch(WishListException e)
			{
			System.err.println(e.getMessage());
			}
			break;
			case 2:
				try
				{
				System.out.println("enter wishlist id");
				int id1=sc.nextInt();
				product=productService.deleteProductByIdInWishList(id1);
				System.out.println("item delete from wishlist");
				}
		        catch(WishListException e)
				{
			    System.err.println(e.getMessage());
				}
	            
				
				break;
			case 3:
				try
				{
					list=productService.findAllProductsInWishList();
					for(WishList e:list)
					{
						System.out.println("Product Id:"+e.getProductId());
					}
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
		
		
		
		
		