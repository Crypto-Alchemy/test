package p000;

import java.util.List;
import kotlin.Metadata;
import p000.dl4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R)\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, mo44877d2 = {"Lfl4;", "", "Key", "Value", "other", "", "equals", "", "hashCode", "", "toString", "", "Ldl4$b$b;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "pages", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "anchorPosition", "Lbl4;", "c", "Lbl4;", "getConfig", "()Lbl4;", "config", "d", "I", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lbl4;I)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: fl4 */
/* compiled from: PagingState.kt */
public final class fl4<Key, Value> {

    /* renamed from: a */
    public final List<dl4.C2176b.C2178b<Key, Value>> f11919a;

    /* renamed from: b */
    public final Integer f11920b;

    /* renamed from: c */
    public final bl4 f11921c;

    /* renamed from: d */
    public final int f11922d;

    public fl4(List<dl4.C2176b.C2178b<Key, Value>> list, Integer num, bl4 bl4, int i) {
        vx2.m53591g(list, "pages");
        vx2.m53591g(bl4, "config");
        this.f11919a = list;
        this.f11920b = num;
        this.f11921c = bl4;
        this.f11922d = i;
    }

    /* renamed from: a */
    public final Integer mo19968a() {
        return this.f11920b;
    }

    /* renamed from: b */
    public final List<dl4.C2176b.C2178b<Key, Value>> mo19969b() {
        return this.f11919a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fl4) {
            fl4 fl4 = (fl4) obj;
            if (!vx2.m53586b(this.f11919a, fl4.f11919a) || !vx2.m53586b(this.f11920b, fl4.f11920b) || !vx2.m53586b(this.f11921c, fl4.f11921c) || this.f11922d != fl4.f11922d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f11919a.hashCode();
        Integer num = this.f11920b;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i + this.f11921c.hashCode() + this.f11922d;
    }

    public String toString() {
        return "PagingState(pages=" + this.f11919a + ", anchorPosition=" + this.f11920b + ", config=" + this.f11921c + ", " + "leadingPlaceholderCount=" + this.f11922d + ')';
    }
}
