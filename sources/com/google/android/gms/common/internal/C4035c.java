package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4035c extends g48 implements C4033b {
    public C4035c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() throws RemoteException {
        Parcel E0 = mo42748E0(2, mo42750q1());
        Account account = (Account) yd8.m54720a(E0, Account.CREATOR);
        E0.recycle();
        return account;
    }
}
