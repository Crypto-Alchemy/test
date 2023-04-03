package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt__SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo44877d2 = {"Landroid/view/View;", "Lhw5;", "Landroid/view/ViewParent;", "a", "(Landroid/view/View;)Lhw5;", "ancestors", "core-ktx_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: View.kt */
public final class ViewKt {
    /* renamed from: a */
    public static final hw5<ViewParent> m4350a(View view) {
        vx2.m53591g(view, "<this>");
        return SequencesKt__SequencesKt.m63015j(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }
}
