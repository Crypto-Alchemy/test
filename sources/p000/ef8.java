package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;

/* renamed from: ef8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public interface ef8 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(lf8 lf8) throws RemoteException;

    void getAppInstanceId(lf8 lf8) throws RemoteException;

    void getCachedAppInstanceId(lf8 lf8) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, lf8 lf8) throws RemoteException;

    void getCurrentScreenClass(lf8 lf8) throws RemoteException;

    void getCurrentScreenName(lf8 lf8) throws RemoteException;

    void getGmpAppId(lf8 lf8) throws RemoteException;

    void getMaxUserProperties(String str, lf8 lf8) throws RemoteException;

    void getTestFlag(lf8 lf8, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, lf8 lf8) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(ro2 ro2, zzcl zzcl, long j) throws RemoteException;

    void isDataCollectionEnabled(lf8 lf8) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, lf8 lf8, long j) throws RemoteException;

    void logHealthData(int i, String str, ro2 ro2, ro2 ro22, ro2 ro23) throws RemoteException;

    void onActivityCreated(ro2 ro2, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(ro2 ro2, long j) throws RemoteException;

    void onActivityPaused(ro2 ro2, long j) throws RemoteException;

    void onActivityResumed(ro2 ro2, long j) throws RemoteException;

    void onActivitySaveInstanceState(ro2 ro2, lf8 lf8, long j) throws RemoteException;

    void onActivityStarted(ro2 ro2, long j) throws RemoteException;

    void onActivityStopped(ro2 ro2, long j) throws RemoteException;

    void performAction(Bundle bundle, lf8 lf8, long j) throws RemoteException;

    void registerOnMeasurementEventListener(tf8 tf8) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(ro2 ro2, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(tf8 tf8) throws RemoteException;

    void setInstanceIdProvider(zf8 zf8) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, ro2 ro2, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(tf8 tf8) throws RemoteException;
}
