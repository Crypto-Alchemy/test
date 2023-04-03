package p000;

import android.os.Looper;

/* renamed from: ya8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class ya8 {

    /* renamed from: a */
    public static volatile ClassLoader f35834a;

    /* renamed from: b */
    public static volatile Thread f35835b;

    /* renamed from: a */
    public static synchronized ClassLoader m54670a() {
        ClassLoader classLoader;
        synchronized (ya8.class) {
            if (f35834a == null) {
                f35834a = m54671b();
            }
            classLoader = f35834a;
        }
        return classLoader;
    }

    /* renamed from: b */
    public static synchronized ClassLoader m54671b() {
        synchronized (ya8.class) {
            ClassLoader classLoader = null;
            if (f35835b == null) {
                f35835b = m54672c();
                if (f35835b == null) {
                    return null;
                }
            }
            synchronized (f35835b) {
                try {
                    classLoader = f35835b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get thread context classloader ");
                    sb.append(message);
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    public static synchronized Thread m54672c() {
        e58 e58;
        e58 e582;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (ya8.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            e58 = null;
                            break;
                        }
                        e58 = threadArr[i];
                        if ("GmsDynamite".equals(e58.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (e58 == null) {
                        try {
                            e582 = new e58(threadGroup, "GmsDynamite");
                            try {
                                e582.setContextClassLoader((ClassLoader) null);
                                e582.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            e582 = e58;
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to enumerate thread/threadgroup ");
                            sb.append(message);
                            e58 = e582;
                            return e58;
                        }
                        e58 = e582;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    e582 = null;
                    String message2 = e.getMessage();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to enumerate thread/threadgroup ");
                    sb2.append(message2);
                    e58 = e582;
                    return e58;
                }
            }
            return e58;
        }
    }
}
