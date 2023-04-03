package p000;

import com.google.android.gms.internal.vision.C4095b0;
import com.google.android.gms.internal.vision.zzii;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: t09 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class t09<T extends C4095b0> {

    /* renamed from: a */
    public static final Logger f34081a = Logger.getLogger(zzii.class.getName());

    /* renamed from: b */
    public static String f34082b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static <T extends C4095b0> T m52040b(Class<T> cls) {
        String str;
        String str2;
        Class<t09> cls2 = t09.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C4095b0.class)) {
            str = f34082b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C4095b0) cls.cast(((t09) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo47956a());
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
                    arrayList.add(cls.cast(((t09) it.next()).mo47956a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f34081a;
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
                return (C4095b0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C4095b0) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
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
    public abstract T mo47956a();
}
