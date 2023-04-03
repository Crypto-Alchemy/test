package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzaa;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzkq;
import com.google.android.gms.measurement.internal.zzp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ul8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ul8 extends kc8 implements am8 {
    public ul8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: A */
    public final List<zzkq> mo29008A(String str, String str2, boolean z, zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49855b(q1, z);
        pc8.m49857d(q1, zzp);
        Parcel E0 = mo44743E0(14, q1);
        ArrayList<zzkq> createTypedArrayList = E0.createTypedArrayList(zzkq.CREATOR);
        E0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: B */
    public final List<zzaa> mo29009B(String str, String str2, String str3) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString((String) null);
        q1.writeString(str2);
        q1.writeString(str3);
        Parcel E0 = mo44743E0(17, q1);
        ArrayList<zzaa> createTypedArrayList = E0.createTypedArrayList(zzaa.CREATOR);
        E0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: D0 */
    public final void mo29010D0(zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzp);
        mo44746r1(18, q1);
    }

    /* renamed from: F0 */
    public final void mo29012F0(Bundle bundle, zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, bundle);
        pc8.m49857d(q1, zzp);
        mo44746r1(19, q1);
    }

    /* renamed from: H0 */
    public final byte[] mo29014H0(zzas zzas, String str) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzas);
        q1.writeString(str);
        Parcel E0 = mo44743E0(9, q1);
        byte[] createByteArray = E0.createByteArray();
        E0.recycle();
        return createByteArray;
    }

    /* renamed from: T */
    public final void mo29015T(zzkq zzkq, zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzkq);
        pc8.m49857d(q1, zzp);
        mo44746r1(2, q1);
    }

    /* renamed from: V0 */
    public final void mo29016V0(zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzp);
        mo44746r1(6, q1);
    }

    /* renamed from: c0 */
    public final void mo29017c0(zzas zzas, zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzas);
        pc8.m49857d(q1, zzp);
        mo44746r1(1, q1);
    }

    /* renamed from: d */
    public final List<zzaa> mo29018d(String str, String str2, zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49857d(q1, zzp);
        Parcel E0 = mo44743E0(16, q1);
        ArrayList<zzaa> createTypedArrayList = E0.createTypedArrayList(zzaa.CREATOR);
        E0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: f0 */
    public final List<zzkq> mo29019f0(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString((String) null);
        q1.writeString(str2);
        q1.writeString(str3);
        pc8.m49855b(q1, z);
        Parcel E0 = mo44743E0(15, q1);
        ArrayList<zzkq> createTypedArrayList = E0.createTypedArrayList(zzkq.CREATOR);
        E0.recycle();
        return createTypedArrayList;
    }

    /* renamed from: g1 */
    public final void mo29020g1(zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzp);
        mo44746r1(4, q1);
    }

    /* renamed from: i */
    public final String mo29021i(zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzp);
        Parcel E0 = mo44743E0(11, q1);
        String readString = E0.readString();
        E0.recycle();
        return readString;
    }

    /* renamed from: l0 */
    public final void mo29022l0(zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzp);
        mo44746r1(20, q1);
    }

    /* renamed from: v */
    public final void mo29023v(zzaa zzaa, zzp zzp) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, zzaa);
        pc8.m49857d(q1, zzp);
        mo44746r1(12, q1);
    }

    /* renamed from: v0 */
    public final void mo29024v0(long j, String str, String str2, String str3) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeLong(j);
        q1.writeString(str);
        q1.writeString(str2);
        q1.writeString(str3);
        mo44746r1(10, q1);
    }
}
