package p000;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\u0007\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Lvm3;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "toString", "L", "K", "()Lvm3;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: vm3 */
/* compiled from: MainCoroutineDispatcher.kt */
public abstract class vm3 extends CoroutineDispatcher {
    /* renamed from: K */
    public abstract vm3 mo55551K();

    /* renamed from: L */
    public final String mo66537L() {
        vm3 vm3;
        vm3 c = qh1.m71266c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            vm3 = c.mo55551K();
        } catch (UnsupportedOperationException unused) {
            vm3 = null;
        }
        if (this == vm3) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String L = mo66537L();
        if (L != null) {
            return L;
        }
        return b31.m55722a(this) + '@' + b31.m55723b(this);
    }
}
