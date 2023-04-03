package p000;

import java.util.concurrent.ScheduledExecutorService;

@Deprecated
/* renamed from: us4 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class us4 {

    /* renamed from: a */
    public static C6575a f34696a;

    /* renamed from: us4$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C6575a {
        @Deprecated
        /* renamed from: a */
        ScheduledExecutorService mo28880a();
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized C6575a m52992a() {
        C6575a aVar;
        synchronized (us4.class) {
            if (f34696a == null) {
                f34696a = new a58();
            }
            aVar = f34696a;
        }
        return aVar;
    }
}
