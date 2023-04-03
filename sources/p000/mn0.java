package p000;

import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u001a \u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, mo44877d2 = {"", "bits", "slot", "a", "f", "d", "Lo85;", "other", "", "e", "Lnn0;", "composer", "key", "tracked", "", "block", "Lln0;", "b", "c", "runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: mn0 */
/* compiled from: ComposableLambda.kt */
public final class mn0 {
    /* renamed from: a */
    public static final int m22397a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    /* renamed from: b */
    public static final ln0 m22398b(nn0 nn0, int i, boolean z, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        vx2.m53591g(nn0, "composer");
        vx2.m53591g(obj, "block");
        nn0.mo2953i(i);
        Object j = nn0.mo2956j();
        if (j == nn0.f15626a.mo23753a()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z);
            nn0.mo2941e(composableLambdaImpl);
        } else {
            vx2.m53589e(j, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) j;
        }
        composableLambdaImpl.mo3138h(obj);
        nn0.mo2968o();
        return composableLambdaImpl;
    }

    /* renamed from: c */
    public static final ln0 m22399c(int i, boolean z, Object obj) {
        vx2.m53591g(obj, "block");
        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(i, z);
        composableLambdaImpl.mo3138h(obj);
        return composableLambdaImpl;
    }

    /* renamed from: d */
    public static final int m22400d(int i) {
        return m22397a(2, i);
    }

    /* renamed from: e */
    public static final boolean m22401e(o85 o85, o85 o852) {
        vx2.m53591g(o852, "other");
        if (o85 != null) {
            if ((o85 instanceof RecomposeScopeImpl) && (o852 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) o85;
                if (!recomposeScopeImpl.mo3078r() || vx2.m53586b(o85, o852) || vx2.m53586b(recomposeScopeImpl.mo3070j(), ((RecomposeScopeImpl) o852).mo3070j())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final int m22402f(int i) {
        return m22397a(1, i);
    }
}
