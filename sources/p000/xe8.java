package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: xe8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class xe8 extends kc8 implements ef8 {
    public xe8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeLong(j);
        mo44746r1(23, q1);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49857d(q1, bundle);
        mo44746r1(9, q1);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeLong(j);
        mo44746r1(24, q1);
    }

    public final void generateEventId(lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, lf8);
        mo44746r1(22, q1);
    }

    public final void getCachedAppInstanceId(lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, lf8);
        mo44746r1(19, q1);
    }

    public final void getConditionalUserProperties(String str, String str2, lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49858e(q1, lf8);
        mo44746r1(10, q1);
    }

    public final void getCurrentScreenClass(lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, lf8);
        mo44746r1(17, q1);
    }

    public final void getCurrentScreenName(lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, lf8);
        mo44746r1(16, q1);
    }

    public final void getGmpAppId(lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, lf8);
        mo44746r1(21, q1);
    }

    public final void getMaxUserProperties(String str, lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        pc8.m49858e(q1, lf8);
        mo44746r1(6, q1);
    }

    public final void getUserProperties(String str, String str2, boolean z, lf8 lf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49855b(q1, z);
        pc8.m49858e(q1, lf8);
        mo44746r1(5, q1);
    }

    public final void initialize(ro2 ro2, zzcl zzcl, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        pc8.m49857d(q1, zzcl);
        q1.writeLong(j);
        mo44746r1(1, q1);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49857d(q1, bundle);
        pc8.m49855b(q1, z);
        pc8.m49855b(q1, z2);
        q1.writeLong(j);
        mo44746r1(2, q1);
    }

    public final void logHealthData(int i, String str, ro2 ro2, ro2 ro22, ro2 ro23) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeInt(5);
        q1.writeString(str);
        pc8.m49858e(q1, ro2);
        pc8.m49858e(q1, ro22);
        pc8.m49858e(q1, ro23);
        mo44746r1(33, q1);
    }

    public final void onActivityCreated(ro2 ro2, Bundle bundle, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        pc8.m49857d(q1, bundle);
        q1.writeLong(j);
        mo44746r1(27, q1);
    }

    public final void onActivityDestroyed(ro2 ro2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        q1.writeLong(j);
        mo44746r1(28, q1);
    }

    public final void onActivityPaused(ro2 ro2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        q1.writeLong(j);
        mo44746r1(29, q1);
    }

    public final void onActivityResumed(ro2 ro2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        q1.writeLong(j);
        mo44746r1(30, q1);
    }

    public final void onActivitySaveInstanceState(ro2 ro2, lf8 lf8, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        pc8.m49858e(q1, lf8);
        q1.writeLong(j);
        mo44746r1(31, q1);
    }

    public final void onActivityStarted(ro2 ro2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        q1.writeLong(j);
        mo44746r1(25, q1);
    }

    public final void onActivityStopped(ro2 ro2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        q1.writeLong(j);
        mo44746r1(26, q1);
    }

    public final void registerOnMeasurementEventListener(tf8 tf8) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, tf8);
        mo44746r1(35, q1);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49857d(q1, bundle);
        q1.writeLong(j);
        mo44746r1(8, q1);
    }

    public final void setCurrentScreen(ro2 ro2, String str, String str2, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49858e(q1, ro2);
        q1.writeString(str);
        q1.writeString(str2);
        q1.writeLong(j);
        mo44746r1(15, q1);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel q1 = mo44745q1();
        pc8.m49855b(q1, z);
        mo44746r1(39, q1);
    }

    public final void setUserProperty(String str, String str2, ro2 ro2, boolean z, long j) throws RemoteException {
        Parcel q1 = mo44745q1();
        q1.writeString(str);
        q1.writeString(str2);
        pc8.m49858e(q1, ro2);
        pc8.m49855b(q1, z);
        q1.writeLong(j);
        mo44746r1(4, q1);
    }
}
