package com.cg.wishlist.bean;

public class WishList {
	private int productId;
	  
	  public WishList(int productId) {
		  super();
		  this.productId = productId;
	  }
	  public WishList(){
		  super();
	  }
	  public int getProductId() { 
		  return productId;
	  }
	  public void setProductId(int productId){
	       this.productId=productId;
	  }

}
