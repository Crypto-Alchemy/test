package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, mo44877d2 = {"Lokhttp3/Dns;", "", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Dns.kt */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    @Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, mo44877d2 = {"Lokhttp3/Dns$Companion;", "", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Dns.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata(mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo44877d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "()V", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
        /* compiled from: Dns.kt */
        public static final class DnsSystem implements Dns {
            public List<InetAddress> lookup(String str) {
                vx2.m53591g(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    vx2.m53590f(allByName, "getAllByName(hostname)");
                    return ArraysKt___ArraysKt.m47291q0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(vx2.m53598n("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
