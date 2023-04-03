package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Arrays;

/* renamed from: com.fasterxml.jackson.databind.ser.impl.a */
/* compiled from: PropertySerializerMap */
public abstract class C2040a {

    /* renamed from: a */
    public final boolean f10101a;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.a$a */
    /* compiled from: PropertySerializerMap */
    public static final class C2041a extends C2040a {

        /* renamed from: b */
        public final Class<?> f10102b;

        /* renamed from: c */
        public final Class<?> f10103c;

        /* renamed from: d */
        public final y63<Object> f10104d;

        /* renamed from: e */
        public final y63<Object> f10105e;

        public C2041a(C2040a aVar, Class<?> cls, y63<Object> y63, Class<?> cls2, y63<Object> y632) {
            super(aVar);
            this.f10102b = cls;
            this.f10104d = y63;
            this.f10103c = cls2;
            this.f10105e = y632;
        }

        /* renamed from: j */
        public C2040a mo16644j(Class<?> cls, y63<Object> y63) {
            return new C2043c(this, new C2046f[]{new C2046f(this.f10102b, this.f10104d), new C2046f(this.f10103c, this.f10105e), new C2046f(cls, y63)});
        }

        /* renamed from: k */
        public y63<Object> mo16645k(Class<?> cls) {
            if (cls == this.f10102b) {
                return this.f10104d;
            }
            if (cls == this.f10103c) {
                return this.f10105e;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.a$b */
    /* compiled from: PropertySerializerMap */
    public static final class C2042b extends C2040a {

        /* renamed from: b */
        public static final C2042b f10106b = new C2042b(false);

        /* renamed from: c */
        public static final C2042b f10107c = new C2042b(true);

        public C2042b(boolean z) {
            super(z);
        }

        /* renamed from: j */
        public C2040a mo16644j(Class<?> cls, y63<Object> y63) {
            return new C2045e(this, cls, y63);
        }

        /* renamed from: k */
        public y63<Object> mo16645k(Class<?> cls) {
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.a$c */
    /* compiled from: PropertySerializerMap */
    public static final class C2043c extends C2040a {

        /* renamed from: b */
        public final C2046f[] f10108b;

        public C2043c(C2040a aVar, C2046f[] fVarArr) {
            super(aVar);
            this.f10108b = fVarArr;
        }

        /* renamed from: j */
        public C2040a mo16644j(Class<?> cls, y63<Object> y63) {
            C2046f[] fVarArr = this.f10108b;
            int length = fVarArr.length;
            if (length != 8) {
                C2046f[] fVarArr2 = (C2046f[]) Arrays.copyOf(fVarArr, length + 1);
                fVarArr2[length] = new C2046f(cls, y63);
                return new C2043c(this, fVarArr2);
            } else if (this.f10101a) {
                return new C2045e(this, cls, y63);
            } else {
                return this;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
            r1 = r0[6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r1.f10113a != r4) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            return r1.f10114b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r1 = r0[5];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            if (r1.f10113a != r4) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
            return r1.f10114b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
            r1 = r0[4];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
            if (r1.f10113a != r4) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            return r1.f10114b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r0 = r0[3];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
            if (r0.f10113a != r4) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
            return r0.f10114b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return null;
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p000.y63<java.lang.Object> mo16645k(java.lang.Class<?> r4) {
            /*
                r3 = this;
                com.fasterxml.jackson.databind.ser.impl.a$f[] r0 = r3.f10108b
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x000c
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x000c:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x0016
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x0016:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x0020
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x0020:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L_0x004d;
                    case 5: goto L_0x0043;
                    case 6: goto L_0x0039;
                    case 7: goto L_0x002f;
                    case 8: goto L_0x0025;
                    default: goto L_0x0024;
                }
            L_0x0024:
                goto L_0x0057
            L_0x0025:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x002f
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x002f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x0039
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x0039:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x0043
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x0043:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.f10113a
                if (r2 != r4) goto L_0x004d
                y63<java.lang.Object> r4 = r1.f10114b
                return r4
            L_0x004d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.f10113a
                if (r1 != r4) goto L_0x0057
                y63<java.lang.Object> r4 = r0.f10114b
                return r4
            L_0x0057:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.C2040a.C2043c.mo16645k(java.lang.Class):y63");
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.a$d */
    /* compiled from: PropertySerializerMap */
    public static final class C2044d {

        /* renamed from: a */
        public final y63<Object> f10109a;

        /* renamed from: b */
        public final C2040a f10110b;

        public C2044d(y63<Object> y63, C2040a aVar) {
            this.f10109a = y63;
            this.f10110b = aVar;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.a$e */
    /* compiled from: PropertySerializerMap */
    public static final class C2045e extends C2040a {

        /* renamed from: b */
        public final Class<?> f10111b;

        /* renamed from: c */
        public final y63<Object> f10112c;

        public C2045e(C2040a aVar, Class<?> cls, y63<Object> y63) {
            super(aVar);
            this.f10111b = cls;
            this.f10112c = y63;
        }

        /* renamed from: j */
        public C2040a mo16644j(Class<?> cls, y63<Object> y63) {
            return new C2041a(this, this.f10111b, this.f10112c, cls, y63);
        }

        /* renamed from: k */
        public y63<Object> mo16645k(Class<?> cls) {
            if (cls == this.f10111b) {
                return this.f10112c;
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.a$f */
    /* compiled from: PropertySerializerMap */
    public static final class C2046f {

        /* renamed from: a */
        public final Class<?> f10113a;

        /* renamed from: b */
        public final y63<Object> f10114b;

        public C2046f(Class<?> cls, y63<Object> y63) {
            this.f10113a = cls;
            this.f10114b = y63;
        }
    }

    public C2040a(boolean z) {
        this.f10101a = z;
    }

    /* renamed from: c */
    public static C2040a m14286c() {
        return C2042b.f10106b;
    }

    /* renamed from: d */
    public static C2040a m14287d() {
        return C2042b.f10107c;
    }

    /* renamed from: a */
    public final C2044d mo16637a(JavaType javaType, y63<Object> y63) {
        return new C2044d(y63, mo16644j(javaType.getRawClass(), y63));
    }

    /* renamed from: b */
    public final C2044d mo16638b(Class<?> cls, y63<Object> y63) {
        return new C2044d(y63, mo16644j(cls, y63));
    }

    /* renamed from: e */
    public final C2044d mo16639e(Class<?> cls, zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> findKeySerializer = zw5.findKeySerializer(cls, beanProperty);
        return new C2044d(findKeySerializer, mo16644j(cls, findKeySerializer));
    }

    /* renamed from: f */
    public final C2044d mo16640f(JavaType javaType, zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> findPrimaryPropertySerializer = zw5.findPrimaryPropertySerializer(javaType, beanProperty);
        return new C2044d(findPrimaryPropertySerializer, mo16644j(javaType.getRawClass(), findPrimaryPropertySerializer));
    }

    /* renamed from: g */
    public final C2044d mo16641g(Class<?> cls, zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> findPrimaryPropertySerializer = zw5.findPrimaryPropertySerializer(cls, beanProperty);
        return new C2044d(findPrimaryPropertySerializer, mo16644j(cls, findPrimaryPropertySerializer));
    }

    /* renamed from: h */
    public final C2044d mo16642h(JavaType javaType, zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> findContentValueSerializer = zw5.findContentValueSerializer(javaType, beanProperty);
        return new C2044d(findContentValueSerializer, mo16644j(javaType.getRawClass(), findContentValueSerializer));
    }

    /* renamed from: i */
    public final C2044d mo16643i(Class<?> cls, zw5 zw5, BeanProperty beanProperty) throws JsonMappingException {
        y63<Object> findContentValueSerializer = zw5.findContentValueSerializer(cls, beanProperty);
        return new C2044d(findContentValueSerializer, mo16644j(cls, findContentValueSerializer));
    }

    /* renamed from: j */
    public abstract C2040a mo16644j(Class<?> cls, y63<Object> y63);

    /* renamed from: k */
    public abstract y63<Object> mo16645k(Class<?> cls);

    public C2040a(C2040a aVar) {
        this.f10101a = aVar.f10101a;
    }
}
