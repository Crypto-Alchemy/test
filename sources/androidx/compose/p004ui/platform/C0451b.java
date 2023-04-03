package androidx.compose.p004ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\b\u0010\r\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002\"\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, mo44877d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Lwn0;", "parent", "Lkotlin/Function0;", "Lr37;", "content", "Lvn0;", "d", "(Landroidx/compose/ui/platform/AbstractComposeView;Lwn0;Lfd2;)Lvn0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lwn0;Lfd2;)Lvn0;", "b", "", "c", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.b */
/* compiled from: Wrapper.android.kt */
public final class C0451b {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f2107a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final vn0 m3159a(AndroidComposeView androidComposeView, wn0 wn0, fd2<? super nn0, ? super Integer, r37> fd2) {
        WrappedComposition wrappedComposition;
        if (m3161c(androidComposeView)) {
            androidComposeView.setTag(o35.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            m3160b();
        }
        vn0 a = co0.m12004a(new h37(androidComposeView.getRoot()), wn0);
        View view = androidComposeView.getView();
        int i = o35.wrapped_composition_tag;
        Object tag = view.getTag(i);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, a);
            androidComposeView.getView().setTag(i, wrappedComposition);
        }
        wrappedComposition.mo3982d(fd2);
        return wrappedComposition;
    }

    /* renamed from: b */
    public static final void m3160b() {
        if (!InspectableValueKt.m3089c()) {
            try {
                Field declaredField = InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean((Object) null, true);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static final boolean m3161c(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT < 29 || !(!sn7.f17760a.mo25919a(androidComposeView).isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p000.vn0 m3162d(androidx.compose.p004ui.platform.AbstractComposeView r3, p000.wn0 r4, p000.fd2<? super p000.nn0, ? super java.lang.Integer, p000.r37> r5) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "parent"
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "content"
            p000.vx2.m53591g(r5, r0)
            androidx.compose.ui.platform.GlobalSnapshotManager r0 = androidx.compose.p004ui.platform.GlobalSnapshotManager.f2042a
            r0.mo3927a()
            int r0 = r3.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L_0x0028
            r0 = 0
            android.view.View r0 = r3.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.p004ui.platform.AndroidComposeView
            if (r2 == 0) goto L_0x002b
            r1 = r0
            androidx.compose.ui.platform.AndroidComposeView r1 = (androidx.compose.p004ui.platform.AndroidComposeView) r1
            goto L_0x002b
        L_0x0028:
            r3.removeAllViews()
        L_0x002b:
            if (r1 != 0) goto L_0x0044
            androidx.compose.ui.platform.AndroidComposeView r1 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "context"
            p000.vx2.m53590f(r0, r2)
            r1.<init>(r0)
            android.view.View r0 = r1.getView()
            android.view.ViewGroup$LayoutParams r2 = f2107a
            r3.addView((android.view.View) r0, (android.view.ViewGroup.LayoutParams) r2)
        L_0x0044:
            vn0 r3 = m3159a(r1, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C0451b.m3162d(androidx.compose.ui.platform.AbstractComposeView, wn0, fd2):vn0");
    }
}
