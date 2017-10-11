package edu.bookstore.storage.entities;

import java.sql.Date;

/**
 * Representation of Book db table.
 */
public class Book {
	private final int ISBN;
    private final int quantity;
    private final int threshold;
    private final int categoryId;
    private final double sellingPrice;
	private final String title;
	private final String publisherName;
    private final Date publicationYear;

    public Book(final int ISBN,
                final String title,
                final int quantity,
                final int threshold,
                final Date publicationYear,
                final double sellingPrice,
                final int categoryId,
                final String publisherName)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.quantity = quantity;
        this.threshold = threshold;
        this.publicationYear = publicationYear;
        this.sellingPrice = sellingPrice;
        this.categoryId = categoryId;
        this.publisherName = publisherName;
    }

    public int getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getThreshold() {
		return threshold;
	}

	public Date getPublicationYear() {
		return publicationYear;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	private static class BookBuilder {
        private int isbn;
        private String title;
        private int quantity;
        private int threshold;
        private Date publicationYear;
        private double sellingPrice;
        private int categoryId;
        private String publisherName;

        public BookBuilder isbn(final int isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder title(final String title) {
            this.title = title;
            return this;
        }

        public BookBuilder quantity(final int quantity) {
            this.quantity = quantity;
            return this;
        }

        public BookBuilder threshold(final int threshold) {
            this.threshold = threshold;
            return this;
        }

        public BookBuilder publicationYear(final Date publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder sellingPrice(final double sellingPrice) {
            this.sellingPrice = sellingPrice;
            return this;
        }

        public BookBuilder categoryId(final int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public BookBuilder publisherName(final String publisherName) {
            this.publisherName = publisherName;
            return this;
        }

        public Book build() {
            return new Book(
                    isbn,
                    title,
                    quantity,
                    threshold,
                    publicationYear,
                    sellingPrice,
                    categoryId,
                    publisherName);
        }
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", threshold=" + threshold +
                ", publicationYear=" + publicationYear +
                ", sellingPrice=" + sellingPrice +
                ", categoryId=" + categoryId +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
