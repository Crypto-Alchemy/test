package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C4278b();

    /* renamed from: a */
    public Long f23785a;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    public class C4277a extends C4279a {

        /* renamed from: s */
        public final /* synthetic */ sh4 f23786s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4277a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, sh4 sh4) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f23786s = sh4;
        }

        /* renamed from: e */
        public void mo32588e() {
            this.f23786s.mo32616a();
        }

        /* renamed from: f */
        public void mo32589f(Long l) {
            if (l == null) {
                SingleDateSelector.this.mo32594c();
            } else {
                SingleDateSelector.this.mo32519l1(l.longValue());
            }
            this.f23786s.mo32617b(SingleDateSelector.this.mo32517f1());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    public static class C4278b implements Parcelable.Creator<SingleDateSelector> {
        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.f23785a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* renamed from: A0 */
    public String mo32512A0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f23785a;
        if (l == null) {
            return resources.getString(y45.mtrl_picker_date_header_unselected);
        }
        String j = m21.m48042j(l.longValue());
        return resources.getString(y45.mtrl_picker_date_header_selected, new Object[]{j});
    }

    /* renamed from: B0 */
    public Collection<jl4<Long, Long>> mo32513B0() {
        return new ArrayList();
    }

    /* renamed from: J */
    public View mo32514J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, sh4<Long> sh4) {
        View inflate = layoutInflater.inflate(c45.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(g35.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ln3.m47861a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat k = d67.m43369k();
        String l = d67.m43370l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l);
        Long l2 = this.f23785a;
        if (l2 != null) {
            editText.setText(k.format(l2));
        }
        editText.addTextChangedListener(new C4277a(l, k, textInputLayout, calendarConstraints, sh4));
        pe7.m49905k(editText);
        return inflate;
    }

    /* renamed from: W0 */
    public boolean mo32515W0() {
        if (this.f23785a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo32594c() {
        this.f23785a = null;
    }

    /* renamed from: c1 */
    public Collection<Long> mo32516c1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f23785a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* renamed from: d */
    public Long mo32517f1() {
        return this.f23785a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i0 */
    public int mo32518i0(Context context) {
        return oo3.m49372c(context, j15.materialCalendarTheme, C4282b.class.getCanonicalName());
    }

    /* renamed from: l1 */
    public void mo32519l1(long j) {
        this.f23785a = Long.valueOf(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f23785a);
    }
}
