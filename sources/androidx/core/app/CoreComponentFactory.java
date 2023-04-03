package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface C0550a {
        /* renamed from: a */
        Object mo5317a();
    }

    /* renamed from: a */
    public static <T> T m4282a(T t) {
        T a;
        if (!(t instanceof C0550a) || (a = ((C0550a) t).mo5317a()) == null) {
            return t;
        }
        return a;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) m4282a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) m4282a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) m4282a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) m4282a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) m4282a(super.instantiateService(classLoader, str, intent));
    }
}
