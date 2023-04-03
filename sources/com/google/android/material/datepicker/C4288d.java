package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: com.google.android.material.datepicker.d */
/* compiled from: MonthsPagerAdapter */
public class C4288d extends RecyclerView.Adapter<C4290b> {

    /* renamed from: a */
    public final Context f23828a;

    /* renamed from: d */
    public final CalendarConstraints f23829d;

    /* renamed from: e */
    public final DateSelector<?> f23830e;

    /* renamed from: g */
    public final MaterialCalendar.C4271k f23831g;

    /* renamed from: k */
    public final int f23832k;

    /* renamed from: com.google.android.material.datepicker.d$a */
    /* compiled from: MonthsPagerAdapter */
    public class C4289a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ MaterialCalendarGridView f23833a;

        public C4289a(MaterialCalendarGridView materialCalendarGridView) {
            this.f23833a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f23833a.getAdapter().mo32637n(i)) {
                C4288d.this.f23831g.mo32549a(this.f23833a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.d$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C4290b extends RecyclerView.C1231a0 {

        /* renamed from: a */
        public final TextView f23835a;

        /* renamed from: b */
        public final MaterialCalendarGridView f23836b;

        public C4290b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(g35.month_title);
            this.f23835a = textView;
            ga7.m17787q0(textView, true);
            this.f23836b = (MaterialCalendarGridView) linearLayout.findViewById(g35.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C4288d(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.C4271k kVar) {
        int i;
        Month j = calendarConstraints.mo32491j();
        Month g = calendarConstraints.mo32487g();
        Month i2 = calendarConstraints.mo32490i();
        if (j.compareTo(i2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (i2.compareTo(g) <= 0) {
            int w = C4287c.f23822r * MaterialCalendar.m35247w(context);
            if (C4282b.m35340N(context)) {
                i = MaterialCalendar.m35247w(context);
            } else {
                i = 0;
            }
            this.f23828a = context;
            this.f23832k = w + i;
            this.f23829d = calendarConstraints;
            this.f23830e = dateSelector;
            this.f23831g = kVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* renamed from: b */
    public Month mo32638b(int i) {
        return this.f23829d.mo32491j().mo32574o(i);
    }

    /* renamed from: c */
    public CharSequence mo32639c(int i) {
        return mo32638b(i).mo32572l(this.f23828a);
    }

    /* renamed from: d */
    public int mo32640d(Month month) {
        return this.f23829d.mo32491j().mo32575p(month);
    }

    /* renamed from: e */
    public void onBindViewHolder(C4290b bVar, int i) {
        Month o = this.f23829d.mo32491j().mo32574o(i);
        bVar.f23835a.setText(o.mo32572l(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f23836b.findViewById(g35.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o.equals(materialCalendarGridView.getAdapter().f23823a)) {
            C4287c cVar = new C4287c(o, this.f23830e, this.f23829d);
            materialCalendarGridView.setNumColumns(o.f23767g);
            materialCalendarGridView.setAdapter((ListAdapter) cVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo32636m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C4289a(materialCalendarGridView));
    }

    /* renamed from: f */
    public C4290b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(c45.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C4282b.m35340N(viewGroup.getContext())) {
            return new C4290b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f23832k));
        return new C4290b(linearLayout, true);
    }

    public int getItemCount() {
        return this.f23829d.mo32488h();
    }

    public long getItemId(int i) {
        return this.f23829d.mo32491j().mo32574o(i).mo32573m();
    }
}
