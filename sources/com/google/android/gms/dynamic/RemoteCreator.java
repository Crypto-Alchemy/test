package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class RemoteCreator<T> {

    /* renamed from: a */
    public final String f22418a;

    /* renamed from: b */
    public Object f22419b;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RemoteCreator(String str) {
        this.f22418a = str;
    }

    /* renamed from: a */
    public abstract T mo30741a(IBinder iBinder);

    /* renamed from: b */
    public final T mo30742b(Context context) throws RemoteCreatorException {
        if (this.f22419b == null) {
            cu4.m43221k(context);
            Context d = mi2.m48309d(context);
            if (d != null) {
                try {
                    this.f22419b = mo30741a((IBinder) d.getClassLoader().loadClass(this.f22418a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f22419b;
    }
}
