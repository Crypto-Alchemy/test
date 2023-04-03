package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* compiled from: YearGridAdapter */
public class C4291e extends RecyclerView.Adapter<C4293b> {

    /* renamed from: a */
    public final MaterialCalendar<?> f23837a;

    /* renamed from: com.google.android.material.datepicker.e$a */
    /* compiled from: YearGridAdapter */
    public class C4292a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f23838a;

        public C4292a(int i) {
            this.f23838a = i;
        }

        public void onClick(View view) {
            C4291e.this.f23837a.mo32536A(C4291e.this.f23837a.mo32542s().mo32484e(Month.m35271d(this.f23838a, C4291e.this.f23837a.mo32544u().f23765d)));
            C4291e.this.f23837a.mo32537B(MaterialCalendar.CalendarSelector.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$b */
    /* compiled from: YearGridAdapter */
    public static class C4293b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final TextView f23840a;

        public C4293b(TextView textView) {
            super(textView);
            this.f23840a = textView;
        }
    }

    public C4291e(MaterialCalendar<?> materialCalendar) {
        this.f23837a = materialCalendar;
    }

    /* renamed from: b */
    public final View.OnClickListener mo32644b(int i) {
        return new C4292a(i);
    }

    /* renamed from: c */
    public int mo32645c(int i) {
        return i - this.f23837a.mo32542s().mo32491j().f23766e;
    }

    /* renamed from: d */
    public int mo32646d(int i) {
        return this.f23837a.mo32542s().mo32491j().f23766e + i;
    }

    /* renamed from: e */
    public void onBindViewHolder(C4293b bVar, int i) {
        i90 i90;
        int d = mo32646d(i);
        String string = bVar.f23840a.getContext().getString(y45.mtrl_picker_navigate_to_year_description);
        bVar.f23840a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(d)}));
        bVar.f23840a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(d)}));
        j90 t = this.f23837a.mo32543t();
        Calendar o = d67.m43373o();
        if (o.get(1) == d) {
            i90 = t.f30254f;
        } else {
            i90 = t.f30252d;
        }
        for (Long longValue : this.f23837a.mo32545v().mo32516c1()) {
            o.setTimeInMillis(longValue.longValue());
            if (o.get(1) == d) {
                i90 = t.f30253e;
            }
        }
        i90.mo43521d(bVar.f23840a);
        bVar.f23840a.setOnClickListener(mo32644b(d));
    }

    /* renamed from: f */
    public C4293b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4293b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c45.mtrl_calendar_year, viewGroup, false));
    }

    public int getItemCount() {
        return this.f23837a.mo32542s().mo32492k();
    }
}
