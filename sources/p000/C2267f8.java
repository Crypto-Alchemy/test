package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, mo44877d2 = {"Lf8;", "Lb8;", "", "current", "", "a", "b", "index", "", "j", "i", "<init>", "()V", "c", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f8 */
/* compiled from: AccessibilityIterators.android.kt */
public final class C2267f8 extends C1610b8 {

    /* renamed from: c */
    public static final C2268a f11559c = new C2268a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static C2267f8 f11560d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo44877d2 = {"Lf8$a;", "", "Lf8;", "a", "instance", "Lf8;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: f8$a */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class C2268a {
        public C2268a() {
        }

        public /* synthetic */ C2268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2267f8 mo19715a() {
            if (C2267f8.f11560d == null) {
                C2267f8.f11560d = new C2267f8((DefaultConstructorMarker) null);
            }
            C2267f8 g = C2267f8.f11560d;
            vx2.m53589e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return g;
        }
    }

    public C2267f8() {
    }

    public /* synthetic */ C2267f8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public int[] mo12014a(int i) {
        int length = mo11430d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && mo11430d().charAt(i) == 10 && !mo19714j(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !mo19713i(i2)) {
            i2++;
        }
        return mo11429c(i, i2);
    }

    /* renamed from: b */
    public int[] mo12015b(int i) {
        int length = mo11430d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && mo11430d().charAt(i - 1) == 10 && !mo19713i(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && !mo19714j(i2)) {
            i2--;
        }
        return mo11429c(i2, i);
    }

    /* renamed from: i */
    public final boolean mo19713i(int i) {
        if (i <= 0 || mo11430d().charAt(i - 1) == 10 || (i != mo11430d().length() && mo11430d().charAt(i) != 10)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo19714j(int i) {
        if (mo11430d().charAt(i) == 10 || (i != 0 && mo11430d().charAt(i - 1) != 10)) {
            return false;
        }
        return true;
    }
}
