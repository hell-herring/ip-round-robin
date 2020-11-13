package ip.round.robin;

import java.net.InetAddress;

public class RoundRobin {

	public static void main(String[] args) {

		String targetIp = "172.172.***.172";

		try {
			InetAddress ia;
			for (int i = 0; i < 256; i++) {
				ia = InetAddress.getByName(targetIp.replace("***", String.valueOf(i)));
				System.out.println(ia.getHostAddress() + "\t" + ia.getHostName());
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}
