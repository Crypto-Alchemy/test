package p000;

import android.view.PointerIcon;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, mo44877d2 = {"Ldj;", "Ljr4;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroid/view/PointerIcon;", "a", "Landroid/view/PointerIcon;", "()Landroid/view/PointerIcon;", "pointerIcon", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: dj */
/* compiled from: PointerIcon.android.kt */
public final class C2167dj implements jr4 {

    /* renamed from: a */
    public final PointerIcon f10726a;

    /* renamed from: a */
    public final PointerIcon mo18788a() {
        return this.f10726a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C2167dj> cls2 = C2167dj.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!vx2.m53586b(cls2, cls)) {
            return false;
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return vx2.m53586b(this.f10726a, ((C2167dj) obj).f10726a);
    }

    public int hashCode() {
        return this.f10726a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f10726a + ')';
    }
}
