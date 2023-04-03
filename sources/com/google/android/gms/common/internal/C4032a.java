package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4033b;

/* renamed from: com.google.android.gms.common.internal.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4032a extends C4033b.C4034a {
    /* renamed from: r1 */
    public static Account m33719r1(C4033b bVar) {
        Account account = null;
        if (bVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = bVar.zzb();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
