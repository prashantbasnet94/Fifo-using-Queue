public class Entry  implements Comparable<Entry>   {
    private String key;
    private int value;
    

    public Entry(String key, int value) {
        this.key = key;
        this.value = value;
        
        get(this.key,this.value);
        
    }

   

    private String get(String key2, int value2) {
    	return key +value;
		
	}



	 
	public void setKey(String key) {
		this.key = key;
	}

 


	@Override
	public String toString() {
		return " (" + key + ", " + value + ")";
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String getKey() {
		return key;
	}



	public int getValue() {
		return value;
	}



	@Override
	public int compareTo(Entry o) {
		// TODO Auto-generated method stubreturn this.getKey().compareTo(other.getKey());
		/*return Integer.toString(this.getValue()).compareTo(Integer.toString(o.getValue()));
				//compareTo(o.getValue());
*/	
	return this.getKey().compareTo(o.getKey())	;
	}
}

 