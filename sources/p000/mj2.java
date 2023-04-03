package p000;

import androidx.lifecycle.C0729l;
import kotlin.Metadata;
import net.safemoon.androidwallet.viewmodels.GraphViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lmj2;", "Landroidx/lifecycle/l$b;", "Lad7;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Lad7;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mj2 */
/* compiled from: GraphViewModelFactory.kt */
public final class mj2 implements C0729l.C0733b {
    /* renamed from: a */
    public <T extends ad7> T mo6370a(Class<T> cls) {
        vx2.m53591g(cls, "modelClass");
        p70 g = C9384u3.m72566g();
        vx2.m53590f(g, "getCMCClient()");
        ho3 l = C9384u3.m72571l();
        vx2.m53590f(l, "getMarketClient()");
        return new GraphViewModel(g, l);
    }

    /* renamed from: b */
    public /* synthetic */ ad7 mo6371b(Class cls, zv0 zv0) {
        return ed7.m16079b(this, cls, zv0);
    }
}
