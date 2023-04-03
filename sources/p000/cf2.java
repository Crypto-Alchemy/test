package p000;

import androidx.paging.LoadType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lcf2;", "", "Landroidx/paging/LoadType;", "loadType", "", "c", "(Landroidx/paging/LoadType;)I", "", "toString", "hashCode", "other", "", "equals", "a", "I", "()I", "generationId", "Lgf7;", "b", "Lgf7;", "()Lgf7;", "hint", "<init>", "(ILgf7;)V", "paging-common"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* renamed from: cf2 */
/* compiled from: PageFetcherSnapshot.kt */
public final class cf2 {

    /* renamed from: a */
    public final int f8427a;

    /* renamed from: b */
    public final gf7 f8428b;

    public cf2(int i, gf7 gf7) {
        vx2.m53591g(gf7, "hint");
        this.f8427a = i;
        this.f8428b = gf7;
    }

    /* renamed from: a */
    public final int mo12043a() {
        return this.f8427a;
    }

    /* renamed from: b */
    public final gf7 mo12044b() {
        return this.f8428b;
    }

    /* renamed from: c */
    public final int mo12045c(LoadType loadType) {
        vx2.m53591g(loadType, "loadType");
        int i = bf2.f8124a[loadType.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        } else if (i == 2) {
            return this.f8428b.mo20567d();
        } else {
            if (i == 3) {
                return this.f8428b.mo20566c();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf2)) {
            return false;
        }
        cf2 cf2 = (cf2) obj;
        return this.f8427a == cf2.f8427a && vx2.m53586b(this.f8428b, cf2.f8428b);
    }

    public int hashCode() {
        int i = this.f8427a * 31;
        gf7 gf7 = this.f8428b;
        return i + (gf7 != null ? gf7.hashCode() : 0);
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f8427a + ", hint=" + this.f8428b + ")";
    }
}
