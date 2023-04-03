package com.google.mlkit.vision.common.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.mlkit.vision.common.internal.a */
/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
public class C4914a {

    /* renamed from: a */
    public final Map f25516a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a */
    /* compiled from: com.google.mlkit:vision-common@@17.2.0 */
    public static class C4915a {

        /* renamed from: a */
        public final Class f25517a;

        /* renamed from: b */
        public final ly4 f25518b;

        /* renamed from: c */
        public final int f25519c;

        /* renamed from: a */
        public final int mo36740a() {
            return this.f25519c;
        }

        /* renamed from: b */
        public final ly4 mo36741b() {
            return this.f25518b;
        }

        /* renamed from: c */
        public final Class mo36742c() {
            return this.f25517a;
        }
    }

    public C4914a(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C4915a aVar = (C4915a) it.next();
            Class c = aVar.mo36742c();
            if (!this.f25516a.containsKey(c) || aVar.mo36740a() >= ((Integer) cu4.m43221k((Integer) hashMap.get(c))).intValue()) {
                this.f25516a.put(c, aVar.mo36741b());
                hashMap.put(c, Integer.valueOf(aVar.mo36740a()));
            }
        }
    }
}
