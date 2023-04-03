package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C4105e0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.c0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class C4099c0 extends wz8<C4105e0.C4110e> {
    /* renamed from: a */
    public final int mo31162a(Map.Entry<?, ?> entry) {
        return ((C4105e0.C4110e) entry.getKey()).f22867a;
    }

    /* renamed from: b */
    public final Object mo31163b(C4095b0 b0Var, k59 k59, int i) {
        return b0Var.mo31159a(k59, i);
    }

    /* renamed from: c */
    public final i09<C4105e0.C4110e> mo31164c(Object obj) {
        return ((C4105e0.C4108c) obj).zzc;
    }

    /* renamed from: d */
    public final void mo31165d(sa9 sa9, Map.Entry<?, ?> entry) throws IOException {
        C4105e0.C4110e eVar = (C4105e0.C4110e) entry.getKey();
        if (eVar.f22869e) {
            switch (c09.f21537a[eVar.f22868d.ordinal()]) {
                case 1:
                    i79.m45564l(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 2:
                    i79.m45577y(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 3:
                    i79.m45525C(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 4:
                    i79.m45529G(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 5:
                    i79.m45542T(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 6:
                    i79.m45536N(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 7:
                    i79.m45550a0(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 8:
                    i79.m45556d0(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 9:
                    i79.m45545W(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 10:
                    i79.m45552b0(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 11:
                    i79.m45539Q(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 12:
                    i79.m45548Z(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 13:
                    i79.m45533K(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 14:
                    i79.m45542T(eVar.f22867a, (List) entry.getValue(), sa9, false);
                    return;
                case 15:
                    i79.m45575w(eVar.f22867a, (List) entry.getValue(), sa9);
                    return;
                case 16:
                    i79.m45562j(eVar.f22867a, (List) entry.getValue(), sa9);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        i79.m45576x(eVar.f22867a, (List) entry.getValue(), sa9, n69.m48643a().mo46002b(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        i79.m45563k(eVar.f22867a, (List) entry.getValue(), sa9, n69.m48643a().mo46002b(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (c09.f21537a[eVar.f22868d.ordinal()]) {
                case 1:
                    sa9.mo45578l(eVar.f22867a, ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    sa9.mo45579m(eVar.f22867a, ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    sa9.mo45577k(eVar.f22867a, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    sa9.mo45571e(eVar.f22867a, ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    sa9.mo45569c(eVar.f22867a, ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    sa9.mo45563K(eVar.f22867a, ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    sa9.mo45584r(eVar.f22867a, ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    sa9.mo45557E(eVar.f22867a, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    sa9.mo45585s(eVar.f22867a, ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    sa9.mo45576j(eVar.f22867a, ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    sa9.mo45567a(eVar.f22867a, ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    sa9.mo45580n(eVar.f22867a, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    sa9.mo45564L(eVar.f22867a, ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    sa9.mo45569c(eVar.f22867a, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    sa9.mo45565M(eVar.f22867a, (zzht) entry.getValue());
                    return;
                case 16:
                    sa9.mo45590x(eVar.f22867a, (String) entry.getValue());
                    return;
                case 17:
                    sa9.mo45560H(eVar.f22867a, entry.getValue(), n69.m48643a().mo46002b(entry.getValue().getClass()));
                    return;
                case 18:
                    sa9.mo45561I(eVar.f22867a, entry.getValue(), n69.m48643a().mo46002b(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo31166e(k59 k59) {
        return k59 instanceof C4105e0.C4108c;
    }

    /* renamed from: f */
    public final i09<C4105e0.C4110e> mo31167f(Object obj) {
        return ((C4105e0.C4108c) obj).mo31191x();
    }

    /* renamed from: g */
    public final void mo31168g(Object obj) {
        mo31164c(obj).mo43441i();
    }
}
