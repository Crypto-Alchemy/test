package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0016¢\u0006\u0004\b\u0012\u0010\u0014B\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0016"}, mo44877d2 = {"Luh3;", "", "newNext", "e", "newPrevious", "f", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "previous", "b", "c", "next", "", "()Z", "hasNext", "hasPrevious", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: uh3 */
/* compiled from: PersistentOrderedSet.kt */
public final class uh3 {

    /* renamed from: a */
    public final Object f18499a;

    /* renamed from: b */
    public final Object f18500b;

    public uh3(Object obj, Object obj2) {
        this.f18499a = obj;
        this.f18500b = obj2;
    }

    /* renamed from: a */
    public final boolean mo26789a() {
        if (this.f18500b != xp1.f19948a) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo26790b() {
        if (this.f18499a != xp1.f19948a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final Object mo26791c() {
        return this.f18500b;
    }

    /* renamed from: d */
    public final Object mo26792d() {
        return this.f18499a;
    }

    /* renamed from: e */
    public final uh3 mo26793e(Object obj) {
        return new uh3(this.f18499a, obj);
    }

    /* renamed from: f */
    public final uh3 mo26794f(Object obj) {
        return new uh3(obj, this.f18500b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uh3() {
        /*
            r1 = this;
            xp1 r0 = p000.xp1.f19948a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uh3.<init>():void");
    }

    public uh3(Object obj) {
        this(obj, xp1.f19948a);
    }
}
