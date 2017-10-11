package edu.bookstore.storage.entities;

import java.sql.Date;
import java.util.Objects;

/**
 * Representation of {@code Sold} Database table.
 */
public class Sold {
	private final int id;
	private final int customerId;
	private final int ISBN;
	private final int quantity;
	private final double sellingPrice;
	private final Date sellingDate;

    public Sold(final int id,
                final int customerId,
                final int ISBN,
                final int quantity,
                final double sellingPrice,
                final Date sellingDate)
    {
        this.id = id;
        this.customerId = customerId;
        this.ISBN = ISBN;
        this.quantity = quantity;
        this.sellingPrice = sellingPrice;
        this.sellingDate = sellingDate;
    }

    public int getId() {
		return id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getISBN() {
		return ISBN;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public Date getSellingDate() {
		return sellingDate;
	}

	private static class SoldBuilder {
        private int id;
        private int customerId;
        private int isbn;
        private int quantity;
        private double sellingPrice;
        private Date sellingDate;

        public SoldBuilder id(final int id) {
            this.id = id;
            return this;
        }

        public SoldBuilder customerId(final int customerId) {
            this.customerId = customerId;
            return this;
        }

        public SoldBuilder isbn(final int isbn) {
            this.isbn = isbn;
            return this;
        }

        public SoldBuilder quantity(final int quantity) {
            this.quantity = quantity;
            return this;
        }

        public SoldBuilder sellingPrice(final double sellingPrice) {
            this.sellingPrice = sellingPrice;
            return this;
        }

        public SoldBuilder sellingDate(final Date sellingDate) {
            this.sellingDate = sellingDate;
            return this;
        }

        public Sold build() {
            return new Sold(id, customerId, isbn, quantity, sellingPrice, sellingDate);
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Sold sold = (Sold) o;
        return id == sold.id &&
                customerId == sold.customerId &&
                ISBN == sold.ISBN &&
                quantity == sold.quantity &&
                Double.compare(sold.sellingPrice, sellingPrice) == 0 &&
                Objects.equals(sellingDate, sold.sellingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, ISBN, quantity, sellingPrice, sellingDate);
    }

    @Override
    public String toString() {
        return "Sold{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", ISBN=" + ISBN +
                ", quantity=" + quantity +
                ", sellingPrice=" + sellingPrice +
                ", sellingDate=" + sellingDate +
                '}';
    }
}
