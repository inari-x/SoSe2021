package uebungen.uebung7;

public class MyInteger implements Comparable<MyInteger>{
	private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }

    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }

//	@Override
//	public int compareTo(MyInteger o) {
//		if(this.value > o.value) {
//			return 1;
//		}
//		else if(this.value < o.value) {
//			return -1;
//		}
//		return 0;
//	}
	
	@Override
	public int compareTo(MyInteger o) {
		if(this.value > o.value) {
			return -1;
		}
		else if(this.value < o.value) {
			return 1;
		}
		return 0;
	}

}
