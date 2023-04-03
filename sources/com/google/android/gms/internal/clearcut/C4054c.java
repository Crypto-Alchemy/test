package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C4056e;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.c */
public final class C4054c extends id8<C4056e.C4060d> {
    /* renamed from: a */
    public final int mo30759a(Map.Entry<?, ?> entry) {
        return ((C4056e.C4060d) entry.getKey()).f22452a;
    }

    /* renamed from: b */
    public final td8<C4056e.C4060d> mo30760b(Object obj) {
        return ((C4056e.C4059c) obj).zzjv;
    }

    /* renamed from: c */
    public final void mo30761c(Object obj, td8<C4056e.C4060d> td8) {
        ((C4056e.C4059c) obj).zzjv = td8;
    }

    /* renamed from: d */
    public final void mo30762d(dr8 dr8, Map.Entry<?, ?> entry) throws IOException {
        C4056e.C4060d dVar = (C4056e.C4060d) entry.getKey();
        switch (nd8.f32098a[dVar.f22453d.ordinal()]) {
            case 1:
                dr8.mo42021l(dVar.f22452a, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                dr8.mo42022m(dVar.f22452a, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                dr8.mo42008N(dVar.f22452a, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                dr8.mo42020k(dVar.f22452a, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                dr8.mo42015c(dVar.f22452a, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                dr8.mo42016e(dVar.f22452a, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                dr8.mo42023n(dVar.f22452a, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                dr8.mo41999E(dVar.f22452a, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                dr8.mo42027r(dVar.f22452a, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                dr8.mo42012R(dVar.f22452a, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                dr8.mo42003I(dVar.f22452a, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                dr8.mo42028s(dVar.f22452a, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                dr8.mo42013a(dVar.f22452a, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                dr8.mo42015c(dVar.f22452a, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                dr8.mo42001G(dVar.f22452a, (zzbb) entry.getValue());
                return;
            case 16:
                dr8.mo42033x(dVar.f22452a, (String) entry.getValue());
                return;
            case 17:
                dr8.mo42007M(dVar.f22452a, entry.getValue(), sl8.m51829a().mo47813b(entry.getValue().getClass()));
                return;
            case 18:
                dr8.mo42009O(dVar.f22452a, entry.getValue(), sl8.m51829a().mo47813b(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public final td8<C4056e.C4060d> mo30763e(Object obj) {
        td8<C4056e.C4060d> b = mo30760b(obj);
        if (!b.mo48081c()) {
            return b;
        }
        td8<C4056e.C4060d> td8 = (td8) b.clone();
        mo30761c(obj, td8);
        return td8;
    }

    /* renamed from: f */
    public final void mo30764f(Object obj) {
        mo30760b(obj).mo48093t();
    }

    /* renamed from: g */
    public final boolean mo30765g(tj8 tj8) {
        return tj8 instanceof C4056e.C4059c;
    }
}
