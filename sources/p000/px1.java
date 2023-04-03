package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, mo44877d2 = {"Lpx1;", "Lzw;", "", "retryCount", "", "a", "J", "b", "()J", "initialDurationMillis", "c", "maxDurationMillis", "<init>", "(JJ)V", "scarlet"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: px1 */
/* compiled from: ExponentialBackoffStrategy.kt */
public final class px1 implements C6779zw {

    /* renamed from: a */
    public final long f32869a;

    /* renamed from: b */
    public final long f32870b;

    public px1(long j, long j2) {
        boolean z;
        this.f32869a = j;
        this.f32870b = j2;
        boolean z2 = true;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(j2 <= 0 ? false : z2)) {
                throw new IllegalArgumentException(("maxDurationMillis, " + mo46917c() + ", must be positive").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("initialDurationMillis, " + mo46916b() + ", must be positive").toString());
    }

    /* renamed from: a */
    public long mo44468a(int i) {
        return (long) Math.min((double) this.f32870b, ((double) this.f32869a) * Math.pow(2.0d, (double) i));
    }

    /* renamed from: b */
    public final long mo46916b() {
        return this.f32869a;
    }

    /* renamed from: c */
    public final long mo46917c() {
        return this.f32870b;
    }
}
