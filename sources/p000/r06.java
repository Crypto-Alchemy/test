package p000;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigInteger;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
/* renamed from: r06 */
/* compiled from: ShhPost */
public class r06 {
    private String from;
    private String payload;
    private BigInteger priority;

    /* renamed from: to */
    private String f44273to;
    private List<String> topics;
    private BigInteger ttl;

    public r06(List<String> list, String str, BigInteger bigInteger, BigInteger bigInteger2) {
        this.topics = list;
        this.payload = str;
        this.priority = bigInteger;
        this.ttl = bigInteger2;
    }

    private String convert(BigInteger bigInteger) {
        if (bigInteger != null) {
            return pc4.encodeQuantity(bigInteger);
        }
        return null;
    }

    public String getFrom() {
        return this.from;
    }

    public String getPayload() {
        return this.payload;
    }

    public String getPriority() {
        return convert(this.priority);
    }

    public String getTo() {
        return this.f44273to;
    }

    public List<String> getTopics() {
        return this.topics;
    }

    public String getTtl() {
        return convert(this.ttl);
    }

    public r06(String str, String str2, List<String> list, String str3, BigInteger bigInteger, BigInteger bigInteger2) {
        this.from = str;
        this.f44273to = str2;
        this.topics = list;
        this.payload = str3;
        this.priority = bigInteger;
        this.ttl = bigInteger2;
    }
}
