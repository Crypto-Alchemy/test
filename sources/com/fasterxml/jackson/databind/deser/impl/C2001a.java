package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.fasterxml.jackson.databind.deser.impl.a */
/* compiled from: ReadableObjectId */
public class C2001a {

    /* renamed from: a */
    public Object f9945a;

    /* renamed from: b */
    public final ObjectIdGenerator.IdKey f9946b;

    /* renamed from: c */
    public LinkedList<C2002a> f9947c;

    /* renamed from: d */
    public C1974a f9948d;

    public C2001a(ObjectIdGenerator.IdKey idKey) {
        this.f9946b = idKey;
    }

    /* renamed from: a */
    public void mo15609a(C2002a aVar) {
        if (this.f9947c == null) {
            this.f9947c = new LinkedList<>();
        }
        this.f9947c.add(aVar);
    }

    /* renamed from: b */
    public void mo15610b(Object obj) throws IOException {
        this.f9948d.mo13687a(this.f9946b, obj);
        this.f9945a = obj;
        Object obj2 = this.f9946b.key;
        LinkedList<C2002a> linkedList = this.f9947c;
        if (linkedList != null) {
            Iterator<C2002a> it = linkedList.iterator();
            this.f9947c = null;
            while (it.hasNext()) {
                it.next().mo15344c(obj2, obj);
            }
        }
    }

    /* renamed from: c */
    public ObjectIdGenerator.IdKey mo15611c() {
        return this.f9946b;
    }

    /* renamed from: d */
    public boolean mo15612d() {
        LinkedList<C2002a> linkedList = this.f9947c;
        if (linkedList == null || linkedList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public Iterator<C2002a> mo15613e() {
        LinkedList<C2002a> linkedList = this.f9947c;
        if (linkedList == null) {
            return Collections.emptyList().iterator();
        }
        return linkedList.iterator();
    }

    /* renamed from: f */
    public Object mo15614f() {
        Object c = this.f9948d.mo13689c(this.f9946b);
        this.f9945a = c;
        return c;
    }

    /* renamed from: g */
    public void mo15615g(C1974a aVar) {
        this.f9948d = aVar;
    }

    /* renamed from: h */
    public boolean mo15616h(DeserializationContext deserializationContext) {
        return false;
    }

    public String toString() {
        return String.valueOf(this.f9946b);
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.impl.a$a */
    /* compiled from: ReadableObjectId */
    public static abstract class C2002a {

        /* renamed from: a */
        public final UnresolvedForwardReference f9949a;

        /* renamed from: b */
        public final Class<?> f9950b;

        public C2002a(UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            this.f9949a = unresolvedForwardReference;
            this.f9950b = cls;
        }

        /* renamed from: a */
        public Class<?> mo15618a() {
            return this.f9950b;
        }

        /* renamed from: b */
        public JsonLocation mo15619b() {
            return this.f9949a.getLocation();
        }

        /* renamed from: c */
        public abstract void mo15344c(Object obj, Object obj2) throws IOException;

        /* renamed from: d */
        public boolean mo15620d(Object obj) {
            return obj.equals(this.f9949a.getUnresolvedId());
        }

        public C2002a(UnresolvedForwardReference unresolvedForwardReference, JavaType javaType) {
            this.f9949a = unresolvedForwardReference;
            this.f9950b = javaType.getRawClass();
        }
    }
}
