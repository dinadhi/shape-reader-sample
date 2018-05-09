package org.demo;

public class Circle extends Shape {

	private Double iRadius;

	public Circle(Integer aId) {
		id = aId;
	}

	public Circle(Integer aId, Double aRadius) {
		id = aId;
		iRadius = aRadius;
	}

	/**
	 * @return the iRadius
	 */
	public Double getRadius() {
		return iRadius;
	}

	/**
	 * @param iRadius
	 * the iRadius to set
	 */
	public void setRadius(Double aRadius) {
		iRadius = aRadius;
	}

	@Override
	public Double getArea() {
		return Math.PI * (iRadius * iRadius);
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
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle other = (Circle) obj;
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
		return "Circle [radius=" + iRadius + "]";
	}
}
