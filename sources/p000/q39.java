package p000;

import com.google.android.gms.internal.measurement.C4087d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.t29;

/* renamed from: q39 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class q39<T extends t29> {

    /* renamed from: a */
    public static final Logger f32914a = Logger.getLogger(C4087d.class.getName());

    /* renamed from: b */
    public static final String f32915b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static <T extends t29> T m50226b(Class<T> cls) {
        String str;
        String str2;
        Class<q39> cls2 = q39.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(t29.class)) {
            str = f32915b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (t29) cls.cast(((q39) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo46945a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((q39) it.next()).mo46945a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f32914a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    if (simpleName.length() != 0) {
                        str2 = "Unable to load ".concat(simpleName);
                    } else {
                        str2 = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (t29) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (t29) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    public abstract T mo46945a();
}
