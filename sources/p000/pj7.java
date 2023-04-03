package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lpj7;", "T", "", "element", "Lr37;", "c", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "a", "Lv04;", "Ljava/lang/ref/Reference;", "Lv04;", "values", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: pj7 */
/* compiled from: WeakCache.kt */
public final class pj7<T> {

    /* renamed from: a */
    public final v04<Reference<T>> f16516a = new v04<>(new Reference[16], 0);

    /* renamed from: b */
    public final ReferenceQueue<T> f16517b = new ReferenceQueue<>();

    /* renamed from: a */
    public final void mo24620a() {
        Reference<? extends T> poll;
        do {
            poll = this.f16517b.poll();
            if (poll != null) {
                this.f16516a.mo26968t(poll);
                continue;
            }
        } while (poll != null);
    }

    /* renamed from: b */
    public final T mo24621b() {
        mo24620a();
        while (this.f16516a.mo26966r()) {
            v04<Reference<T>> v04 = this.f16516a;
            T t = v04.mo26971x(v04.mo26963n() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo24622c(T t) {
        mo24620a();
        this.f16516a.mo26953c(new WeakReference(t, this.f16517b));
    }
}
