/*
 * KKSU.Studio &copy;
 */
package _TestNote;
/**
 * Project: OcpStoreSystem._TestNote<br>
 * Time: 2019年1月13日, 上午1:54:27<br>
 * @author TiramiAsu (tiramisu0116@gmail.com)
 * @version 1.0
 */
public class _MainTest {
	
	public static void main(String[] args) {
		TestPrivateConstructor tpcXX1 = TestPrivateConstructor.create().setTestPrivateConstructor("A1", 56);
		TestPrivateConstructor tpcXX2 = TestPrivateConstructor.create().setTestPrivateConstructor("A123", 77);
		
		System.out.println(tpcXX1.toString()+"\n"+tpcXX2.toString());
	}
}
