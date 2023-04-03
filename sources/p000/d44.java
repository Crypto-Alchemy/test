package p000;

import android.os.Bundle;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0010B3\b\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, mo44877d2 = {"Ld44;", "", "", "name", "Landroid/os/Bundle;", "bundle", "Lr37;", "d", "", "e", "toString", "other", "equals", "", "hashCode", "Lp44;", "a", "Lp44;", "()Lp44;", "type", "b", "Z", "c", "()Z", "isNullable", "isDefaultValuePresent", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "defaultValuePresent", "<init>", "(Lp44;ZLjava/lang/Object;Z)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: d44 */
/* compiled from: NavArgument.kt */
public final class d44 {

    /* renamed from: a */
    public final p44<Object> f10489a;

    /* renamed from: b */
    public final boolean f10490b;

    /* renamed from: c */
    public final boolean f10491c;

    /* renamed from: d */
    public final Object f10492d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0005\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\f\u001a\u00020\u000bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Ld44$a;", "", "T", "Lp44;", "type", "d", "", "isNullable", "c", "defaultValue", "b", "Ld44;", "a", "Lp44;", "Z", "Ljava/lang/Object;", "defaultValuePresent", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: d44$a */
    /* compiled from: NavArgument.kt */
    public static final class C2135a {

        /* renamed from: a */
        public p44<Object> f10493a;

        /* renamed from: b */
        public boolean f10494b;

        /* renamed from: c */
        public Object f10495c;

        /* renamed from: d */
        public boolean f10496d;

        /* renamed from: a */
        public final d44 mo18517a() {
            p44<Object> p44 = this.f10493a;
            if (p44 == null) {
                p44 = p44.f16281c.mo24374c(this.f10495c);
            }
            return new d44(p44, this.f10494b, this.f10495c, this.f10496d);
        }

        /* renamed from: b */
        public final C2135a mo18518b(Object obj) {
            this.f10495c = obj;
            this.f10496d = true;
            return this;
        }

        /* renamed from: c */
        public final C2135a mo18519c(boolean z) {
            this.f10494b = z;
            return this;
        }

        /* renamed from: d */
        public final <T> C2135a mo18520d(p44<T> p44) {
            vx2.m53591g(p44, "type");
            this.f10493a = p44;
            return this;
        }
    }

    public d44(p44<Object> p44, boolean z, Object obj, boolean z2) {
        boolean z3;
        vx2.m53591g(p44, "type");
        boolean z4 = false;
        if (p44.mo24334c() || !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if ((z || !z2 || obj != null) ? true : z4) {
                this.f10489a = p44;
                this.f10490b = z;
                this.f10492d = obj;
                this.f10491c = z2;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + p44.mo24333b() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((p44.mo24333b() + " does not allow nullable values").toString());
    }

    /* renamed from: a */
    public final p44<Object> mo18509a() {
        return this.f10489a;
    }

    /* renamed from: b */
    public final boolean mo18510b() {
        return this.f10491c;
    }

    /* renamed from: c */
    public final boolean mo18511c() {
        return this.f10490b;
    }

    /* renamed from: d */
    public final void mo18512d(String str, Bundle bundle) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(bundle, "bundle");
        if (this.f10491c) {
            this.f10489a.mo24337f(bundle, str, this.f10492d);
        }
    }

    /* renamed from: e */
    public final boolean mo18513e(String str, Bundle bundle) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(bundle, "bundle");
        if (!this.f10490b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f10489a.mo24332a(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vx2.m53586b(d44.class, obj.getClass())) {
            return false;
        }
        d44 d44 = (d44) obj;
        if (this.f10490b != d44.f10490b || this.f10491c != d44.f10491c || !vx2.m53586b(this.f10489a, d44.f10489a)) {
            return false;
        }
        Object obj2 = this.f10492d;
        if (obj2 != null) {
            return vx2.m53586b(obj2, d44.f10492d);
        }
        if (d44.f10492d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f10489a.hashCode() * 31) + (this.f10490b ? 1 : 0)) * 31) + (this.f10491c ? 1 : 0)) * 31;
        Object obj = this.f10492d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d44.class.getSimpleName());
        sb.append(" Type: " + this.f10489a);
        sb.append(" Nullable: " + this.f10490b);
        if (this.f10491c) {
            sb.append(" DefaultValue: " + this.f10492d);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }
}
