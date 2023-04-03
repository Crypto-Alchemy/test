package p000;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¨\u0006\u0005"}, mo44877d2 = {"Ljava/io/Closeable;", "", "cause", "Lr37;", "a", "kotlin-stdlib"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: lh0 */
/* compiled from: Closeable.kt */
public final class lh0 {
    /* renamed from: a */
    public static final void m47807a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            ru1.m51326a(th, th2);
        }
    }
}
