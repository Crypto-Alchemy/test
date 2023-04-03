package p000;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, mo44877d2 = {"Ltp0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "id", "Lsp0;", "b", "Lsp0;", "()Lsp0;", "type", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "d", "getUri", "uri", "e", "getIcon", "icon", "<init>", "(ILsp0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tp0 */
/* compiled from: ConnectionUI.kt */
public final class tp0 {

    /* renamed from: a */
    public final int f44792a;

    /* renamed from: b */
    public final sp0 f44793b;

    /* renamed from: c */
    public final String f44794c;

    /* renamed from: d */
    public final String f44795d;

    /* renamed from: e */
    public final String f44796e;

    public tp0(int i, sp0 sp0, String str, String str2, String str3) {
        vx2.m53591g(sp0, "type");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "uri");
        this.f44792a = i;
        this.f44793b = sp0;
        this.f44794c = str;
        this.f44795d = str2;
        this.f44796e = str3;
    }

    /* renamed from: a */
    public final int mo66110a() {
        return this.f44792a;
    }

    /* renamed from: b */
    public final sp0 mo66111b() {
        return this.f44793b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp0)) {
            return false;
        }
        tp0 tp0 = (tp0) obj;
        return this.f44792a == tp0.f44792a && vx2.m53586b(this.f44793b, tp0.f44793b) && vx2.m53586b(this.f44794c, tp0.f44794c) && vx2.m53586b(this.f44795d, tp0.f44795d) && vx2.m53586b(this.f44796e, tp0.f44796e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f44792a * 31) + this.f44793b.hashCode()) * 31) + this.f44794c.hashCode()) * 31) + this.f44795d.hashCode()) * 31;
        String str = this.f44796e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.f44792a;
        sp0 sp0 = this.f44793b;
        String str = this.f44794c;
        String str2 = this.f44795d;
        String str3 = this.f44796e;
        return "ConnectionUI(id=" + i + ", type=" + sp0 + ", name=" + str + ", uri=" + str2 + ", icon=" + str3 + ")";
    }
}
