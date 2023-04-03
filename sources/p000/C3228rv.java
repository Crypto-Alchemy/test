package p000;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001d"}, mo44877d2 = {"Lrv;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "Lr37;", "g", "a", "type", "h", "", "", "hints", "f", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", "d", "b", "c", "e", "", "i", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rv */
/* compiled from: AndroidAutofill.android.kt */
public final class C3228rv {

    /* renamed from: a */
    public static final C3228rv f17375a = new C3228rv();

    /* renamed from: a */
    public final AutofillId mo25543a(ViewStructure viewStructure) {
        vx2.m53591g(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    /* renamed from: b */
    public final boolean mo25544b(AutofillValue autofillValue) {
        vx2.m53591g(autofillValue, "value");
        return autofillValue.isDate();
    }

    /* renamed from: c */
    public final boolean mo25545c(AutofillValue autofillValue) {
        vx2.m53591g(autofillValue, "value");
        return autofillValue.isList();
    }

    /* renamed from: d */
    public final boolean mo25546d(AutofillValue autofillValue) {
        vx2.m53591g(autofillValue, "value");
        return autofillValue.isText();
    }

    /* renamed from: e */
    public final boolean mo25547e(AutofillValue autofillValue) {
        vx2.m53591g(autofillValue, "value");
        return autofillValue.isToggle();
    }

    /* renamed from: f */
    public final void mo25548f(ViewStructure viewStructure, String[] strArr) {
        vx2.m53591g(viewStructure, "structure");
        vx2.m53591g(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    /* renamed from: g */
    public final void mo25549g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        vx2.m53591g(viewStructure, "structure");
        vx2.m53591g(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i);
    }

    /* renamed from: h */
    public final void mo25550h(ViewStructure viewStructure, int i) {
        vx2.m53591g(viewStructure, "structure");
        viewStructure.setAutofillType(i);
    }

    /* renamed from: i */
    public final CharSequence mo25551i(AutofillValue autofillValue) {
        vx2.m53591g(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        vx2.m53590f(textValue, "value.textValue");
        return textValue;
    }
}
