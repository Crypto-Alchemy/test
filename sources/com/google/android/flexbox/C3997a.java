package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
/* compiled from: FlexLine */
public class C3997a {

    /* renamed from: a */
    public int f22015a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f22016b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f22017c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f22018d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f22019e;

    /* renamed from: f */
    public int f22020f;

    /* renamed from: g */
    public int f22021g;

    /* renamed from: h */
    public int f22022h;

    /* renamed from: i */
    public int f22023i;

    /* renamed from: j */
    public float f22024j;

    /* renamed from: k */
    public float f22025k;

    /* renamed from: l */
    public int f22026l;

    /* renamed from: m */
    public int f22027m;

    /* renamed from: n */
    public List<Integer> f22028n = new ArrayList();

    /* renamed from: o */
    public int f22029o;

    /* renamed from: p */
    public int f22030p;

    /* renamed from: q */
    public boolean f22031q;

    /* renamed from: r */
    public boolean f22032r;

    /* renamed from: a */
    public int mo30329a() {
        return this.f22021g;
    }

    /* renamed from: b */
    public int mo30330b() {
        return this.f22022h;
    }

    /* renamed from: c */
    public int mo30331c() {
        return this.f22022h - this.f22023i;
    }

    /* renamed from: d */
    public void mo30332d(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f22015a = Math.min(this.f22015a, (view.getLeft() - flexItem.mo30176Q0()) - i);
        this.f22016b = Math.min(this.f22016b, (view.getTop() - flexItem.mo30178c0()) - i2);
        this.f22017c = Math.max(this.f22017c, view.getRight() + flexItem.mo30179d1() + i3);
        this.f22018d = Math.max(this.f22018d, view.getBottom() + flexItem.mo30175P0() + i4);
    }
}
