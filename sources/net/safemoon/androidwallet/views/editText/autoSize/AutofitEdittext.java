package net.safemoon.androidwallet.views.editText.autoSize;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import net.safemoon.androidwallet.views.editText.autoSize.C8951a;

public class AutofitEdittext extends AppCompatEditText implements C8951a.C8954c {

    /* renamed from: r */
    public C8951a f43288r;

    /* renamed from: s */
    public C8950a f43289s;

    /* renamed from: net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext$a */
    public interface C8950a {
        /* renamed from: a */
        void mo50598a(boolean z);
    }

    public AutofitEdittext(Context context) {
        super(context);
        mo62168e(context, (AttributeSet) null, 0);
    }

    /* renamed from: b */
    public void mo62166b(float f, float f2) {
    }

    /* renamed from: d */
    public void mo62167d(C8950a aVar) {
        this.f43289s = aVar;
    }

    /* renamed from: e */
    public final void mo62168e(Context context, AttributeSet attributeSet, int i) {
        this.f43288r = C8951a.m69600f(this, attributeSet, i).mo62186b(this);
    }

    public C8951a getAutofitHelper() {
        return this.f43288r;
    }

    public float getMaxTextSize() {
        return this.f43288r.mo62188j();
    }

    public float getMinTextSize() {
        return this.f43288r.mo62189k();
    }

    public float getPrecision() {
        return this.f43288r.mo62190l();
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C8950a aVar = this.f43289s;
        if (aVar != null) {
            aVar.mo50598a(z);
        }
    }

    public void setLines(int i) {
        super.setLines(i);
        C8951a aVar = this.f43288r;
        if (aVar != null) {
            aVar.mo62193o(i);
        }
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        C8951a aVar = this.f43288r;
        if (aVar != null) {
            aVar.mo62193o(i);
        }
    }

    public void setMaxTextSize(float f) {
        this.f43288r.mo62194p(f);
    }

    public void setMinTextSize(int i) {
        this.f43288r.mo62196r(2, (float) i);
    }

    public void setPrecision(float f) {
        this.f43288r.mo62197s(f);
    }

    public void setSizeToFit() {
        setSizeToFit(true);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C8951a aVar = this.f43288r;
        if (aVar != null) {
            aVar.mo62201w(i, f);
        }
    }

    public void setMaxTextSize(int i, float f) {
        this.f43288r.mo62195q(i, f);
    }

    public void setMinTextSize(int i, float f) {
        this.f43288r.mo62196r(i, f);
    }

    public void setSizeToFit(boolean z) {
        this.f43288r.mo62192n(z);
    }

    public AutofitEdittext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62168e(context, attributeSet, 0);
    }

    public AutofitEdittext(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo62168e(context, attributeSet, i);
    }
}
