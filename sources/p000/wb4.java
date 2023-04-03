package p000;

import androidx.recyclerview.widget.C1294g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a8\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000\u001a:\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a,\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\n\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¨\u0006\u0010"}, mo44877d2 = {"", "T", "Lvb4;", "newList", "Landroidx/recyclerview/widget/g$f;", "diffCallback", "Lub4;", "a", "Ldi3;", "callback", "diffResult", "Lr37;", "b", "", "oldPosition", "c", "paging-runtime_release"}, mo44878k = 2, mo44879mv = {1, 4, 2})
/* renamed from: wb4 */
/* compiled from: NullPaddedListDiffHelper.kt */
public final class wb4 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, mo44877d2 = {"wb4$a", "Landroidx/recyclerview/widget/g$b;", "", "oldItemPosition", "newItemPosition", "", "getChangePayload", "getOldListSize", "getNewListSize", "", "areItemsTheSame", "areContentsTheSame", "paging-runtime_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: wb4$a */
    /* compiled from: NullPaddedListDiffHelper.kt */
    public static final class C3530a extends C1294g.C1296b {

        /* renamed from: a */
        public final /* synthetic */ vb4 f19056a;

        /* renamed from: b */
        public final /* synthetic */ vb4 f19057b;

        /* renamed from: c */
        public final /* synthetic */ C1294g.C1300f f19058c;

        /* renamed from: d */
        public final /* synthetic */ int f19059d;

        /* renamed from: e */
        public final /* synthetic */ int f19060e;

        public C3530a(vb4<T> vb4, vb4 vb42, C1294g.C1300f fVar, int i, int i2) {
            this.f19056a = vb4;
            this.f19057b = vb42;
            this.f19058c = fVar;
            this.f19059d = i;
            this.f19060e = i2;
        }

        public boolean areContentsTheSame(int i, int i2) {
            Object d = this.f19056a.mo8714d(i);
            Object d2 = this.f19057b.mo8714d(i2);
            if (d == d2) {
                return true;
            }
            return this.f19058c.areContentsTheSame(d, d2);
        }

        public boolean areItemsTheSame(int i, int i2) {
            Object d = this.f19056a.mo8714d(i);
            Object d2 = this.f19057b.mo8714d(i2);
            if (d == d2) {
                return true;
            }
            return this.f19058c.areItemsTheSame(d, d2);
        }

        public Object getChangePayload(int i, int i2) {
            Object d = this.f19056a.mo8714d(i);
            Object d2 = this.f19057b.mo8714d(i2);
            if (d == d2) {
                return Boolean.TRUE;
            }
            return this.f19058c.getChangePayload(d, d2);
        }

        public int getNewListSize() {
            return this.f19060e;
        }

        public int getOldListSize() {
            return this.f19059d;
        }
    }

    /* renamed from: a */
    public static final <T> ub4 m29435a(vb4<T> vb4, vb4<T> vb42, C1294g.C1300f<T> fVar) {
        boolean z;
        vx2.m53591g(vb4, "$this$computeDiff");
        vx2.m53591g(vb42, "newList");
        vx2.m53591g(fVar, "diffCallback");
        boolean z2 = true;
        C1294g.C1299e c = C1294g.m9488c(new C3530a(vb4, vb42, fVar, vb4.mo8711a(), vb42.mo8711a()), true);
        vx2.m53590f(c, "DiffUtil.calculateDiff(\n…    },\n        true\n    )");
        rw2 q = d75.m43395q(0, vb4.mo8711a());
        if (!(q instanceof Collection) || !((Collection) q).isEmpty()) {
            Iterator it = q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (c.mo9772b(((lw2) it).nextInt()) != -1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return new ub4(c, z2);
        }
        z2 = false;
        return new ub4(c, z2);
    }

    /* renamed from: b */
    public static final <T> void m29436b(vb4<T> vb4, di3 di3, vb4<T> vb42, ub4 ub4) {
        vx2.m53591g(vb4, "$this$dispatchDiff");
        vx2.m53591g(di3, "callback");
        vx2.m53591g(vb42, "newList");
        vx2.m53591g(ub4, "diffResult");
        if (ub4.mo26730b()) {
            ij4.f13284a.mo21550a(vb4, vb42, di3, ub4);
        } else {
            gi1.f12323a.mo20586b(di3, vb4, vb42);
        }
    }

    /* renamed from: c */
    public static final int m29437c(vb4<?> vb4, ub4 ub4, vb4<?> vb42, int i) {
        int b;
        vx2.m53591g(vb4, "$this$transformAnchorIndex");
        vx2.m53591g(ub4, "diffResult");
        vx2.m53591g(vb42, "newList");
        if (!ub4.mo26730b()) {
            return d75.m43390l(i, d75.m43395q(0, vb42.getSize()));
        }
        int b2 = i - vb4.mo8712b();
        int a = vb4.mo8711a();
        if (b2 >= 0 && a > b2) {
            for (int i2 = 0; i2 <= 29; i2++) {
                int i3 = i2 / 2;
                int i4 = 1;
                if (i2 % 2 == 1) {
                    i4 = -1;
                }
                int i5 = (i3 * i4) + b2;
                if (i5 >= 0 && i5 < vb4.mo8711a() && (b = ub4.mo26729a().mo9772b(i5)) != -1) {
                    return b + vb42.mo8712b();
                }
            }
        }
        return d75.m43390l(i, d75.m43395q(0, vb42.getSize()));
    }
}
