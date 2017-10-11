package edu.bookstore.storage.entities;

/**
 * Representation of {@code Cart} Database table.
 */
public class Cart {
	private final int id;
	private final int customerId;
	private final int isbn;
	private final int quantity;
	private final double sellingPrice;

    public Cart(final int id,
                final int customerId,
                final int isbn,
                final int quantity,
                final double sellingPrice)
    {
        this.id = id;
        this.customerId = customerId;
        this.isbn = isbn;
        this.quantity = quantity;
        this.sellingPrice = sellingPrice;
    }

    public int getId() {
		return id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getISBN() {
		return isbn;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	private static class CartBuilder {
        private int id;
        private int customerId;
        private int isbn;
        private int quantity;
        private double sellingPrice;

        public CartBuilder id(final int id) {
            this.id = id;
            return this;
        }

        public CartBuilder customerId(final int customerId) {
            this.customerId = customerId;
            return this;
        }

        public CartBuilder isbn(final int isbn) {
            this.isbn = isbn;
            return this;
        }

        public CartBuilder quantity(final int quantity) {
            this.quantity = quantity;
            return this;
        }

        public CartBuilder sellingPrice(final double sellingPrice) {
            this.sellingPrice = sellingPrice;
            return this;
        }

        public Cart Build() {
            return new Cart(id, customerId, isbn, quantity, sellingPrice);
        }
    }

    public static CartBuilder builder() {
        return new CartBuilder();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", ISBN=" + isbn +
                ", quantity=" + quantity +
                ", sellingPrice=" + sellingPrice +
                '}';
    }
}
