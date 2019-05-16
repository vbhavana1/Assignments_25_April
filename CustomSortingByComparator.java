class CustomSortingByComparator{
	public static void main(String[] args) {
		java.util.List list = new java.util.ArrayList();

		list.add(new Mobilephones(134, "infocus", "gray"));
		list.add(new Mobilephones(5, "oppo", "blue"));
		list.add(new Mobilephones(28, "HTC", "black"));
		System.out.println(list);
		java.util.Collections.sort(list, new sortById());
		System.out.println(list);
	}
}
class Mobilephones{
	private int mobileId;
	String mobileBrand, mobileColor;
	Mobilephones(int mobileId, String mobileBrand, String mobileColor){
		this.mobileId = mobileId;
		this.mobileColor = mobileColor;
		this.mobileBrand = mobileBrand;
	}
	@Override
	public String toString(){
		return this.mobileId + this.mobileBrand + this.mobileColor;
	}
	public Integer getmobileid(){
		return this.mobileId;
	}
		}
		class sortById implements java.util.Comparator{
			@Override
			public int compare(Object firstboj, Object secobj){
				return ((Mobilephones)firstboj).getmobileid().compareTo(((Mobilephones)secobj).getmobileid());
			}

		}