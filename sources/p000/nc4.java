package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lnc4;", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "Lr37;", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "Landroid/widget/EditText;", "a", "Landroid/widget/EditText;", "getEtAmount", "()Landroid/widget/EditText;", "etAmount", "<init>", "(Landroid/widget/EditText;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: nc4 */
/* compiled from: NumberTextWatcherForThousand.kt */
public class nc4 implements TextWatcher {

    /* renamed from: a */
    public final EditText f41153a;

    public nc4(EditText editText) {
        vx2.m53591g(editText, "etAmount");
        this.f41153a = editText;
    }

    public void afterTextChanged(Editable editable) {
        vx2.m53591g(editable, "s");
        int selectionEnd = this.f41153a.getSelectionEnd();
        String obj = this.f41153a.getText().toString();
        try {
            this.f41153a.removeTextChangedListener(this);
            String obj2 = this.f41153a.getText().toString();
            if (!vx2.m53586b(obj2, "")) {
                String v = ol0.m70380v(this.f41153a.getText().toString());
                if (!vx2.m53586b(obj2, "")) {
                    this.f41153a.setText(v);
                }
                this.f41153a.setSelection(selectionEnd + (this.f41153a.getText().toString().length() - obj.length()));
            }
            this.f41153a.addTextChangedListener(this);
        } catch (Exception e) {
            e.printStackTrace();
            this.f41153a.addTextChangedListener(this);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        vx2.m53591g(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        vx2.m53591g(charSequence, "s");
    }
}
