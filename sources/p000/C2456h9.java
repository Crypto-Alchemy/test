package p000;

import android.os.Bundle;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lh9;", "Lj44;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "()I", "actionId", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "arguments", "<init>", "(I)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: h9 */
/* compiled from: ActionOnlyNavDirections.kt */
public final class C2456h9 implements j44 {

    /* renamed from: a */
    public final int f12784a;

    /* renamed from: b */
    public final Bundle f12785b = new Bundle();

    public C2456h9(int i) {
        this.f12784a = i;
    }

    /* renamed from: a */
    public int mo21068a() {
        return this.f12784a;
    }

    /* renamed from: b */
    public Bundle mo21069b() {
        return this.f12785b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vx2.m53586b(C2456h9.class, obj.getClass())) {
            return false;
        }
        if (mo21068a() == ((C2456h9) obj).mo21068a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 31 + mo21068a();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + mo21068a() + ')';
    }
}
