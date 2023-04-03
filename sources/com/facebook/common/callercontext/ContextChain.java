package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;

public class ContextChain implements Parcelable {
    public static final Parcelable.Creator<ContextChain> CREATOR = new C1926a();

    /* renamed from: r */
    public static boolean f9475r = false;

    /* renamed from: a */
    public final String f9476a;

    /* renamed from: d */
    public final String f9477d;

    /* renamed from: e */
    public final int f9478e;

    /* renamed from: g */
    public final ContextChain f9479g;

    /* renamed from: k */
    public String f9480k;

    /* renamed from: com.facebook.common.callercontext.ContextChain$a */
    public static class C1926a implements Parcelable.Creator<ContextChain> {
        /* renamed from: a */
        public ContextChain createFromParcel(Parcel parcel) {
            return new ContextChain(parcel);
        }

        /* renamed from: b */
        public ContextChain[] newArray(int i) {
            return new ContextChain[i];
        }
    }

    public ContextChain(Parcel parcel) {
        this.f9476a = parcel.readString();
        this.f9477d = parcel.readString();
        this.f9478e = parcel.readInt();
        this.f9479g = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!f9475r) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContextChain contextChain = (ContextChain) obj;
        if (hf4.m18860a(this.f9476a, contextChain.f9476a) && hf4.m18860a(this.f9477d, contextChain.f9477d) && this.f9478e == contextChain.f9478e) {
            ContextChain contextChain2 = this.f9479g;
            ContextChain contextChain3 = contextChain.f9479g;
            if (contextChain2 == contextChain3) {
                return true;
            }
            if (contextChain2 != null && contextChain2.equals(contextChain3)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        if (!f9475r) {
            return super.hashCode();
        }
        int hashCode = super.hashCode() * 31;
        String str = this.f9476a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.f9477d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (((i4 + i2) * 31) + this.f9478e) * 31;
        ContextChain contextChain = this.f9479g;
        if (contextChain != null) {
            i3 = contextChain.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        if (this.f9480k == null) {
            this.f9480k = this.f9476a + ":" + this.f9477d;
            if (this.f9479g != null) {
                this.f9480k = this.f9479g.toString() + '/' + this.f9480k;
            }
        }
        return this.f9480k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9476a);
        parcel.writeString(this.f9477d);
        parcel.writeInt(this.f9478e);
        parcel.writeParcelable(this.f9479g, i);
    }
}
