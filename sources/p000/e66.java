package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e66 */
/* compiled from: SpannableBuilder */
public final class e66 extends SpannableStringBuilder {

    /* renamed from: a */
    public final Class<?> f11077a;

    /* renamed from: d */
    public final List<C2212a> f11078d = new ArrayList();

    /* renamed from: e66$a */
    /* compiled from: SpannableBuilder */
    public static class C2212a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f11079a;

        /* renamed from: d */
        public final AtomicInteger f11080d = new AtomicInteger(0);

        public C2212a(Object obj) {
            this.f11079a = obj;
        }

        /* renamed from: a */
        public final void mo19194a() {
            this.f11080d.incrementAndGet();
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f11079a).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean mo19196b(Object obj) {
            return obj instanceof io1;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f11079a).beforeTextChanged(charSequence, i, i2, i3);
        }

        /* renamed from: c */
        public final void mo19198c() {
            this.f11080d.decrementAndGet();
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f11080d.get() <= 0 || !mo19196b(obj)) {
                ((SpanWatcher) this.f11079a).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            if (this.f11080d.get() <= 0 || !mo19196b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i7 = 0;
                    } else {
                        i7 = i;
                    }
                    if (i3 > i4) {
                        i6 = i7;
                        i5 = 0;
                    } else {
                        i5 = i3;
                        i6 = i7;
                    }
                } else {
                    i6 = i;
                    i5 = i3;
                }
                ((SpanWatcher) this.f11079a).onSpanChanged(spannable, obj, i6, i2, i5, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f11080d.get() <= 0 || !mo19196b(obj)) {
                ((SpanWatcher) this.f11079a).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f11079a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public e66(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        gu4.m18429g(cls, "watcherClass cannot be null");
        this.f11077a = cls;
    }

    /* renamed from: c */
    public static e66 m15954c(Class<?> cls, CharSequence charSequence) {
        return new e66(cls, charSequence);
    }

    /* renamed from: a */
    public void mo19169a() {
        mo19174b();
    }

    /* renamed from: b */
    public final void mo19174b() {
        for (int i = 0; i < this.f11078d.size(); i++) {
            this.f11078d.get(i).mo19194a();
        }
    }

    /* renamed from: d */
    public void mo19175d() {
        mo19185i();
        mo19177e();
    }

    /* renamed from: e */
    public final void mo19177e() {
        for (int i = 0; i < this.f11078d.size(); i++) {
            this.f11078d.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final C2212a mo19178f(Object obj) {
        for (int i = 0; i < this.f11078d.size(); i++) {
            C2212a aVar = this.f11078d.get(i);
            if (aVar.f11079a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean mo19179g(Class<?> cls) {
        if (this.f11077a == cls) {
            return true;
        }
        return false;
    }

    public int getSpanEnd(Object obj) {
        C2212a f;
        if (mo19184h(obj) && (f = mo19178f(obj)) != null) {
            obj = f;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        C2212a f;
        if (mo19184h(obj) && (f = mo19178f(obj)) != null) {
            obj = f;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        C2212a f;
        if (mo19184h(obj) && (f = mo19178f(obj)) != null) {
            obj = f;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!mo19179g(cls)) {
            return super.getSpans(i, i2, cls);
        }
        C2212a[] aVarArr = (C2212a[]) super.getSpans(i, i2, C2212a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].f11079a;
        }
        return tArr;
    }

    /* renamed from: h */
    public final boolean mo19184h(Object obj) {
        if (obj == null || !mo19179g(obj.getClass())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo19185i() {
        for (int i = 0; i < this.f11078d.size(); i++) {
            this.f11078d.get(i).mo19198c();
        }
    }

    public int nextSpanTransition(int i, int i2, Class<C2212a> cls) {
        if (cls == null || mo19179g(cls)) {
            cls = C2212a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        C2212a aVar;
        if (mo19184h(obj)) {
            aVar = mo19178f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f11078d.remove(aVar);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (mo19184h(obj)) {
            C2212a aVar = new C2212a(obj);
            this.f11078d.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new e66(this.f11077a, this, i, i2);
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        mo19174b();
        super.replace(i, i2, charSequence);
        mo19185i();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public e66(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        gu4.m18429g(cls, "watcherClass cannot be null");
        this.f11077a = cls;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        mo19174b();
        super.replace(i, i2, charSequence, i3, i4);
        mo19185i();
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
