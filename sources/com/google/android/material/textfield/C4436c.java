package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: PasswordToggleEndIconDelegate */
public class C4436c extends wp1 {

    /* renamed from: d */
    public final TextWatcher f24587d = new C4437a();

    /* renamed from: e */
    public final TextInputLayout.C4410f f24588e = new C4438b();

    /* renamed from: f */
    public final TextInputLayout.C4411g f24589f = new C4439c();

    /* renamed from: com.google.android.material.textfield.c$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    public class C4437a extends so6 {
        public C4437a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4436c cVar = C4436c.this;
            cVar.f35407c.setChecked(!cVar.mo34031g());
        }
    }

    /* renamed from: com.google.android.material.textfield.c$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    public class C4438b implements TextInputLayout.C4410f {
        public C4438b() {
        }

        /* renamed from: a */
        public void mo33991a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C4436c cVar = C4436c.this;
            cVar.f35407c.setChecked(!cVar.mo34031g());
            editText.removeTextChangedListener(C4436c.this.f24587d);
            editText.addTextChangedListener(C4436c.this.f24587d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    public class C4439c implements TextInputLayout.C4411g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* compiled from: PasswordToggleEndIconDelegate */
        public class C4440a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ EditText f24593a;

            public C4440a(EditText editText) {
                this.f24593a = editText;
            }

            public void run() {
                this.f24593a.removeTextChangedListener(C4436c.this.f24587d);
            }
        }

        public C4439c() {
        }

        /* renamed from: a */
        public void mo33992a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C4440a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.c$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    public class C4441d implements View.OnClickListener {
        public C4441d() {
        }

        public void onClick(View view) {
            EditText editText = C4436c.this.f35405a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C4436c.this.mo34031g()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C4436c.this.f35405a.mo33784V();
            }
        }
    }

    public C4436c(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: h */
    public static boolean m36237h(EditText editText) {
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo33993a() {
        this.f35405a.setEndIconDrawable(C2554in.m19714b(this.f35406b, s25.design_password_eye));
        TextInputLayout textInputLayout = this.f35405a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(y45.password_toggle_content_description));
        this.f35405a.setEndIconOnClickListener(new C4441d());
        this.f35405a.mo33795e(this.f24588e);
        this.f35405a.mo33797f(this.f24589f);
        EditText editText = this.f35405a.getEditText();
        if (m36237h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: g */
    public final boolean mo34031g() {
        EditText editText = this.f35405a.getEditText();
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }
}
