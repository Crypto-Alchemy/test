package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Ljh3;", "Lzw;", "", "retryCount", "", "a", "J", "b", "()J", "durationMillis", "<init>", "(J)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: jh3 */
/* compiled from: LinearBackoffStrategy.kt */
public final class jh3 implements C6779zw {

    /* renamed from: a */
    public final long f30500a;

    public jh3(long j) {
        boolean z;
        this.f30500a = j;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("durationMillis, " + mo44469b() + ", must be positive").toString());
        }
    }

    /* renamed from: a */
    public long mo44468a(int i) {
        return this.f30500a;
    }

    /* renamed from: b */
    public final long mo44469b() {
        return this.f30500a;
    }
}
