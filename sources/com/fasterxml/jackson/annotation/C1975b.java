package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fasterxml.jackson.annotation.b */
/* compiled from: SimpleObjectIdResolver */
public class C1975b implements C1974a {

    /* renamed from: a */
    public Map<ObjectIdGenerator.IdKey, Object> f9807a;

    /* renamed from: a */
    public void mo13687a(ObjectIdGenerator.IdKey idKey, Object obj) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.f9807a;
        if (map == null) {
            this.f9807a = new HashMap();
        } else {
            Object obj2 = map.get(idKey);
            if (obj2 != null) {
                if (obj2 != obj) {
                    throw new IllegalStateException("Already had POJO for id (" + idKey.key.getClass().getName() + ") [" + idKey + "]");
                }
                return;
            }
        }
        this.f9807a.put(idKey, obj);
    }

    /* renamed from: b */
    public boolean mo13688b(C1974a aVar) {
        if (aVar.getClass() == getClass()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public Object mo13689c(ObjectIdGenerator.IdKey idKey) {
        Map<ObjectIdGenerator.IdKey, Object> map = this.f9807a;
        if (map == null) {
            return null;
        }
        return map.get(idKey);
    }

    /* renamed from: d */
    public C1974a mo13690d(Object obj) {
        return new C1975b();
    }
}
