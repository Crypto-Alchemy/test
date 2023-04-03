package info.hoang8f.android.segmented;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import info.hoang8f.android.segmented.utils.BootstrapText;
import info.hoang8f.android.segmented.utils.C5976a;

public class AwesomeRadioButton extends AppCompatRadioButton {

    /* renamed from: k */
    public BootstrapText f29962k;

    public AwesomeRadioButton(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo43663a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z55.AwesomeRadioButton);
        try {
            String string = obtainStyledAttributes.getString(z55.AwesomeRadioButton_awesome_text);
            if (string != null) {
                setMarkdownText(string);
            }
            mo43664b();
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo43664b() {
        BootstrapText bootstrapText = this.f29962k;
        if (bootstrapText != null) {
            setText(bootstrapText);
        }
    }

    public BootstrapText getBootstrapText() {
        return this.f29962k;
    }

    public void setBootstrapText(BootstrapText bootstrapText) {
        this.f29962k = bootstrapText;
        mo43664b();
    }

    public void setMarkdownText(String str) {
        setBootstrapText(C5976a.m45829b(getContext(), str + " ", isInEditMode()));
    }

    public AwesomeRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo43663a(attributeSet);
    }

    public AwesomeRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo43663a(attributeSet);
    }
}
