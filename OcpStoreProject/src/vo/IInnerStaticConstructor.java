/*
 * KKSU.Studio &copy;
 */
package vo;
/**
 * Project: OcpStoreSystem.vo<br>
 * Time: 2019.1.14, PM 10:45:28<br><br>
 * 
 * {@link vo.IInnerStaticConstructor Inner Static Constructor}
 * 
 * <p><b>About Method of Design:</b><br>
 * &nbsp;Using the inner constructor to build a static block, let everyone
 * calling the same one. But use the general inner constructor will lead
 * attributes and methods to must be changed for static.
 * 
 * <p>&nbsp;The solution finally is using to constructor null Class first,
 * and then increase setClass method to set value for Class.
 * 
 * <pre>
 * <b>There are 5 steps to using inner static constructor and set
 * value method:</b>
 *  1. Using general attribute.
 *  2. Display null Constructor and change to private.
 *  3. Inner constructor to new the Class by static.
 *  4. Using Public Static Method to return Class, let the called by users.
 *  5. Create setClass method to set attribute for this Class
 *      (include thrown Exception methods).
 * </pre>
 * 
 * @see (Interface)&nbsp;{@link vo.IValueObject IValueObject}
 * @see (Interface)&nbsp;{@link vo.JavaOcpStoreProject JavaOcpStoreProject}<br><br>
 * @author TiramiAsu (tiramisu0116@gmail.com)<br><br>
 * @version Java 1.8
 * @version MySQL WorkBench 8.0.13<br><br>
 */
public interface IInnerStaticConstructor {

}
