package androidx.compose.p004ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Lfo6;", "Landroid/view/View;", "a", "Landroid/view/View;", "view", "Landroid/view/ActionMode;", "b", "Landroid/view/ActionMode;", "actionMode", "Lzm6;", "c", "Lzm6;", "textActionModeCallback", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "d", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "<init>", "(Landroid/view/View;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar */
/* compiled from: AndroidTextToolbar.android.kt */
public final class AndroidTextToolbar implements fo6 {

    /* renamed from: a */
    public final View f1993a;

    /* renamed from: b */
    public ActionMode f1994b;

    /* renamed from: c */
    public final zm6 f1995c = new zm6(new AndroidTextToolbar$textActionModeCallback$1(this), (a95) null, (pc2) null, (pc2) null, (pc2) null, (pc2) null, 62, (DefaultConstructorMarker) null);

    /* renamed from: d */
    public TextToolbarStatus f1996d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        vx2.m53591g(view, "view");
        this.f1993a = view;
    }
}
