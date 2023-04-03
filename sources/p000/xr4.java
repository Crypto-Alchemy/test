package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u000f\u001a\u00060\u0005j\u0002`\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00060\u0005j\u0002`\f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0001\u000f\u0001\u00060\u0005j\u0002`\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Lxr4;", "", "", "e", "(I)Ljava/lang/String;", "", "d", "(I)I", "other", "", "c", "(ILjava/lang/Object;)Z", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "a", "I", "packedValue", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xr4 */
/* compiled from: PointerEvent.kt */
public final class xr4 {

    /* renamed from: a */
    public final int f19963a;

    public /* synthetic */ xr4(int i) {
        this.f19963a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ xr4 m30287a(int i) {
        return new xr4(i);
    }

    /* renamed from: b */
    public static int m30288b(int i) {
        return i;
    }

    /* renamed from: c */
    public static boolean m30289c(int i, Object obj) {
        return (obj instanceof xr4) && i == ((xr4) obj).mo27868f();
    }

    /* renamed from: d */
    public static int m30290d(int i) {
        return i;
    }

    /* renamed from: e */
    public static String m30291e(int i) {
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m30289c(this.f19963a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ int mo27868f() {
        return this.f19963a;
    }

    public int hashCode() {
        return m30290d(this.f19963a);
    }

    public String toString() {
        return m30291e(this.f19963a);
    }
}
