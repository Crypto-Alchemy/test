package p000;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lfh;", "Llv;", "Landroid/view/View;", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "view", "Luv;", "b", "Luv;", "()Luv;", "autofillTree", "Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "<init>", "(Landroid/view/View;Luv;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: fh */
/* compiled from: AndroidAutofill.android.kt */
public final class C2292fh implements C2790lv {

    /* renamed from: a */
    public final View f11834a;

    /* renamed from: b */
    public final C3436uv f11835b;

    /* renamed from: c */
    public final AutofillManager f11836c;

    public C2292fh(View view, C3436uv uvVar) {
        vx2.m53591g(view, "view");
        vx2.m53591g(uvVar, "autofillTree");
        this.f11834a = view;
        this.f11835b = uvVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f11836c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    /* renamed from: a */
    public final AutofillManager mo19912a() {
        return this.f11836c;
    }

    /* renamed from: b */
    public final C3436uv mo19913b() {
        return this.f11835b;
    }

    /* renamed from: c */
    public final View mo19914c() {
        return this.f11834a;
    }
}
