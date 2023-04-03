package p000;

import kotlin.Metadata;
import p000.nd2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lx7;", "Lnd2;", "", "T", "", "other", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "label", "Lnd2;", "()Lnd2;", "action", "<init>", "(Ljava/lang/String;Lnd2;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: x7 */
/* compiled from: SemanticsProperties.kt */
public final class C3574x7<T extends nd2<? extends Boolean>> {

    /* renamed from: a */
    public final String f19328a;

    /* renamed from: b */
    public final T f19329b;

    public C3574x7(String str, T t) {
        this.f19328a = str;
        this.f19329b = t;
    }

    /* renamed from: a */
    public final T mo27683a() {
        return this.f19329b;
    }

    /* renamed from: b */
    public final String mo27684b() {
        return this.f19328a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3574x7)) {
            return false;
        }
        C3574x7 x7Var = (C3574x7) obj;
        if (vx2.m53586b(this.f19328a, x7Var.f19328a) && vx2.m53586b(this.f19329b, x7Var.f19329b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f19328a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.f19329b;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f19328a + ", action=" + this.f19329b + ')';
    }
}
