package p000;

import java.lang.ref.SoftReference;

/* renamed from: sc4 */
/* compiled from: OOMSoftReference */
public class sc4<T> {

    /* renamed from: a */
    public SoftReference<T> f17611a = null;

    /* renamed from: b */
    public SoftReference<T> f17612b = null;

    /* renamed from: c */
    public SoftReference<T> f17613c = null;

    /* renamed from: a */
    public void mo25740a() {
        SoftReference<T> softReference = this.f17611a;
        if (softReference != null) {
            softReference.clear();
            this.f17611a = null;
        }
        SoftReference<T> softReference2 = this.f17612b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f17612b = null;
        }
        SoftReference<T> softReference3 = this.f17613c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f17613c = null;
        }
    }

    /* renamed from: b */
    public T mo25741b() {
        SoftReference<T> softReference = this.f17611a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* renamed from: c */
    public void mo25742c(T t) {
        this.f17611a = new SoftReference<>(t);
        this.f17612b = new SoftReference<>(t);
        this.f17613c = new SoftReference<>(t);
    }
}
