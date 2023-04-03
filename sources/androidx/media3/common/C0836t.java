package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* renamed from: androidx.media3.common.t */
/* compiled from: TrackGroup */
public final class C0836t implements C0785d {

    /* renamed from: r */
    public static final C0785d.C0786a<C0836t> f4468r = new us6();

    /* renamed from: a */
    public final int f4469a;

    /* renamed from: d */
    public final String f4470d;

    /* renamed from: e */
    public final int f4471e;

    /* renamed from: g */
    public final C0792h[] f4472g;

    /* renamed from: k */
    public int f4473k;

    public C0836t(C0792h... hVarArr) {
        this("", hVarArr);
    }

    /* renamed from: e */
    public static String m5845e(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: f */
    public static /* synthetic */ C0836t m5846f(Bundle bundle) {
        ImmutableList<C0792h> immutableList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m5845e(0));
        if (parcelableArrayList == null) {
            immutableList = ImmutableList.m36627of();
        } else {
            immutableList = b60.m11129b(C0792h.f4172u1, parcelableArrayList);
        }
        return new C0836t(bundle.getString(m5845e(1), ""), (C0792h[]) immutableList.toArray(new C0792h[0]));
    }

    /* renamed from: g */
    public static void m5847g(String str, String str2, String str3, int i) {
        gk3.m18127d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* renamed from: h */
    public static String m5848h(String str) {
        if (str == null || str.equals("und")) {
            return "";
        }
        return str;
    }

    /* renamed from: i */
    public static int m5849i(int i) {
        return i | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    /* renamed from: b */
    public C0836t mo6917b(String str) {
        return new C0836t(str, this.f4472g);
    }

    /* renamed from: c */
    public C0792h mo6918c(int i) {
        return this.f4472g[i];
    }

    /* renamed from: d */
    public int mo6919d(C0792h hVar) {
        int i = 0;
        while (true) {
            C0792h[] hVarArr = this.f4472g;
            if (i >= hVarArr.length) {
                return -1;
            }
            if (hVar == hVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0836t.class != obj.getClass()) {
            return false;
        }
        C0836t tVar = (C0836t) obj;
        if (!this.f4470d.equals(tVar.f4470d) || !Arrays.equals(this.f4472g, tVar.f4472g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f4473k == 0) {
            this.f4473k = ((527 + this.f4470d.hashCode()) * 31) + Arrays.hashCode(this.f4472g);
        }
        return this.f4473k;
    }

    /* renamed from: j */
    public final void mo6922j() {
        String h = m5848h(this.f4472g[0].f4189e);
        int i = m5849i(this.f4472g[0].f4193k);
        int i2 = 1;
        while (true) {
            C0792h[] hVarArr = this.f4472g;
            if (i2 >= hVarArr.length) {
                return;
            }
            if (!h.equals(m5848h(hVarArr[i2].f4189e))) {
                C0792h[] hVarArr2 = this.f4472g;
                m5847g("languages", hVarArr2[0].f4189e, hVarArr2[i2].f4189e, i2);
                return;
            } else if (i != m5849i(this.f4472g[i2].f4193k)) {
                m5847g("role flags", Integer.toBinaryString(this.f4472g[0].f4193k), Integer.toBinaryString(this.f4472g[i2].f4193k), i2);
                return;
            } else {
                i2++;
            }
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m5845e(0), b60.m11131d(Lists.m36794k(this.f4472g)));
        bundle.putString(m5845e(1), this.f4470d);
        return bundle;
    }

    public C0836t(String str, C0792h... hVarArr) {
        C2725kr.m20981a(hVarArr.length > 0);
        this.f4470d = str;
        this.f4472g = hVarArr;
        this.f4469a = hVarArr.length;
        int i = vv3.m29135i(hVarArr[0].f4175C);
        this.f4471e = i == -1 ? vv3.m29135i(hVarArr[0].f4174B) : i;
        mo6922j();
    }
}
