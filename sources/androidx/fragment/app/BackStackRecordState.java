package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.C0684j;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0612a();

    /* renamed from: A */
    public final int f3592A;

    /* renamed from: B */
    public final CharSequence f3593B;

    /* renamed from: C */
    public final ArrayList<String> f3594C;

    /* renamed from: H */
    public final ArrayList<String> f3595H;

    /* renamed from: I */
    public final boolean f3596I;

    /* renamed from: a */
    public final int[] f3597a;

    /* renamed from: d */
    public final ArrayList<String> f3598d;

    /* renamed from: e */
    public final int[] f3599e;

    /* renamed from: g */
    public final int[] f3600g;

    /* renamed from: k */
    public final int f3601k;

    /* renamed from: r */
    public final String f3602r;

    /* renamed from: s */
    public final int f3603s;

    /* renamed from: x */
    public final int f3604x;

    /* renamed from: y */
    public final CharSequence f3605y;

    /* renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C0612a implements Parcelable.Creator<BackStackRecordState> {
        /* renamed from: a */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* renamed from: b */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(C0655a aVar) {
        int size = aVar.f3858c.size();
        this.f3597a = new int[(size * 6)];
        if (aVar.f3864i) {
            this.f3598d = new ArrayList<>(size);
            this.f3599e = new int[size];
            this.f3600g = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0684j.C0685a aVar2 = aVar.f3858c.get(i);
                int i3 = i2 + 1;
                this.f3597a[i2] = aVar2.f3875a;
                ArrayList<String> arrayList = this.f3598d;
                Fragment fragment = aVar2.f3876b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f3597a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3877c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3878d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3879e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f3880f;
                iArr[i7] = aVar2.f3881g;
                this.f3599e[i] = aVar2.f3882h.ordinal();
                this.f3600g[i] = aVar2.f3883i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f3601k = aVar.f3863h;
            this.f3602r = aVar.f3866k;
            this.f3603s = aVar.f3776v;
            this.f3604x = aVar.f3867l;
            this.f3605y = aVar.f3868m;
            this.f3592A = aVar.f3869n;
            this.f3593B = aVar.f3870o;
            this.f3594C = aVar.f3871p;
            this.f3595H = aVar.f3872q;
            this.f3596I = aVar.f3873r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public final void mo5670a(C0655a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.f3597a.length) {
                C0684j.C0685a aVar2 = new C0684j.C0685a();
                int i3 = i + 1;
                aVar2.f3875a = this.f3597a[i];
                if (FragmentManager.m4630K0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Instantiate ");
                    sb.append(aVar);
                    sb.append(" op #");
                    sb.append(i2);
                    sb.append(" base fragment #");
                    sb.append(this.f3597a[i3]);
                }
                aVar2.f3882h = Lifecycle.State.values()[this.f3599e[i2]];
                aVar2.f3883i = Lifecycle.State.values()[this.f3600g[i2]];
                int[] iArr = this.f3597a;
                int i4 = i3 + 1;
                if (iArr[i3] == 0) {
                    z = false;
                }
                aVar2.f3877c = z;
                int i5 = i4 + 1;
                int i6 = iArr[i4];
                aVar2.f3878d = i6;
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                aVar2.f3879e = i8;
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                aVar2.f3880f = i10;
                int i11 = iArr[i9];
                aVar2.f3881g = i11;
                aVar.f3859d = i6;
                aVar.f3860e = i8;
                aVar.f3861f = i10;
                aVar.f3862g = i11;
                aVar.mo6265f(aVar2);
                i2++;
                i = i9 + 1;
            } else {
                aVar.f3863h = this.f3601k;
                aVar.f3866k = this.f3602r;
                aVar.f3864i = true;
                aVar.f3867l = this.f3604x;
                aVar.f3868m = this.f3605y;
                aVar.f3869n = this.f3592A;
                aVar.f3870o = this.f3593B;
                aVar.f3871p = this.f3594C;
                aVar.f3872q = this.f3595H;
                aVar.f3873r = this.f3596I;
                return;
            }
        }
    }

    /* renamed from: b */
    public C0655a mo5671b(FragmentManager fragmentManager) {
        C0655a aVar = new C0655a(fragmentManager);
        mo5670a(aVar);
        aVar.f3776v = this.f3603s;
        for (int i = 0; i < this.f3598d.size(); i++) {
            String str = this.f3598d.get(i);
            if (str != null) {
                aVar.f3858c.get(i).f3876b = fragmentManager.mo5975i0(str);
            }
        }
        aVar.mo6150y(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3597a);
        parcel.writeStringList(this.f3598d);
        parcel.writeIntArray(this.f3599e);
        parcel.writeIntArray(this.f3600g);
        parcel.writeInt(this.f3601k);
        parcel.writeString(this.f3602r);
        parcel.writeInt(this.f3603s);
        parcel.writeInt(this.f3604x);
        TextUtils.writeToParcel(this.f3605y, parcel, 0);
        parcel.writeInt(this.f3592A);
        TextUtils.writeToParcel(this.f3593B, parcel, 0);
        parcel.writeStringList(this.f3594C);
        parcel.writeStringList(this.f3595H);
        parcel.writeInt(this.f3596I ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f3597a = parcel.createIntArray();
        this.f3598d = parcel.createStringArrayList();
        this.f3599e = parcel.createIntArray();
        this.f3600g = parcel.createIntArray();
        this.f3601k = parcel.readInt();
        this.f3602r = parcel.readString();
        this.f3603s = parcel.readInt();
        this.f3604x = parcel.readInt();
        this.f3605y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3592A = parcel.readInt();
        this.f3593B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3594C = parcel.createStringArrayList();
        this.f3595H = parcel.createStringArrayList();
        this.f3596I = parcel.readInt() != 0;
    }
}
