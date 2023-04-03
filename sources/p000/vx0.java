package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"Lvx0;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "label", "Lkotlin/Function0;", "Lpc2;", "()Lpc2;", "action", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: vx0 */
/* compiled from: SemanticsProperties.kt */
public final class vx0 {

    /* renamed from: a */
    public final String f18921a;

    /* renamed from: b */
    public final pc2<Boolean> f18922b;

    /* renamed from: a */
    public final pc2<Boolean> mo27356a() {
        return this.f18922b;
    }

    /* renamed from: b */
    public final String mo27357b() {
        return this.f18921a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx0)) {
            return false;
        }
        vx0 vx0 = (vx0) obj;
        if (vx2.m53586b(this.f18921a, vx0.f18921a) && vx2.m53586b(this.f18922b, vx0.f18922b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f18921a.hashCode() * 31) + this.f18922b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f18921a + ", action=" + this.f18922b + ')';
    }
}
