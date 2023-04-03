package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: MonthAdapter */
public class C4287c extends BaseAdapter {

    /* renamed from: r */
    public static final int f23822r = d67.m43375q().getMaximum(4);

    /* renamed from: a */
    public final Month f23823a;

    /* renamed from: d */
    public final DateSelector<?> f23824d;

    /* renamed from: e */
    public Collection<Long> f23825e;

    /* renamed from: g */
    public j90 f23826g;

    /* renamed from: k */
    public final CalendarConstraints f23827k;

    public C4287c(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f23823a = month;
        this.f23824d = dateSelector;
        this.f23827k = calendarConstraints;
        this.f23825e = dateSelector.mo32516c1();
    }

    /* renamed from: a */
    public int mo32619a(int i) {
        return mo32620b() + (i - 1);
    }

    /* renamed from: b */
    public int mo32620b() {
        return this.f23823a.mo32568g();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f23823a.mo32568g() || i > mo32632i()) {
            return null;
        }
        return Long.valueOf(this.f23823a.mo32569h(mo32633j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.mo32623e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p000.c45.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo32620b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.Month r8 = r5.f23823a
            int r2 = r8.f23768k
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f23823a
            long r7 = r8.mo32569h(r7)
            com.google.android.material.datepicker.Month r3 = r5.f23823a
            int r3 = r3.f23766e
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m35273f()
            int r4 = r4.f23766e
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = p000.m21.m48039g(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = p000.m21.m48044l(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.mo32634k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C4287c.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: e */
    public final void mo32623e(Context context) {
        if (this.f23826g == null) {
            this.f23826g = new j90(context);
        }
    }

    /* renamed from: f */
    public boolean mo32624f(int i) {
        if (i % this.f23823a.f23767g == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo32625g(int i) {
        if ((i + 1) % this.f23823a.f23767g == 0) {
            return true;
        }
        return false;
    }

    public int getCount() {
        return this.f23823a.f23768k + mo32620b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f23823a.f23767g);
    }

    /* renamed from: h */
    public final boolean mo32630h(long j) {
        for (Long longValue : this.f23824d.mo32516c1()) {
            if (d67.m43359a(j) == d67.m43359a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public int mo32632i() {
        return (this.f23823a.mo32568g() + this.f23823a.f23768k) - 1;
    }

    /* renamed from: j */
    public int mo32633j(int i) {
        return (i - this.f23823a.mo32568g()) + 1;
    }

    /* renamed from: k */
    public final void mo32634k(TextView textView, long j) {
        i90 i90;
        if (textView != null) {
            if (this.f23827k.mo32486f().mo32495k0(j)) {
                textView.setEnabled(true);
                if (mo32630h(j)) {
                    i90 = this.f23826g.f30250b;
                } else if (d67.m43373o().getTimeInMillis() == j) {
                    i90 = this.f23826g.f30251c;
                } else {
                    i90 = this.f23826g.f30249a;
                }
            } else {
                textView.setEnabled(false);
                i90 = this.f23826g.f30255g;
            }
            i90.mo43521d(textView);
        }
    }

    /* renamed from: l */
    public final void mo32635l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m35272e(j).equals(this.f23823a)) {
            mo32634k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo32619a(this.f23823a.mo32571i(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* renamed from: m */
    public void mo32636m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f23825e) {
            mo32635l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dateSelector = this.f23824d;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.mo32516c1()) {
                mo32635l(materialCalendarGridView, longValue2.longValue());
            }
            this.f23825e = this.f23824d.mo32516c1();
        }
    }

    /* renamed from: n */
    public boolean mo32637n(int i) {
        if (i < mo32620b() || i > mo32632i()) {
            return false;
        }
        return true;
    }
}
