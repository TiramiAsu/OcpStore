/*
 * KKSU.Studio &copy;
 */
package _TestNote;
/**
 * Project: OcpStoreSystem._TestNote<br>
 * Time: 2019.1.13, AM 1:53:26<br>
 * @author TiramiAsu (tiramisu0116@gmail.com)
 * @version 1.0
 * <p>Using Inner static Constructor:
 * <pre>
 * 1. general attribute
 * 2. create one private Constructor
 * 3. create one static attribute new self
 * 4. create static public constructor for calling
 * 5. set attribute to this object(include thrown Exception Methods)
 * </pre>
 */
public class TestPrivateConstructor {
	
	private String s;
	private int ii;
	
	//	V
	private static TestPrivateConstructor tpc = new TestPrivateConstructor();
	
	public static TestPrivateConstructor create() {
		return tpc;
	}
	
	public TestPrivateConstructor setTestPrivateConstructor(String s, int ii) {
		this.ii = ii;
		if(isMethod(s)) {
			this.s = s;
		}else {
			this.s = "999999";
		}
		return this;
	}
	
	//	C
	private TestPrivateConstructor(String s, int ii) {
		this.s = s;
		this.ii = ii;
	}

	//	M
	public boolean isMethod(String ss) {
		
		return ss.length()>3?true:false;
	}
	
	
	
	public TestPrivateConstructor(String s) {
		this.s = s;
	}

	public TestPrivateConstructor() {
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "TestPrivateConstructor\n[s=" + s + ", ii=" + ii + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
