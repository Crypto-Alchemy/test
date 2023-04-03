package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0184j;

public class ListMenuItemView extends LinearLayout implements C0184j.C0185a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    public Drawable f684A;

    /* renamed from: B */
    public int f685B;

    /* renamed from: C */
    public Context f686C;

    /* renamed from: H */
    public boolean f687H;

    /* renamed from: I */
    public Drawable f688I;

    /* renamed from: L */
    public boolean f689L;

    /* renamed from: M */
    public LayoutInflater f690M;

    /* renamed from: P */
    public boolean f691P;

    /* renamed from: a */
    public C0177g f692a;

    /* renamed from: d */
    public ImageView f693d;

    /* renamed from: e */
    public RadioButton f694e;

    /* renamed from: g */
    public TextView f695g;

    /* renamed from: k */
    public CheckBox f696k;

    /* renamed from: r */
    public TextView f697r;

    /* renamed from: s */
    public ImageView f698s;

    /* renamed from: x */
    public ImageView f699x;

    /* renamed from: y */
    public LinearLayout f700y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f690M == null) {
            this.f690M = LayoutInflater.from(getContext());
        }
        return this.f690M;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f698s;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo1289a(View view) {
        mo1291b(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f699x;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f699x.getLayoutParams();
            rect.top += this.f699x.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final void mo1291b(View view, int i) {
        LinearLayout linearLayout = this.f700y;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    public void mo1260c(C0177g gVar, int i) {
        int i2;
        this.f692a = gVar;
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(gVar.mo1494i(this));
        setCheckable(gVar.isCheckable());
        setShortcut(gVar.mo1463A(), gVar.mo1472g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    /* renamed from: d */
    public boolean mo1261d() {
        return false;
    }

    /* renamed from: e */
    public final void mo1292e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(i45.abc_list_menu_item_checkbox, this, false);
        this.f696k = checkBox;
        mo1289a(checkBox);
    }

    /* renamed from: f */
    public final void mo1293f() {
        ImageView imageView = (ImageView) getInflater().inflate(i45.abc_list_menu_item_icon, this, false);
        this.f693d = imageView;
        mo1291b(imageView, 0);
    }

    /* renamed from: g */
    public final void mo1294g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i45.abc_list_menu_item_radio, this, false);
        this.f694e = radioButton;
        mo1289a(radioButton);
    }

    public C0177g getItemData() {
        return this.f692a;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        ga7.m17793t0(this, this.f684A);
        TextView textView = (TextView) findViewById(j35.title);
        this.f695g = textView;
        int i = this.f685B;
        if (i != -1) {
            textView.setTextAppearance(this.f686C, i);
        }
        this.f697r = (TextView) findViewById(j35.shortcut);
        ImageView imageView = (ImageView) findViewById(j35.submenuarrow);
        this.f698s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f688I);
        }
        this.f699x = (ImageView) findViewById(j35.group_divider);
        this.f700y = (LinearLayout) findViewById(j35.content);
    }

    public void onMeasure(int i, int i2) {
        if (this.f693d != null && this.f687H) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f693d.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f694e != null || this.f696k != null) {
            if (this.f692a.mo1503m()) {
                if (this.f694e == null) {
                    mo1294g();
                }
                compoundButton = this.f694e;
                view = this.f696k;
            } else {
                if (this.f696k == null) {
                    mo1292e();
                }
                compoundButton = this.f696k;
                view = this.f694e;
            }
            if (z) {
                compoundButton.setChecked(this.f692a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f696k;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f694e;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f692a.mo1503m()) {
            if (this.f694e == null) {
                mo1294g();
            }
            compoundButton = this.f694e;
        } else {
            if (this.f696k == null) {
                mo1292e();
            }
            compoundButton = this.f696k;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f691P = z;
        this.f687H = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f699x;
        if (imageView != null) {
            if (this.f689L || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f692a.mo1544z() || this.f691P) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f687H) {
            ImageView imageView = this.f693d;
            if (imageView != null || drawable != null || this.f687H) {
                if (imageView == null) {
                    mo1293f();
                }
                if (drawable != null || this.f687H) {
                    ImageView imageView2 = this.f693d;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f693d.getVisibility() != 0) {
                        this.f693d.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f693d.setVisibility(8);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i;
        if (!z || !this.f692a.mo1463A()) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f697r.setText(this.f692a.mo1492h());
        }
        if (this.f697r.getVisibility() != i) {
            this.f697r.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f695g.setText(charSequence);
            if (this.f695g.getVisibility() != 0) {
                this.f695g.setVisibility(0);
            }
        } else if (this.f695g.getVisibility() != 8) {
            this.f695g.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        yq6 v = yq6.m30733v(getContext(), attributeSet, j65.MenuView, i, 0);
        this.f684A = v.mo28181g(j65.MenuView_android_itemBackground);
        this.f685B = v.mo28188n(j65.MenuView_android_itemTextAppearance, -1);
        this.f687H = v.mo28175a(j65.MenuView_preserveIconSpacing, false);
        this.f686C = context;
        this.f688I = v.mo28181g(j65.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, m15.dropDownListViewStyle, 0);
        this.f689L = obtainStyledAttributes.hasValue(0);
        v.mo28194w();
        obtainStyledAttributes.recycle();
    }
}
