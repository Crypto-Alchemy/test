package p000;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Lc44;", "", "", "a", "I", "b", "()I", "destinationId", "Lm44;", "Lm44;", "c", "()Lm44;", "e", "(Lm44;)V", "navOptions", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "d", "(Landroid/os/Bundle;)V", "defaultArguments", "<init>", "(ILm44;Landroid/os/Bundle;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: c44 */
/* compiled from: NavAction.kt */
public final class c44 {

    /* renamed from: a */
    public final int f8327a;

    /* renamed from: b */
    public m44 f8328b;

    /* renamed from: c */
    public Bundle f8329c;

    public c44(int i, m44 m44, Bundle bundle) {
        this.f8327a = i;
        this.f8328b = m44;
        this.f8329c = bundle;
    }

    /* renamed from: a */
    public final Bundle mo11966a() {
        return this.f8329c;
    }

    /* renamed from: b */
    public final int mo11967b() {
        return this.f8327a;
    }

    /* renamed from: c */
    public final m44 mo11968c() {
        return this.f8328b;
    }

    /* renamed from: d */
    public final void mo11969d(Bundle bundle) {
        this.f8329c = bundle;
    }

    /* renamed from: e */
    public final void mo11970e(m44 m44) {
        this.f8328b = m44;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c44(int i, m44 m44, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : m44, (i2 & 4) != 0 ? null : bundle);
    }
}
