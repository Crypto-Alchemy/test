package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B7\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0012¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u001a"}, mo44877d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lr37;", "configureTlsExtensions", "afterHandshake", "getSelectedProtocol", "Ljava/lang/reflect/Method;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Companion", "AlpnProvider", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    @Metadata(mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, mo44877d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", "", "", "(Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "unsupported", "", "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            vx2.m53591g(list, "protocols");
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            boolean z;
            vx2.m53591g(obj, "proxy");
            vx2.m53591g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (vx2.m53586b(name, "supports") && vx2.m53586b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!vx2.m53586b(name, "unsupported") || !vx2.m53586b(Void.TYPE, returnType)) {
                if (vx2.m53586b(name, "protocols")) {
                    if (objArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return this.protocols;
                    }
                }
                if ((vx2.m53586b(name, "selectProtocol") || vx2.m53586b(name, "select")) && vx2.m53586b(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    int i2 = i + 1;
                                    Object obj3 = list.get(i);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (this.protocols.contains(str)) {
                                            this.selected = str;
                                            return str;
                                        } else if (i == size) {
                                            break;
                                        } else {
                                            i = i2;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = this.protocols.get(0);
                            this.selected = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!vx2.m53586b(name, "protocolSelected") && !vx2.m53586b(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.selected = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.unsupported = true;
            return null;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, mo44877d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                vx2.m53590f(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls2 = Class.forName(vx2.m53598n("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, (ClassLoader) null);
                Class<?> cls3 = Class.forName(vx2.m53598n("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, (ClassLoader) null);
                Class<?> cls4 = Class.forName(vx2.m53598n("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, (ClassLoader) null);
                Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
                Method method2 = cls.getMethod("get", new Class[]{SSLSocket.class});
                Method method3 = cls.getMethod("remove", new Class[]{SSLSocket.class});
                vx2.m53590f(method, "putMethod");
                vx2.m53590f(method2, "getMethod");
                vx2.m53590f(method3, "removeMethod");
                vx2.m53590f(cls3, "clientProviderClass");
                vx2.m53590f(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        vx2.m53591g(method, "putMethod");
        vx2.m53591g(method2, "getMethod");
        vx2.m53591g(method3, "removeMethod");
        vx2.m53591g(cls, "clientProviderClass");
        vx2.m53591g(cls2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        try {
            this.removeMethod.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        vx2.m53591g(sSLSocket, "sslSocket");
        vx2.m53591g(list, "protocols");
        List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(alpnProtocolNames));
            this.putMethod.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        vx2.m53591g(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
                if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                    Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (alpnProvider.getUnsupported()) {
                    return null;
                } else {
                    return alpnProvider.getSelected();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
