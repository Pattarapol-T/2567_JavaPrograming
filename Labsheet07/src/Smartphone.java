
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY;
	Smartphone(String brand,String model,int storageCapacity,int MAX_STORAGE_CAPACITY){
		
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		if(this.brand.length()<2) {
			System.out.println("Error: Brand must have at least 2 characters!");
		}else {
			this.brand = brand;
		}
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model ) {
		if(this.model.length()<2){
			System.out.println("Error: Brand must have at least 2 characters!");
		}else {
			this.model= model;
		}
	}
	public int getstorageCapacity() {
		return storageCapacity;
	}
	public void setstorageCapacity(int storageCapacity) {
		if(storageCapacity >1 && storageCapacity < MAX_STORAGE_CAPACITY) {
			System.out.println("Error: Storage capacity must be between1 and 512 GB!");
		}else {
			this.storageCapacity = storageCapacity;
		}
	}
	public void increaseStorage(int additionalStorage) {
		if(additionalStorage > 0 && (storageCapacity +  additionalStorage) < MAX_STORAGE_CAPACITY) {
		   storageCapacity = storageCapacity +  additionalStorage;
		}
		else {
			System.out.println("Error: Storage capacity cannot exceed<MAX_STORAGE_CAPACITY> GB!");
		}
		if(additionalStorage <=0) {
			System.out.println("Error: Additional storage must be positive!");
		}
			
		}	
	public int getRemainingStorage(int usedStorage) {
		if (usedStorage >0 && usedStorage <storageCapacity) {
		return storageCapacity - usedStorage;
		}else {
			System.out.println("Error: Used storage must be between 0 and<storageCapacity> GB!");
			return -1;
		}
	}
	
	
	}
