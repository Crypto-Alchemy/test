package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0684j;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: MaterialDatePicker */
public final class C4282b<S> extends kf1 {

    /* renamed from: u1 */
    public static final Object f23798u1 = "CONFIRM_BUTTON_TAG";

    /* renamed from: v1 */
    public static final Object f23799v1 = "CANCEL_BUTTON_TAG";

    /* renamed from: w1 */
    public static final Object f23800w1 = "TOGGLE_BUTTON_TAG";

    /* renamed from: P */
    public final LinkedHashSet<so3<? super S>> f23801P = new LinkedHashSet<>();

    /* renamed from: Q */
    public final LinkedHashSet<View.OnClickListener> f23802Q = new LinkedHashSet<>();

    /* renamed from: U */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f23803U = new LinkedHashSet<>();

    /* renamed from: X */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f23804X = new LinkedHashSet<>();

    /* renamed from: Y */
    public int f23805Y;

    /* renamed from: Z */
    public DateSelector<S> f23806Z;

    /* renamed from: b1 */
    public int f23807b1;

    /* renamed from: e0 */
    public oo4<S> f23808e0;

    /* renamed from: e1 */
    public CharSequence f23809e1;

    /* renamed from: k0 */
    public CalendarConstraints f23810k0;

    /* renamed from: o1 */
    public boolean f23811o1;

    /* renamed from: p1 */
    public int f23812p1;

    /* renamed from: q1 */
    public TextView f23813q1;

    /* renamed from: r1 */
    public CheckableImageButton f23814r1;

    /* renamed from: s1 */
    public uo3 f23815s1;

    /* renamed from: t1 */
    public Button f23816t1;

    /* renamed from: v0 */
    public MaterialCalendar<S> f23817v0;

    /* renamed from: com.google.android.material.datepicker.b$a */
    /* compiled from: MaterialDatePicker */
    public class C4283a implements View.OnClickListener {
        public C4283a() {
        }

        public void onClick(View view) {
            Iterator it = C4282b.this.f23801P.iterator();
            while (it.hasNext()) {
                ((so3) it.next()).mo47846a(C4282b.this.mo32608K());
            }
            C4282b.this.mo22266k();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b */
    /* compiled from: MaterialDatePicker */
    public class C4284b implements View.OnClickListener {
        public C4284b() {
        }

        public void onClick(View view) {
            Iterator it = C4282b.this.f23802Q.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C4282b.this.mo22266k();
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$c */
    /* compiled from: MaterialDatePicker */
    public class C4285c extends sh4<S> {
        public C4285c() {
        }

        /* renamed from: a */
        public void mo32616a() {
            C4282b.this.f23816t1.setEnabled(false);
        }

        /* renamed from: b */
        public void mo32617b(S s) {
            C4282b.this.mo32612R();
            C4282b.this.f23816t1.setEnabled(C4282b.this.f23806Z.mo32515W0());
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$d */
    /* compiled from: MaterialDatePicker */
    public class C4286d implements View.OnClickListener {
        public C4286d() {
        }

        public void onClick(View view) {
            C4282b.this.f23816t1.setEnabled(C4282b.this.f23806Z.mo32515W0());
            C4282b.this.f23814r1.toggle();
            C4282b bVar = C4282b.this;
            bVar.mo32613S(bVar.f23814r1);
            C4282b.this.mo32611Q();
        }
    }

    /* renamed from: G */
    public static Drawable m35337G(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C2554in.m19714b(context, s25.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C2554in.m19714b(context, s25.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: H */
    public static int m35338H(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(k25.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(k25.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(k25.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(k25.mtrl_calendar_days_of_week_height);
        int i = C4287c.f23822r;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(k25.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(k25.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(k25.mtrl_calendar_bottom_padding);
    }

    /* renamed from: J */
    public static int m35339J(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(k25.mtrl_calendar_content_padding);
        int i = Month.m35273f().f23767g;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(k25.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(k25.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: N */
    public static boolean m35340N(Context context) {
        return m35342P(context, 16843277);
    }

    /* renamed from: O */
    public static boolean m35341O(Context context) {
        return m35342P(context, j15.nestedScrollable);
    }

    /* renamed from: P */
    public static boolean m35342P(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(oo3.m49372c(context, j15.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: I */
    public String mo32607I() {
        return this.f23806Z.mo32512A0(getContext());
    }

    /* renamed from: K */
    public final S mo32608K() {
        return this.f23806Z.mo32517f1();
    }

    /* renamed from: L */
    public final int mo32609L(Context context) {
        int i = this.f23805Y;
        if (i != 0) {
            return i;
        }
        return this.f23806Z.mo32518i0(context);
    }

    /* renamed from: M */
    public final void mo32610M(Context context) {
        boolean z;
        this.f23814r1.setTag(f23800w1);
        this.f23814r1.setImageDrawable(m35337G(context));
        CheckableImageButton checkableImageButton = this.f23814r1;
        if (this.f23812p1 != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        ga7.m17785p0(this.f23814r1, (C3715z7) null);
        mo32613S(this.f23814r1);
        this.f23814r1.setOnClickListener(new C4286d());
    }

    /* renamed from: Q */
    public final void mo32611Q() {
        oo4<S> oo4;
        int L = mo32609L(requireContext());
        this.f23817v0 = MaterialCalendar.m35248y(this.f23806Z, L, this.f23810k0);
        if (this.f23814r1.isChecked()) {
            oo4 = wo3.m53994j(this.f23806Z, L, this.f23810k0);
        } else {
            oo4 = this.f23817v0;
        }
        this.f23808e0 = oo4;
        mo32612R();
        C0684j q = getChildFragmentManager().mo5996q();
        q.mo6270s(g35.mtrl_calendar_frame, this.f23808e0);
        q.mo6141l();
        this.f23808e0.mo32539h(new C4285c());
    }

    /* renamed from: R */
    public final void mo32612R() {
        String I = mo32607I();
        this.f23813q1.setContentDescription(String.format(getString(y45.mtrl_picker_announce_current_selection), new Object[]{I}));
        this.f23813q1.setText(I);
    }

    /* renamed from: S */
    public final void mo32613S(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f23814r1.isChecked()) {
            str = checkableImageButton.getContext().getString(y45.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(y45.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f23814r1.setContentDescription(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f23803U.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f23805Y = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f23806Z = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f23810k0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f23807b1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f23809e1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f23812p1 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f23811o1) {
            i = c45.mtrl_picker_fullscreen;
        } else {
            i = c45.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f23811o1) {
            inflate.findViewById(g35.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m35339J(context), -2));
        } else {
            View findViewById = inflate.findViewById(g35.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(g35.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m35339J(context), -1));
            findViewById2.setMinimumHeight(m35338H(requireContext()));
        }
        TextView textView = (TextView) inflate.findViewById(g35.mtrl_picker_header_selection_text);
        this.f23813q1 = textView;
        ga7.m17789r0(textView, 1);
        this.f23814r1 = (CheckableImageButton) inflate.findViewById(g35.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(g35.mtrl_picker_title_text);
        CharSequence charSequence = this.f23809e1;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f23807b1);
        }
        mo32610M(context);
        this.f23816t1 = (Button) inflate.findViewById(g35.confirm_button);
        if (this.f23806Z.mo32515W0()) {
            this.f23816t1.setEnabled(true);
        } else {
            this.f23816t1.setEnabled(false);
        }
        this.f23816t1.setTag(f23798u1);
        this.f23816t1.setOnClickListener(new C4283a());
        Button button = (Button) inflate.findViewById(g35.cancel_button);
        button.setTag(f23799v1);
        button.setOnClickListener(new C4284b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f23804X.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f23805Y);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f23806Z);
        CalendarConstraints.C4254b bVar = new CalendarConstraints.C4254b(this.f23810k0);
        if (this.f23817v0.mo32544u() != null) {
            bVar.mo32501b(this.f23817v0.mo32544u().f23769r);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo32500a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f23807b1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f23809e1);
    }

    public void onStart() {
        super.onStart();
        Window window = mo22277t().getWindow();
        if (this.f23811o1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f23815s1);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(k25.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f23815s1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new pv2(mo22277t(), rect));
        }
        mo32611Q();
    }

    public void onStop() {
        this.f23808e0.mo46444i();
        super.onStop();
    }

    /* renamed from: p */
    public final Dialog mo22273p(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), mo32609L(requireContext()));
        Context context = dialog.getContext();
        this.f23811o1 = m35340N(context);
        int c = oo3.m49372c(context, j15.colorSurface, C4282b.class.getCanonicalName());
        uo3 uo3 = new uo3(context, (AttributeSet) null, j15.materialCalendarStyle, e55.Widget_MaterialComponents_MaterialCalendar);
        this.f23815s1 = uo3;
        uo3.mo48430P(context);
        this.f23815s1.mo48440a0(ColorStateList.valueOf(c));
        this.f23815s1.mo48439Z(ga7.m17798w(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
