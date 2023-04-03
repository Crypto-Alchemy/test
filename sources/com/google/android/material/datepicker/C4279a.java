package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: DateFormatTextWatcher */
public abstract class C4279a extends so6 {

    /* renamed from: a */
    public final TextInputLayout f23788a;

    /* renamed from: d */
    public final DateFormat f23789d;

    /* renamed from: e */
    public final CalendarConstraints f23790e;

    /* renamed from: g */
    public final String f23791g;

    /* renamed from: k */
    public final Runnable f23792k;

    /* renamed from: r */
    public Runnable f23793r;

    /* renamed from: com.google.android.material.datepicker.a$a */
    /* compiled from: DateFormatTextWatcher */
    public class C4280a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23794a;

        public C4280a(String str) {
            this.f23794a = str;
        }

        public void run() {
            TextInputLayout a = C4279a.this.f23788a;
            DateFormat b = C4279a.this.f23789d;
            Context context = a.getContext();
            String string = context.getString(y45.mtrl_picker_invalid_format);
            String format = String.format(context.getString(y45.mtrl_picker_invalid_format_use), new Object[]{this.f23794a});
            String format2 = String.format(context.getString(y45.mtrl_picker_invalid_format_example), new Object[]{b.format(new Date(d67.m43373o().getTimeInMillis()))});
            a.setError(string + "\n" + format + "\n" + format2);
            C4279a.this.mo32588e();
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    /* compiled from: DateFormatTextWatcher */
    public class C4281b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ long f23796a;

        public C4281b(long j) {
            this.f23796a = j;
        }

        public void run() {
            C4279a.this.f23788a.setError(String.format(C4279a.this.f23791g, new Object[]{m21.m48035c(this.f23796a)}));
            C4279a.this.mo32588e();
        }
    }

    public C4279a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f23789d = dateFormat;
        this.f23788a = textInputLayout;
        this.f23790e = calendarConstraints;
        this.f23791g = textInputLayout.getContext().getString(y45.mtrl_picker_out_of_range);
        this.f23792k = new C4280a(str);
    }

    /* renamed from: d */
    public final Runnable mo32602d(long j) {
        return new C4281b(j);
    }

    /* renamed from: e */
    public abstract void mo32588e();

    /* renamed from: f */
    public abstract void mo32589f(Long l);

    /* renamed from: g */
    public void mo32603g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f23788a.removeCallbacks(this.f23792k);
        this.f23788a.removeCallbacks(this.f23793r);
        this.f23788a.setError((CharSequence) null);
        mo32589f((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f23789d.parse(charSequence.toString());
                this.f23788a.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f23790e.mo32486f().mo32495k0(time) || !this.f23790e.mo32493l(time)) {
                    Runnable d = mo32602d(time);
                    this.f23793r = d;
                    mo32603g(this.f23788a, d);
                    return;
                }
                mo32589f(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                mo32603g(this.f23788a, this.f23792k);
            }
        }
    }
}
