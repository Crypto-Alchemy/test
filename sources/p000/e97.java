package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* renamed from: e97 */
/* compiled from: VersionedParcelParcel */
public class e97 extends d97 {

    /* renamed from: d */
    public final SparseIntArray f11095d;

    /* renamed from: e */
    public final Parcel f11096e;

    /* renamed from: f */
    public final int f11097f;

    /* renamed from: g */
    public final int f11098g;

    /* renamed from: h */
    public final String f11099h;

    /* renamed from: i */
    public int f11100i;

    /* renamed from: j */
    public int f11101j;

    /* renamed from: k */
    public int f11102k;

    public e97(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2781lq(), new C2781lq(), new C2781lq());
    }

    /* renamed from: A */
    public void mo18595A(byte[] bArr) {
        if (bArr != null) {
            this.f11096e.writeInt(bArr.length);
            this.f11096e.writeByteArray(bArr);
            return;
        }
        this.f11096e.writeInt(-1);
    }

    /* renamed from: C */
    public void mo18597C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f11096e, 0);
    }

    /* renamed from: E */
    public void mo18599E(int i) {
        this.f11096e.writeInt(i);
    }

    /* renamed from: G */
    public void mo18601G(Parcelable parcelable) {
        this.f11096e.writeParcelable(parcelable, 0);
    }

    /* renamed from: I */
    public void mo18603I(String str) {
        this.f11096e.writeString(str);
    }

    /* renamed from: a */
    public void mo18609a() {
        int i = this.f11100i;
        if (i >= 0) {
            int i2 = this.f11095d.get(i);
            int dataPosition = this.f11096e.dataPosition();
            this.f11096e.setDataPosition(i2);
            this.f11096e.writeInt(dataPosition - i2);
            this.f11096e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: b */
    public d97 mo18610b() {
        Parcel parcel = this.f11096e;
        int dataPosition = parcel.dataPosition();
        int i = this.f11101j;
        if (i == this.f11097f) {
            i = this.f11098g;
        }
        int i2 = i;
        return new e97(parcel, dataPosition, i2, this.f11099h + "  ", this.f10578a, this.f10579b, this.f10580c);
    }

    /* renamed from: g */
    public boolean mo18615g() {
        if (this.f11096e.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public byte[] mo18617i() {
        int readInt = this.f11096e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f11096e.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: k */
    public CharSequence mo18619k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f11096e);
    }

    /* renamed from: m */
    public boolean mo18621m(int i) {
        while (this.f11101j < this.f11098g) {
            int i2 = this.f11102k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f11096e.setDataPosition(this.f11101j);
            int readInt = this.f11096e.readInt();
            this.f11102k = this.f11096e.readInt();
            this.f11101j += readInt;
        }
        if (this.f11102k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public int mo18623o() {
        return this.f11096e.readInt();
    }

    /* renamed from: q */
    public <T extends Parcelable> T mo18625q() {
        return this.f11096e.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: s */
    public String mo18627s() {
        return this.f11096e.readString();
    }

    /* renamed from: w */
    public void mo18631w(int i) {
        mo18609a();
        this.f11100i = i;
        this.f11095d.put(i, this.f11096e.dataPosition());
        mo18599E(0);
        mo18599E(i);
    }

    /* renamed from: y */
    public void mo18633y(boolean z) {
        this.f11096e.writeInt(z ? 1 : 0);
    }

    public e97(Parcel parcel, int i, int i2, String str, C2781lq<String, Method> lqVar, C2781lq<String, Method> lqVar2, C2781lq<String, Class> lqVar3) {
        super(lqVar, lqVar2, lqVar3);
        this.f11095d = new SparseIntArray();
        this.f11100i = -1;
        this.f11102k = -1;
        this.f11096e = parcel;
        this.f11097f = i;
        this.f11098g = i2;
        this.f11101j = i;
        this.f11099h = str;
    }
}
