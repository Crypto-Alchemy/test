package p000;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hx0 */
/* compiled from: CueGroup */
public final class hx0 implements C0785d {

    /* renamed from: d */
    public static final hx0 f13086d = new hx0(ImmutableList.m36627of());

    /* renamed from: e */
    public static final C0785d.C0786a<hx0> f13087e = new gx0();

    /* renamed from: a */
    public final ImmutableList<dx0> f13088a;

    public hx0(List<dx0> list) {
        this.f13088a = ImmutableList.copyOf(list);
    }

    /* renamed from: b */
    public static ImmutableList<dx0> m19290b(List<dx0> list) {
        ImmutableList.C4534a builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f10946g == null) {
                builder.mo34667a(list.get(i));
            }
        }
        return builder.mo34692l();
    }

    /* renamed from: c */
    public static final hx0 m19291c(Bundle bundle) {
        ImmutableList<dx0> immutableList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m19292d(0));
        if (parcelableArrayList == null) {
            immutableList = ImmutableList.m36627of();
        } else {
            immutableList = b60.m11129b(dx0.f10934U, parcelableArrayList);
        }
        return new hx0(immutableList);
    }

    /* renamed from: d */
    public static String m19292d(int i) {
        return Integer.toString(i, 36);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(m19292d(0), b60.m11131d(m19290b(this.f13088a)));
        return bundle;
    }
}
