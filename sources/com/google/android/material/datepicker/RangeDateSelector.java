package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class RangeDateSelector implements DateSelector<jl4<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C4276c();

    /* renamed from: a */
    public String f23771a;

    /* renamed from: d */
    public final String f23772d = " ";

    /* renamed from: e */
    public Long f23773e = null;

    /* renamed from: g */
    public Long f23774g = null;

    /* renamed from: k */
    public Long f23775k = null;

    /* renamed from: r */
    public Long f23776r = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    public class C4274a extends C4279a {

        /* renamed from: s */
        public final /* synthetic */ TextInputLayout f23778s;

        /* renamed from: x */
        public final /* synthetic */ TextInputLayout f23779x;

        /* renamed from: y */
        public final /* synthetic */ sh4 f23780y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4274a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, sh4 sh4) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f23778s = textInputLayout2;
            this.f23779x = textInputLayout3;
            this.f23780y = sh4;
        }

        /* renamed from: e */
        public void mo32588e() {
            Long unused = RangeDateSelector.this.f23775k = null;
            RangeDateSelector.this.mo32586j(this.f23778s, this.f23779x, this.f23780y);
        }

        /* renamed from: f */
        public void mo32589f(Long l) {
            Long unused = RangeDateSelector.this.f23775k = l;
            RangeDateSelector.this.mo32586j(this.f23778s, this.f23779x, this.f23780y);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    public class C4275b extends C4279a {

        /* renamed from: s */
        public final /* synthetic */ TextInputLayout f23782s;

        /* renamed from: x */
        public final /* synthetic */ TextInputLayout f23783x;

        /* renamed from: y */
        public final /* synthetic */ sh4 f23784y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4275b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, sh4 sh4) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f23782s = textInputLayout2;
            this.f23783x = textInputLayout3;
            this.f23784y = sh4;
        }

        /* renamed from: e */
        public void mo32588e() {
            Long unused = RangeDateSelector.this.f23776r = null;
            RangeDateSelector.this.mo32586j(this.f23782s, this.f23783x, this.f23784y);
        }

        /* renamed from: f */
        public void mo32589f(Long l) {
            Long unused = RangeDateSelector.this.f23776r = l;
            RangeDateSelector.this.mo32586j(this.f23782s, this.f23783x, this.f23784y);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    public static class C4276c implements Parcelable.Creator<RangeDateSelector> {
        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.f23773e = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.f23774g = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    /* renamed from: A0 */
    public String mo32512A0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f23773e;
        if (l == null && this.f23774g == null) {
            return resources.getString(y45.mtrl_picker_range_header_unselected);
        }
        Long l2 = this.f23774g;
        if (l2 == null) {
            return resources.getString(y45.mtrl_picker_range_header_only_start_selected, new Object[]{m21.m48035c(l.longValue())});
        } else if (l == null) {
            return resources.getString(y45.mtrl_picker_range_header_only_end_selected, new Object[]{m21.m48035c(l2.longValue())});
        } else {
            jl4<String, String> a = m21.m48033a(l, l2);
            return resources.getString(y45.mtrl_picker_range_header_selected, new Object[]{a.f13688a, a.f13689b});
        }
    }

    /* renamed from: B0 */
    public Collection<jl4<Long, Long>> mo32513B0() {
        if (this.f23773e == null || this.f23774g == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jl4(this.f23773e, this.f23774g));
        return arrayList;
    }

    /* renamed from: J */
    public View mo32514J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, sh4<jl4<Long, Long>> sh4) {
        View inflate = layoutInflater.inflate(c45.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(g35.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(g35.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ln3.m47861a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f23771a = inflate.getResources().getString(y45.mtrl_picker_invalid_range);
        SimpleDateFormat k = d67.m43369k();
        Long l = this.f23773e;
        if (l != null) {
            editText.setText(k.format(l));
            this.f23775k = this.f23773e;
        }
        Long l2 = this.f23774g;
        if (l2 != null) {
            editText2.setText(k.format(l2));
            this.f23776r = this.f23774g;
        }
        String l3 = d67.m43370l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l3);
        textInputLayout2.setPlaceholderText(l3);
        SimpleDateFormat simpleDateFormat = k;
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        TextInputLayout textInputLayout3 = textInputLayout;
        C4274a aVar = r0;
        TextInputLayout textInputLayout4 = textInputLayout2;
        String str = l3;
        sh4<jl4<Long, Long>> sh42 = sh4;
        C4274a aVar2 = new C4274a(l3, simpleDateFormat, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, sh42);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(new C4275b(str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, sh42));
        pe7.m49905k(editText);
        return inflate;
    }

    /* renamed from: W0 */
    public boolean mo32515W0() {
        Long l = this.f23773e;
        if (l == null || this.f23774g == null || !mo32584h(l.longValue(), this.f23774g.longValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: c1 */
    public Collection<Long> mo32516c1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f23773e;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f23774g;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo32582f(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f23771a.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    /* renamed from: g */
    public jl4<Long, Long> mo32517f1() {
        return new jl4<>(this.f23773e, this.f23774g);
    }

    /* renamed from: h */
    public final boolean mo32584h(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: i */
    public final void mo32585i(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f23771a);
        textInputLayout2.setError(" ");
    }

    /* renamed from: i0 */
    public int mo32518i0(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(k25.mtrl_calendar_maximum_default_fullscreen_minor_axis)) {
            i = j15.materialCalendarTheme;
        } else {
            i = j15.materialCalendarFullscreenTheme;
        }
        return oo3.m49372c(context, i, C4282b.class.getCanonicalName());
    }

    /* renamed from: j */
    public final void mo32586j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, sh4<jl4<Long, Long>> sh4) {
        Long l = this.f23775k;
        if (l == null || this.f23776r == null) {
            mo32582f(textInputLayout, textInputLayout2);
            sh4.mo32616a();
        } else if (mo32584h(l.longValue(), this.f23776r.longValue())) {
            this.f23773e = this.f23775k;
            this.f23774g = this.f23776r;
            sh4.mo32617b(mo32517f1());
        } else {
            mo32585i(textInputLayout, textInputLayout2);
            sh4.mo32616a();
        }
    }

    /* renamed from: l1 */
    public void mo32519l1(long j) {
        Long l = this.f23773e;
        if (l == null) {
            this.f23773e = Long.valueOf(j);
        } else if (this.f23774g != null || !mo32584h(l.longValue(), j)) {
            this.f23774g = null;
            this.f23773e = Long.valueOf(j);
        } else {
            this.f23774g = Long.valueOf(j);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f23773e);
        parcel.writeValue(this.f23774g);
    }
}
