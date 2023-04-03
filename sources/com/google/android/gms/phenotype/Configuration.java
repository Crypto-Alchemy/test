package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    public static final Parcelable.Creator<Configuration> CREATOR = new ee8();

    /* renamed from: a */
    public final int f23107a;

    /* renamed from: d */
    public final zzi[] f23108d;

    /* renamed from: e */
    public final String[] f23109e;

    /* renamed from: g */
    public final Map<String, zzi> f23110g = new TreeMap();

    public Configuration(int i, zzi[] zziArr, String[] strArr) {
        this.f23107a = i;
        this.f23108d = zziArr;
        for (zzi zzi : zziArr) {
            this.f23110g.put(zzi.f23126a, zzi);
        }
        this.f23109e = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return this.f23107a - ((Configuration) obj).f23107a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.f23107a == configuration.f23107a && eb9.m43890a(this.f23110g, configuration.f23110g) && Arrays.equals(this.f23109e, configuration.f23109e);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f23107a);
        sb.append(", ");
        sb.append("(");
        for (zzi append : this.f23110g.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        String[] strArr = this.f23109e;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 2, this.f23107a);
        rk5.m51146v(parcel, 3, this.f23108d, i, false);
        rk5.m51144t(parcel, 4, this.f23109e, false);
        rk5.m51126b(parcel, a);
    }
}
