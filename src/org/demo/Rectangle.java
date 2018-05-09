package org.demo;

public class Rectangle extends Shape {

	private Double iHeight;
	private Double iWidth;
	public Rectangle(Integer aId) {
		id = aId;
	}

	public Rectangle(Integer aId, Double aWidth, Double aHeight) {
		id = aId;
		iHeight = aHeight;
		iWidth = aWidth;
	}

	public Double getiHeight() {
		return iHeight;
	}

	public void setiHeight(Double aHeight) {
		iHeight = aHeight;
	}

	public Double getiWidth() {
		return iWidth;
	}

	public void setiWidth(Double aWidth) {
		iWidth = aWidth;
	}

	@Override
	public Double getArea() {

		return iHeight * iWidth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [width=" + iWidth + ", height=" + iHeight + "]";
	}
}
