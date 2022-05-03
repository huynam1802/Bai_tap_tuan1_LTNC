package week4;

public class MyInteger {
	private int value = 0;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return (value % 2) == 0;
	}

	public boolean isOdd() {
		return (value % 2) == 1;
	}

	public boolean isPrime() {
		if (value > 0) {
			if (value == 1 || value == 2) {
				return true;
			} else {
				for (int i = 2; i < value; i++) {
					if (i % value == 0) {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;

    }
    
    public static boolean isPrime(int value) {
    	if (value > 0) {
			if (value == 1 || value == 2) {
				return true;
			} else {
				for (int i = 2; i < value; i++) {
					if (i % value == 0) {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
    }
	
	public static boolean isEven(MyInteger myInteger) {
        return MyInteger.isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger) {
        return MyInteger.isOdd(myInteger.getValue());
    }
    
    public static boolean isPrime(MyInteger myInteger) {
    	return MyInteger.isPrime(myInteger.getValue());
    }
    
    public boolean equals(int value) {
    	return this.value == value;
    }
    
    public boolean equals(MyInteger myInteger) {
    	return this.value == myInteger.getValue();
    }
    
    public static int parseInt(char[] charArr) {
    	int len = charArr.length;
    	int tmp = len - 1;
    	int result = 0; 
    	for(int i = 0; i < len; i++,tmp--) {
    		result += Character.getNumericValue(charArr[i])* Math.pow(10, tmp);
    	}
    	return result;
    }
    
    public static int parseInt(String str) {
    	return Integer.parseInt(str);
    }
    
    public static void main(String[] args) {
		MyInteger i1 = new MyInteger(5);
		MyInteger i2 = new MyInteger(7);
		char[] charArr = {'0','1','0','2','4','0','0'};
		System.out.println(i1.isEven());
		System.out.println(i1.isOdd());
		System.out.println(i1.isPrime());
		System.out.println(isEven(17));
		System.out.println(isOdd(18));
		System.out.println(isPrime(-1));
		System.out.println(isEven(i1));
		System.out.println(isOdd(i1));
		System.out.println(isPrime(i1));
		System.out.println(i1.equals(5));
		System.out.println(i1.equals(i2));
		System.out.println(parseInt(charArr));
	    System.out.println(parseInt("12340"));
	}
}
