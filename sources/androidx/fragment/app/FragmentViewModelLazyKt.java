package androidx.fragment.app;

import androidx.lifecycle.C0729l;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0007\u001aZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0007¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u0002"}, mo44877d2 = {"Lad7;", "VM", "Landroidx/fragment/app/Fragment;", "Lq83;", "viewModelClass", "Lkotlin/Function0;", "Lgd7;", "storeProducer", "Landroidx/lifecycle/l$b;", "factoryProducer", "Lef3;", "b", "Lzv0;", "extrasProducer", "c", "Lhd7;", "owner", "fragment-ktx_release"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt {
    /* renamed from: b */
    public static final /* synthetic */ ef3 m4811b(Fragment fragment, q83 q83, pc2 pc2, pc2 pc22) {
        vx2.m53591g(fragment, "<this>");
        vx2.m53591g(q83, "viewModelClass");
        vx2.m53591g(pc2, "storeProducer");
        return m4812c(fragment, q83, pc2, new FragmentViewModelLazyKt$createViewModelLazy$1(fragment), pc22);
    }

    /* renamed from: c */
    public static final <VM extends ad7> ef3<VM> m4812c(Fragment fragment, q83<VM> q83, pc2<? extends gd7> pc2, pc2<? extends zv0> pc22, pc2<? extends C0729l.C0733b> pc23) {
        vx2.m53591g(fragment, "<this>");
        vx2.m53591g(q83, "viewModelClass");
        vx2.m53591g(pc2, "storeProducer");
        vx2.m53591g(pc22, "extrasProducer");
        if (pc23 == null) {
            pc23 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new dd7(q83, pc2, pc23, pc22);
    }

    /* renamed from: d */
    public static final hd7 m4813d(ef3<? extends hd7> ef3) {
        return (hd7) ef3.getValue();
    }
}
