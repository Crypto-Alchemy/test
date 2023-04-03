package p000;

import androidx.lifecycle.C0729l;
import kotlin.Metadata;
import p000.ad7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, mo44877d2 = {"Ldd7;", "Lad7;", "VM", "Lef3;", "", "isInitialized", "Lq83;", "a", "Lq83;", "viewModelClass", "Lkotlin/Function0;", "Lgd7;", "d", "Lpc2;", "storeProducer", "Landroidx/lifecycle/l$b;", "e", "factoryProducer", "Lzv0;", "g", "extrasProducer", "k", "Lad7;", "cached", "()Lad7;", "value", "<init>", "(Lq83;Lpc2;Lpc2;Lpc2;)V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: dd7 */
/* compiled from: ViewModelLazy.kt */
public final class dd7<VM extends ad7> implements ef3<VM> {

    /* renamed from: a */
    public final q83<VM> f10675a;

    /* renamed from: d */
    public final pc2<gd7> f10676d;

    /* renamed from: e */
    public final pc2<C0729l.C0733b> f10677e;

    /* renamed from: g */
    public final pc2<zv0> f10678g;

    /* renamed from: k */
    public VM f10679k;

    public dd7(q83<VM> q83, pc2<? extends gd7> pc2, pc2<? extends C0729l.C0733b> pc22, pc2<? extends zv0> pc23) {
        vx2.m53591g(q83, "viewModelClass");
        vx2.m53591g(pc2, "storeProducer");
        vx2.m53591g(pc22, "factoryProducer");
        vx2.m53591g(pc23, "extrasProducer");
        this.f10675a = q83;
        this.f10676d = pc2;
        this.f10677e = pc22;
        this.f10678g = pc23;
    }

    /* renamed from: a */
    public VM getValue() {
        VM vm = this.f10679k;
        if (vm != null) {
            return vm;
        }
        VM a = new C0729l(this.f10676d.invoke(), this.f10677e.invoke(), this.f10678g.invoke()).mo6421a(x73.m54253b(this.f10675a));
        this.f10679k = a;
        return a;
    }

    public boolean isInitialized() {
        if (this.f10679k != null) {
            return true;
        }
        return false;
    }
}
