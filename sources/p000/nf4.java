package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0011\u001a\u00028\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lnf4;", "V", "Lp75;", "", "Li93;", "property", "oldValue", "newValue", "", "d", "(Li93;Ljava/lang/Object;Ljava/lang/Object;)Z", "Lr37;", "c", "(Li93;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;Li93;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Li93;Ljava/lang/Object;)V", "Ljava/lang/Object;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nf4 */
/* compiled from: ObservableProperty.kt */
public abstract class nf4<V> implements p75<Object, V> {

    /* renamed from: a */
    public V f32112a;

    public nf4(V v) {
        this.f32112a = v;
    }

    /* renamed from: a */
    public V mo46023a(Object obj, i93<?> i93) {
        vx2.m53591g(i93, "property");
        return this.f32112a;
    }

    /* renamed from: b */
    public void mo46070b(Object obj, i93<?> i93, V v) {
        vx2.m53591g(i93, "property");
        V v2 = this.f32112a;
        if (mo46072d(i93, v2, v)) {
            this.f32112a = v;
            mo46071c(i93, v2, v);
        }
    }

    /* renamed from: c */
    public void mo46071c(i93<?> i93, V v, V v2) {
        vx2.m53591g(i93, "property");
    }

    /* renamed from: d */
    public boolean mo46072d(i93<?> i93, V v, V v2) {
        vx2.m53591g(i93, "property");
        return true;
    }
}
