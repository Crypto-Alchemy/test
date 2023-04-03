package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f24596a;

    /* renamed from: d */
    public final TextInputLayout f24597d;

    /* renamed from: e */
    public final EditText f24598e;

    /* renamed from: g */
    public TextWatcher f24599g;

    /* renamed from: k */
    public TextView f24600k;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C4443b extends so6 {
        public C4443b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f24596a.setText(ChipTextInputComboView.this.mo34036c("00"));
            } else {
                ChipTextInputComboView.this.f24596a.setText(ChipTextInputComboView.this.mo34036c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final String mo34036c(CharSequence charSequence) {
        return TimeModel.m36288a(getResources(), charSequence);
    }

    /* renamed from: d */
    public final void mo34037d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f24598e.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f24596a.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo34037d();
    }

    public void setChecked(boolean z) {
        int i;
        this.f24596a.setChecked(z);
        EditText editText = this.f24598e;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f24596a;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            this.f24598e.requestFocus();
            if (!TextUtils.isEmpty(this.f24598e.getText())) {
                EditText editText2 = this.f24598e;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f24596a.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f24596a.setTag(i, obj);
    }

    public void toggle() {
        this.f24596a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(c45.material_time_chip, this, false);
        this.f24596a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(c45.material_time_input, this, false);
        this.f24597d = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f24598e = editText;
        editText.setVisibility(4);
        C4443b bVar = new C4443b();
        this.f24599g = bVar;
        editText.addTextChangedListener(bVar);
        mo34037d();
        addView(chip);
        addView(textInputLayout);
        this.f24600k = (TextView) findViewById(g35.material_label);
        editText.setSaveEnabled(false);
    }
}
