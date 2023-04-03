package p000;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: n50 */
/* compiled from: BuiltInsResourceLoader.kt */
public final class n50 {
    /* renamed from: a */
    public final InputStream mo56354a(String str) {
        vx2.m53591g(str, "path");
        ClassLoader classLoader = n50.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
