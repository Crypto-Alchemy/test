package net.safemoon.androidwallet.views;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.C6169a;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0019\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0019\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, mo44877d2 = {"Lnet/safemoon/androidwallet/views/MyTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lr37;", "setUpDefaultView", "Landroid/text/Editable;", "addressEditable", "M0", "Landroid/content/ClipboardManager;", "A2", "Lef3;", "getManager", "()Landroid/content/ClipboardManager;", "manager", "Landroid/view/View;", "B2", "getCustomEnd", "()Landroid/view/View;", "customEnd", "Lie7;", "C2", "getBinding", "()Lie7;", "binding", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: MyTextInputLayout.kt */
public final class MyTextInputLayout extends TextInputLayout {

    /* renamed from: A2 */
    public final ef3 f43251A2 = C6169a.m47232a(new MyTextInputLayout$manager$2(this));

    /* renamed from: B2 */
    public final ef3 f43252B2 = C6169a.m47232a(new MyTextInputLayout$customEnd$2(this));

    /* renamed from: C2 */
    public final ef3 f43253C2 = C6169a.m47232a(new MyTextInputLayout$binding$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo44877d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lr37;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.views.MyTextInputLayout$a */
    /* compiled from: TextView.kt */
    public static final class C8944a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ MyTextInputLayout f43254a;

        public C8944a(MyTextInputLayout myTextInputLayout) {
            this.f43254a = myTextInputLayout;
        }

        public void afterTextChanged(Editable editable) {
            this.f43254a.mo62130M0(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTextInputLayout(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }

    /* renamed from: K0 */
    public static final void m69566K0(MyTextInputLayout myTextInputLayout, View view) {
        Editable editable;
        vx2.m53591g(myTextInputLayout, "this$0");
        ClipData primaryClip = myTextInputLayout.getManager().getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getText() != null) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            MaterialButton materialButton = myTextInputLayout.getBinding().f29913b;
            vx2.m53590f(materialButton, "binding.btnClear");
            materialButton.setVisibility(0);
            EditText editText = myTextInputLayout.getEditText();
            if (editText != null) {
                editText.setText(itemAt.getText());
            }
            EditText editText2 = myTextInputLayout.getEditText();
            if (editText2 != null) {
                editable = editText2.getText();
            } else {
                editable = null;
            }
            myTextInputLayout.mo62130M0(editable);
        }
    }

    /* renamed from: L0 */
    public static final void m69567L0(MyTextInputLayout myTextInputLayout, View view) {
        vx2.m53591g(myTextInputLayout, "this$0");
        EditText editText = myTextInputLayout.getEditText();
        if (editText != null) {
            editText.setText("");
        }
    }

    private final ie7 getBinding() {
        return (ie7) this.f43253C2.getValue();
    }

    /* access modifiers changed from: private */
    public final View getCustomEnd() {
        Object value = this.f43252B2.getValue();
        vx2.m53590f(value, "<get-customEnd>(...)");
        return (View) value;
    }

    private final ClipboardManager getManager() {
        return (ClipboardManager) this.f43251A2.getValue();
    }

    /* renamed from: M0 */
    public final void mo62130M0(Editable editable) {
        boolean z;
        int i;
        MaterialButton materialButton;
        if (editable != null) {
            if (editable.toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            getBinding().f29913b.setVisibility(ol0.m70368k0(z));
            MaterialButton materialButton2 = getBinding().f29914c;
            vx2.m53590f(materialButton2, "binding.btnPaste");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            materialButton2.setVisibility(i);
            EditText editText = getEditText();
            if (editText != null) {
                int paddingTop = editText.getPaddingTop();
                if (z) {
                    materialButton = getBinding().f29914c;
                } else {
                    materialButton = getBinding().f29913b;
                }
                editText.setPadding(0, paddingTop, materialButton.getWidth(), editText.getPaddingBottom());
                editText.requestLayout();
            }
        }
    }

    public final void setUpDefaultView() {
        Editable text;
        boolean z;
        int i = 0;
        try {
            View childAt = getChildAt(0);
            vx2.m53589e(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            View childAt2 = ((FrameLayout) childAt).getChildAt(2);
            vx2.m53589e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) childAt2;
            linearLayout.addView(getCustomEnd());
            getBinding().f29914c.setOnClickListener(new c14(this));
            getBinding().f29913b.setOnClickListener(new d14(this));
            linearLayout.bringToFront();
        } catch (Exception unused) {
        }
        EditText editText = getEditText();
        if (!(editText == null || (text = editText.getText()) == null)) {
            MaterialButton materialButton = getBinding().f29913b;
            boolean z2 = true;
            if (text.toString().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            materialButton.setVisibility(ol0.m70368k0(z));
            MaterialButton materialButton2 = getBinding().f29914c;
            vx2.m53590f(materialButton2, "binding.btnPaste");
            if (text.toString().length() != 0) {
                z2 = false;
            }
            if (!z2) {
                i = 8;
            }
            materialButton2.setVisibility(i);
        }
        EditText editText2 = getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new C8944a(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        vx2.m53591g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vx2.m53591g(context, "context");
    }
}
