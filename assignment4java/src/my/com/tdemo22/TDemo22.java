package my.com.tdemo22;

import my.com.tdemo11.TDemo11;

public class TDemo22 {
	public void met2() throws NullPointerException, Exception {
		try {
			TDemo11 td = new TDemo11();
			if (true)
				return;
			td.met1();
		} catch (Exception ep) {
			System.out.println("Exception catchinggggggggg");
			throw ep;
		} finally {
			System.out.println("finally  met2() in TDemo22");
		}
		System.out.println("out side finally met2() in TDemo22");
	}
}