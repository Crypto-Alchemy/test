package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
/* renamed from: qt6 */
/* compiled from: Transaction */
public class qt6 {
    public static final BigInteger DEFAULT_GAS = BigInteger.valueOf(9000);
    private String data;
    private BigInteger feeCap;
    private String from;
    private BigInteger gas;
    private BigInteger gasPremium;
    private BigInteger gasPrice;
    private BigInteger nonce;

    /* renamed from: to */
    private String f44241to;
    private BigInteger value;

    public qt6(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str2, BigInteger bigInteger4, String str3) {
        this(str, bigInteger, bigInteger2, bigInteger3, str2, bigInteger4, str3, (BigInteger) null, (BigInteger) null);
    }

    private static String convert(BigInteger bigInteger) {
        if (bigInteger != null) {
            return pc4.encodeQuantity(bigInteger);
        }
        return null;
    }

    public static qt6 createContractTransaction(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, String str2) {
        return new qt6(str, bigInteger, bigInteger2, bigInteger3, (String) null, bigInteger4, str2);
    }

    public static qt6 createEthCallTransaction(String str, String str2, String str3) {
        return new qt6(str, (BigInteger) null, (BigInteger) null, (BigInteger) null, str2, (BigInteger) null, str3);
    }

    public static qt6 createEtherTransaction(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str2, BigInteger bigInteger4) {
        return new qt6(str, bigInteger, bigInteger2, bigInteger3, str2, bigInteger4, (String) null);
    }

    public static qt6 createFunctionCallTransaction(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str2, BigInteger bigInteger4, String str3) {
        return new qt6(str, bigInteger, bigInteger2, bigInteger3, str2, bigInteger4, str3);
    }

    public String getData() {
        return this.data;
    }

    public String getFrom() {
        return this.from;
    }

    public String getGas() {
        return convert(this.gas);
    }

    public String getGasPrice() {
        return convert(this.gasPrice);
    }

    public String getNonce() {
        return convert(this.nonce);
    }

    public String getTo() {
        return this.f44241to;
    }

    public String getValue() {
        return convert(this.value);
    }

    public qt6(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str2, BigInteger bigInteger4, String str3, BigInteger bigInteger5, BigInteger bigInteger6) {
        this.from = str;
        this.f44241to = str2;
        this.gas = bigInteger3;
        this.gasPrice = bigInteger2;
        this.value = bigInteger4;
        if (str3 != null) {
            this.data = pc4.prependHexPrefix(str3);
        }
        this.nonce = bigInteger;
        this.gasPremium = bigInteger5;
        this.feeCap = bigInteger6;
    }

    public static qt6 createContractTransaction(String str, BigInteger bigInteger, BigInteger bigInteger2, String str2) {
        return createContractTransaction(str, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null, str2);
    }

    public static qt6 createFunctionCallTransaction(String str, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str2, String str3) {
        return new qt6(str, bigInteger, bigInteger2, bigInteger3, str2, (BigInteger) null, str3);
    }
}
