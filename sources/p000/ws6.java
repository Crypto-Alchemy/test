package p000;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import androidx.media3.common.C0836t;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: ws6 */
/* compiled from: TrackGroupArray */
public final class ws6 implements C0785d {

    /* renamed from: g */
    public static final ws6 f19232g = new ws6(new C0836t[0]);

    /* renamed from: k */
    public static final C0785d.C0786a<ws6> f19233k = new vs6();

    /* renamed from: a */
    public final int f19234a;

    /* renamed from: d */
    public final ImmutableList<C0836t> f19235d;

    /* renamed from: e */
    public int f19236e;

    public ws6(C0836t... tVarArr) {
        this.f19235d = ImmutableList.copyOf((E[]) tVarArr);
        this.f19234a = tVarArr.length;
        mo27598f();
    }

    /* renamed from: d */
    public static String m29697d(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public static /* synthetic */ ws6 m29698e(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m29697d(0));
        if (parcelableArrayList == null) {
            return new ws6(new C0836t[0]);
        }
        return new ws6((C0836t[]) b60.m11129b(C0836t.f4468r, parcelableArrayList).toArray(new C0836t[0]));
    }

    /* renamed from: b */
    public C0836t mo27595b(int i) {
        return this.f19235d.get(i);
    }

    /* renamed from: c */
    public int mo27596c(C0836t tVar) {
        int indexOf = this.f19235d.indexOf(tVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ws6.class != obj.getClass()) {
            return false;
        }
        ws6 ws6 = (ws6) obj;
        if (this.f19234a != ws6.f19234a || !this.f19235d.equals(ws6.f19235d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo27598f() {
        int i = 0;
        while (i < this.f19235d.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f19235d.size(); i3++) {
                if (this.f19235d.get(i).equals(this.f19235d.get(i3))) {
                    gk3.m18127d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public int hashCode() {
        if (this.f19236e == 0) {
            this.f19236e = this.f19235d.hashCode();
        }
        return this.f19236e;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m29697d(0), b60.m11131d(this.f19235d));
        return bundle;
    }
}
