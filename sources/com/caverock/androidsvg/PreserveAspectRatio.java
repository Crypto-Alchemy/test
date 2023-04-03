package com.caverock.androidsvg;

public class PreserveAspectRatio {

    /* renamed from: c */
    public static final PreserveAspectRatio f9064c = new PreserveAspectRatio((Alignment) null, (Scale) null);

    /* renamed from: d */
    public static final PreserveAspectRatio f9065d = new PreserveAspectRatio(Alignment.none, (Scale) null);

    /* renamed from: e */
    public static final PreserveAspectRatio f9066e;

    /* renamed from: f */
    public static final PreserveAspectRatio f9067f;

    /* renamed from: g */
    public static final PreserveAspectRatio f9068g;

    /* renamed from: h */
    public static final PreserveAspectRatio f9069h;

    /* renamed from: i */
    public static final PreserveAspectRatio f9070i;

    /* renamed from: j */
    public static final PreserveAspectRatio f9071j;

    /* renamed from: k */
    public static final PreserveAspectRatio f9072k;

    /* renamed from: a */
    public Alignment f9073a;

    /* renamed from: b */
    public Scale f9074b;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        f9066e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f9067f = new PreserveAspectRatio(alignment2, scale);
        f9068g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        f9069h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        f9070i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        f9071j = new PreserveAspectRatio(alignment, scale2);
        f9072k = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f9073a = alignment;
        this.f9074b = scale;
    }

    /* renamed from: a */
    public Alignment mo12742a() {
        return this.f9073a;
    }

    /* renamed from: b */
    public Scale mo12743b() {
        return this.f9074b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        if (this.f9073a == preserveAspectRatio.f9073a && this.f9074b == preserveAspectRatio.f9074b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f9073a + " " + this.f9074b;
    }
}
