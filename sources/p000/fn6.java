package p000;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, mo44877d2 = {"Lfn6;", "", "other", "", "c", "", "toString", "equals", "", "hashCode", "a", "I", "d", "()I", "mask", "<init>", "(I)V", "b", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fn6 */
/* compiled from: TextDecoration.kt */
public final class fn6 {

    /* renamed from: b */
    public static final C2309a f11948b = new C2309a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final fn6 f11949c = new fn6(0);

    /* renamed from: d */
    public static final fn6 f11950d = new fn6(1);

    /* renamed from: e */
    public static final fn6 f11951e = new fn6(2);

    /* renamed from: a */
    public final int f11952a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, mo44877d2 = {"Lfn6$a;", "", "Lfn6;", "Underline", "Lfn6;", "b", "()Lfn6;", "getUnderline$annotations", "()V", "LineThrough", "a", "getLineThrough$annotations", "<init>", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: fn6$a */
    /* compiled from: TextDecoration.kt */
    public static final class C2309a {
        public C2309a() {
        }

        public /* synthetic */ C2309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final fn6 mo20026a() {
            return fn6.f11951e;
        }

        /* renamed from: b */
        public final fn6 mo20027b() {
            return fn6.f11950d;
        }
    }

    public fn6(int i) {
        this.f11952a = i;
    }

    /* renamed from: c */
    public final boolean mo20021c(fn6 fn6) {
        vx2.m53591g(fn6, "other");
        int i = this.f11952a;
        if ((fn6.f11952a | i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int mo20022d() {
        return this.f11952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fn6) && this.f11952a == ((fn6) obj).f11952a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f11952a;
    }

    public String toString() {
        if (this.f11952a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f11952a & f11950d.f11952a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f11952a & f11951e.f11952a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + qm6.m25770d(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null) + ']';
    }
}
