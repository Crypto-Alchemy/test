package p000;

import android.view.PointerIcon;
import android.view.View;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, mo44877d2 = {"Lxh;", "", "Landroid/view/View;", "view", "Ljr4;", "icon", "Lr37;", "a", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xh */
/* compiled from: AndroidComposeView.android.kt */
public final class C3600xh {

    /* renamed from: a */
    public static final C3600xh f19832a = new C3600xh();

    /* renamed from: a */
    public final void mo27733a(View view, jr4 jr4) {
        PointerIcon pointerIcon;
        vx2.m53591g(view, "view");
        if (jr4 instanceof C2167dj) {
            pointerIcon = ((C2167dj) jr4).mo18788a();
        } else if (jr4 instanceof C2228ej) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((C2228ej) jr4).mo19255a());
            vx2.m53590f(pointerIcon, "getSystemIcon(view.context, icon.type)");
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
            vx2.m53590f(pointerIcon, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (!vx2.m53586b(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
