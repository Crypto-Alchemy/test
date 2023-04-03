package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0184j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements C0184j.C0185a, View.OnClickListener, ActionMenuView.C0204a {

    /* renamed from: A */
    public int f669A;

    /* renamed from: B */
    public int f670B;

    /* renamed from: a */
    public C0177g f671a;

    /* renamed from: d */
    public CharSequence f672d;

    /* renamed from: e */
    public Drawable f673e;

    /* renamed from: g */
    public C0173e.C0175b f674g;

    /* renamed from: k */
    public k82 f675k;

    /* renamed from: r */
    public C0162b f676r;

    /* renamed from: s */
    public boolean f677s;

    /* renamed from: x */
    public boolean f678x;

    /* renamed from: y */
    public int f679y;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0161a extends k82 {
        public C0161a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public w06 mo1281b() {
            C0162b bVar = ActionMenuItemView.this.f676r;
            if (bVar != null) {
                return bVar.mo1283a();
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo1282c() {
            w06 b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0173e.C0175b bVar = actionMenuItemView.f674g;
            if (bVar == null || !bVar.mo1285b(actionMenuItemView.f671a) || (b = mo1281b()) == null || !b.mo1328a()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0162b {
        /* renamed from: a */
        public abstract w06 mo1283a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo1258a() {
        return mo1262e();
    }

    /* renamed from: b */
    public boolean mo1259b() {
        if (!mo1262e() || this.f671a.getIcon() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo1260c(C0177g gVar, int i) {
        int i2;
        this.f671a = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.mo1494i(this));
        setId(gVar.getItemId());
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f675k == null) {
            this.f675k = new C0161a();
        }
    }

    /* renamed from: d */
    public boolean mo1261d() {
        return true;
    }

    /* renamed from: e */
    public boolean mo1262e() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: f */
    public final boolean mo1263f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo1264g() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f672d);
        if (this.f673e != null && (!this.f671a.mo1464B() || (!this.f677s && !this.f678x))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f672d;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f671a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f671a.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f671a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f671a.getTitle();
            }
            xr6.m30294a(this, charSequence3);
            return;
        }
        xr6.m30294a(this, tooltipText);
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0177g getItemData() {
        return this.f671a;
    }

    public void onClick(View view) {
        C0173e.C0175b bVar = this.f674g;
        if (bVar != null) {
            bVar.mo1285b(this.f671a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f677s = mo1263f();
        mo1264g();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean e = mo1262e();
        if (e && (i4 = this.f669A) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f679y);
        } else {
            i3 = this.f679y;
        }
        if (mode != 1073741824 && this.f679y > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!e && this.f673e != null) {
            super.setPadding((getMeasuredWidth() - this.f673e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        k82 k82;
        if (!this.f671a.hasSubMenu() || (k82 = this.f675k) == null || !k82.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f678x != z) {
            this.f678x = z;
            C0177g gVar = this.f671a;
            if (gVar != null) {
                gVar.mo1467c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f673e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f670B;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        mo1264g();
    }

    public void setItemInvoker(C0173e.C0175b bVar) {
        this.f674g = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f669A = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0162b bVar) {
        this.f676r = bVar;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f672d = charSequence;
        mo1264g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f677s = mo1263f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.ActionMenuItemView, i, 0);
        this.f679y = obtainStyledAttributes.getDimensionPixelSize(j65.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f670B = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f669A = -1;
        setSaveEnabled(false);
    }
}
