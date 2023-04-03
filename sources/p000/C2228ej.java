package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, mo44877d2 = {"Lej;", "Ljr4;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "()I", "type", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ej */
/* compiled from: PointerIcon.android.kt */
public final class C2228ej implements jr4 {

    /* renamed from: a */
    public final int f11174a;

    /* renamed from: a */
    public final int mo19255a() {
        return this.f11174a;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C2228ej> cls2 = C2228ej.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!vx2.m53586b(cls2, cls)) {
            return false;
        }
        vx2.m53589e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.f11174a != ((C2228ej) obj).f11174a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f11174a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f11174a + ')';
    }
}
