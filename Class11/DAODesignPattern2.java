package Class11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {

	private int product_id;

	private String Product_name;

	private int Product_price;

	private String Product_sku;

	public int getProduct_id() {

		return product_id;

	}

	public void setProduct_id(int product_id) {

		this.product_id = product_id;

	}

	public String getProduct_name() {

		return Product_name;

	}

	public void setProduct_name(String product_name) {

		Product_name = product_name;

	}

	public int getProduct_price() {

		return Product_price;

	}

	public void setProduct_price(int product_price) {

		Product_price = product_price;

	}

	public String getProduct_sku() {

		return Product_sku;

	}

	public void setProduct_sku(String product_sku) {

		Product_sku = product_sku;

	}

	public Product(int product_id, String product_name, int product_price, String product_sku) {

		this.product_id = product_id;

		Product_name = product_name;

		Product_price = product_price;

		Product_sku = product_sku;

	}

	@Override

	public String toString() {

		return "Product [product_id=" + product_id + ", Product_name=" + Product_name + ", Product_price="

				+ Product_price + ", Product_sku=" + Product_sku + "]";

	}

}

interface ProductDAO {

	public List<Product> getAlloProduct();

	public List<Product> getProduct(int product_id);

	public void updateProduct(Product p);

	public void deleteProduct(Product p);

	public Product[] getAllProduct();

	public List<Product> getProductById(String productName);

	public List<Product> getProductByProduct_sku(String productName);

}

class ProductDAOImp1 implements ProductDAO {

	List<Product> products;

	private Product[] Product;

	public ProductDAOImp1() {

		products = new ArrayList<>();

		Product pr1 = new Product(1, "ABC", 123, "Mobile");

		Product pr2 = new Product(2, "XYZ", 456, "Tab");

		products.add(pr1);

		products.add(pr2);

		Iterator<Product> itr = products.iterator();

		while (itr.hasNext()) {

			Product p = itr.next();

			System.out.println(p.toString());

		}

	}

	// List<Product> giveMeProductByOwner = pr1.getProductByOwner(pr1);

	@Override

	public List<Product> getAlloProduct() {

		return products;

	}

	@Override

	public List<Product> getProduct(int product_id) {

		// TODO Auto-generated method stub

		return products;

	}

	@Override

	public void updateProduct(Product p) {

		// TODO Auto-generated method stub

	}

	@Override

	public void deleteProduct(Product p) {

		// TODO Auto-generated method stub

	}

	@Override

	public Product[] getAllProduct() {

		// TODO Auto-generated method stub

		return null;

	}

	@Override

	public List<Product> getProductById(String productName) {

		System.out.println("Product to look out is " + productName);

		List<Product> newProductList = new ArrayList<>();

		Iterator<Product> itr = products.iterator();

		while (itr.hasNext()) {

			Product p = itr.next();

			if (p.getProduct_name().equalsIgnoreCase(productName)) {

				newProductList.add(p);

			}

		}

		return newProductList;

	}

	@Override

	public List<Product> getProductByProduct_sku(String productSKU) {

		System.out.println("Product to look out with SKU " + productSKU);

		List<Product> newProductList = new ArrayList<>();

		Iterator<Product> itr = products.iterator();

		while (itr.hasNext()) {

			Product p = itr.next();

			System.out.println(p);

			if (p.getProduct_name().equalsIgnoreCase(productSKU)) {

				newProductList.add(p);

			}

		}

		return newProductList;

	}

}

public class DAODesignPattern2 {

	public static void main(String[] args) {

		ProductDAO productDao = new ProductDAOImp1();

		for (Product st : productDao.getAlloProduct()) {

			System.out.println("student [stu id" + st.getProduct_id() + "]");

			productDao.getProductById("Iphone");

			productDao.getProductByProduct_sku("Tab");

		}
	}
}
