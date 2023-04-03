package p000;

import java.util.List;
import kotlin.Metadata;
import p000.m76;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BU\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0017\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u001d"}, mo44877d2 = {"Lv26;", "", "RowType", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "I", "identifier", "Lm76;", "f", "Lm76;", "driver", "g", "Ljava/lang/String;", "fileName", "h", "label", "i", "query", "", "queries", "Lkotlin/Function1;", "mapper", "<init>", "(ILjava/util/List;Lm76;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrc2;)V", "runtime"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: v26 */
/* compiled from: Query.kt */
public final class v26<RowType> extends rz4<RowType> {

    /* renamed from: e */
    public final int f34819e;

    /* renamed from: f */
    public final m76 f34820f;

    /* renamed from: g */
    public final String f34821g;

    /* renamed from: h */
    public final String f34822h;

    /* renamed from: i */
    public final String f34823i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v26(int i, List<rz4<?>> list, m76 m76, String str, String str2, String str3, rc2<? super l76, ? extends RowType> rc2) {
        super(list, rc2);
        vx2.m53591g(list, "queries");
        vx2.m53591g(m76, "driver");
        vx2.m53591g(str, "fileName");
        vx2.m53591g(str2, "label");
        vx2.m53591g(str3, "query");
        vx2.m53591g(rc2, "mapper");
        this.f34819e = i;
        this.f34820f = m76;
        this.f34821g = str;
        this.f34822h = str2;
        this.f34823i = str3;
    }

    /* renamed from: a */
    public l76 mo40552a() {
        return m76.C6235a.m48111b(this.f34820f, Integer.valueOf(this.f34819e), this.f34823i, 0, (rc2) null, 8, (Object) null);
    }

    public String toString() {
        return this.f34821g + ':' + this.f34822h;
    }
}
