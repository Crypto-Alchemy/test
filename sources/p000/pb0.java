package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: pb0 */
/* compiled from: CardViewApi21Impl */
public class pb0 implements rb0 {
    /* renamed from: a */
    public void mo24516a(qb0 qb0) {
        mo24523h(qb0, mo24529n(qb0));
    }

    /* renamed from: b */
    public void mo24517b(qb0 qb0) {
        if (!qb0.mo2849c()) {
            qb0.mo2847a(0, 0, 0, 0);
            return;
        }
        float n = mo24529n(qb0);
        float k = mo24526k(qb0);
        int ceil = (int) Math.ceil((double) ai5.m317a(n, k, qb0.mo2851e()));
        int ceil2 = (int) Math.ceil((double) ai5.m318b(n, k, qb0.mo2851e()));
        qb0.mo2847a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: c */
    public float mo24518c(qb0 qb0) {
        return mo24526k(qb0) * 2.0f;
    }

    /* renamed from: d */
    public void mo24519d(qb0 qb0) {
        mo24523h(qb0, mo24529n(qb0));
    }

    /* renamed from: e */
    public float mo24520e(qb0 qb0) {
        return qb0.mo2852f().getElevation();
    }

    /* renamed from: f */
    public void mo24521f(qb0 qb0, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        qb0.mo2848b(new zh5(colorStateList, f));
        View f4 = qb0.mo2852f();
        f4.setClipToOutline(true);
        f4.setElevation(f2);
        mo24523h(qb0, f3);
    }

    /* renamed from: g */
    public void mo24522g(qb0 qb0, ColorStateList colorStateList) {
        mo24531p(qb0).mo28437f(colorStateList);
    }

    /* renamed from: h */
    public void mo24523h(qb0 qb0, float f) {
        mo24531p(qb0).mo28438g(f, qb0.mo2849c(), qb0.mo2851e());
        mo24517b(qb0);
    }

    /* renamed from: i */
    public void mo24524i(qb0 qb0, float f) {
        mo24531p(qb0).mo28441h(f);
    }

    /* renamed from: j */
    public float mo24525j(qb0 qb0) {
        return mo24526k(qb0) * 2.0f;
    }

    /* renamed from: k */
    public float mo24526k(qb0 qb0) {
        return mo24531p(qb0).mo28434d();
    }

    /* renamed from: l */
    public ColorStateList mo24527l(qb0 qb0) {
        return mo24531p(qb0).mo28432b();
    }

    /* renamed from: m */
    public void mo24528m(qb0 qb0, float f) {
        qb0.mo2852f().setElevation(f);
    }

    /* renamed from: n */
    public float mo24529n(qb0 qb0) {
        return mo24531p(qb0).mo28433c();
    }

    /* renamed from: o */
    public void mo24530o() {
    }

    /* renamed from: p */
    public final zh5 mo24531p(qb0 qb0) {
        return (zh5) qb0.mo2850d();
    }
}
