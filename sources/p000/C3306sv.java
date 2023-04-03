package p000;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000f"}, mo44877d2 = {"Lsv;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "Landroid/view/View;", "view", "", "virtualId", "event", "Lr37;", "onAutofillEvent", "Lfh;", "autofill", "a", "b", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sv */
/* compiled from: AutofillCallback.android.kt */
public final class C3306sv extends AutofillManager.AutofillCallback {

    /* renamed from: a */
    public static final C3306sv f17810a = new C3306sv();

    /* renamed from: a */
    public final void mo25967a(C2292fh fhVar) {
        vx2.m53591g(fhVar, "autofill");
        fhVar.mo19912a().registerCallback(this);
    }

    /* renamed from: b */
    public final void mo25968b(C2292fh fhVar) {
        vx2.m53591g(fhVar, "autofill");
        fhVar.mo19912a().unregisterCallback(this);
    }

    public void onAutofillEvent(View view, int i, int i2) {
        vx2.m53591g(view, "view");
        super.onAutofillEvent(view, i, i2);
    }
}
