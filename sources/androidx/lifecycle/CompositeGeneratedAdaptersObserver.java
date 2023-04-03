package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

class CompositeGeneratedAdaptersObserver implements C0715e {

    /* renamed from: a */
    public final C0713c[] f3894a;

    public CompositeGeneratedAdaptersObserver(C0713c[] cVarArr) {
        this.f3894a = cVarArr;
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        mv3 mv3 = new mv3();
        for (C0713c a : this.f3894a) {
            a.mo6384a(ug3, event, false, mv3);
        }
        for (C0713c a2 : this.f3894a) {
            a2.mo6384a(ug3, event, true, mv3);
        }
    }
}
