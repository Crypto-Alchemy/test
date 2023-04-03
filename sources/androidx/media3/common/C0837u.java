package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.common.u */
/* compiled from: TrackSelectionOverride */
public final class C0837u implements C0785d {

    /* renamed from: e */
    public static final C0785d.C0786a<C0837u> f4474e = new ct6();

    /* renamed from: a */
    public final C0836t f4475a;

    /* renamed from: d */
    public final ImmutableList<Integer> f4476d;

    public C0837u(C0836t tVar, List<Integer> list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < tVar.f4469a)) {
            this.f4475a = tVar;
            this.f4476d = ImmutableList.copyOf(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public static String m5855c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: d */
    public static /* synthetic */ C0837u m5856d(Bundle bundle) {
        return new C0837u(C0836t.f4468r.mo104a((Bundle) C2725kr.m20985e(bundle.getBundle(m5855c(0)))), Ints.m37044c((int[]) C2725kr.m20985e(bundle.getIntArray(m5855c(1)))));
    }

    /* renamed from: b */
    public int mo6923b() {
        return this.f4475a.f4471e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0837u.class != obj.getClass()) {
            return false;
        }
        C0837u uVar = (C0837u) obj;
        if (!this.f4475a.equals(uVar.f4475a) || !this.f4476d.equals(uVar.f4476d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f4475a.hashCode() + (this.f4476d.hashCode() * 31);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(m5855c(0), this.f4475a.toBundle());
        bundle.putIntArray(m5855c(1), Ints.m37052k(this.f4476d));
        return bundle;
    }
}
