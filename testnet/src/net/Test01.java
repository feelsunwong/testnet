package net;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**\
 *这是一个测试提交2
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//InetAddress ia = InetAddress.getByName("www.sohu.com");
			InetAddress ia = InetAddress.getByAddress(new byte[]{(byte) 182,61,(byte) 200,7});
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
			
			ia = InetAddress.getLocalHost();
			
			System.out.println(ia.getHostAddress());
			System.out.println(ia.getHostName());
			
			InetAddress[] allByName = InetAddress.getAllByName("www.baidu.com");
			System.out.println(allByName[0].getHostAddress());
			System.out.println(allByName[1].getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
