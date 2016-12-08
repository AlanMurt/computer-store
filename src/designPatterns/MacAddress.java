package designPatterns;

import java.util.Random;

/**
 * Created by Alan on 08/12/2016.
 */
public final class MacAddress {
    private static volatile MacAddress instance = null;


    private MacAddress(){

    }

    public static MacAddress getInstance(){
        if(instance == null){
            synchronized (MacAddress.class){
                instance = new MacAddress();
            }
        }
        return instance;
    }

    public byte[] generateMacAddress() {
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte) (macAddr[0] & (byte) 254);  //zeroing last 2 bytes to make it unicast and locally adminstrated

        StringBuilder sb = new StringBuilder(18);
        for (byte b : macAddr) {

            if (sb.length() > 0)
                sb.append(":");

            sb.append(String.format("%02x", b));
        }
    return macAddr;
    }
}
