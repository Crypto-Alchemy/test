package com.google.common.collect;

import com.google.common.collect.C4623d;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.common.collect.g */
/* compiled from: Serialization */
public final class C4628g {

    /* renamed from: com.google.common.collect.g$b */
    /* compiled from: Serialization */
    public static final class C4630b<T> {

        /* renamed from: a */
        public final Field f25020a;

        /* renamed from: a */
        public void mo35208a(T t, int i) {
            try {
                this.f25020a.set(t, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        /* renamed from: b */
        public void mo35209b(T t, Object obj) {
            try {
                this.f25020a.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        public C4630b(Field field) {
            this.f25020a = field;
            field.setAccessible(true);
        }
    }

    /* renamed from: a */
    public static <T> C4630b<T> m37023a(Class<T> cls, String str) {
        try {
            return new C4630b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public static <E> void m37024b(C4623d<E> dVar, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            dVar.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* renamed from: c */
    public static int m37025c(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* renamed from: d */
    public static <K, V> void m37026d(c04<K, V> c04, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(c04.asMap().size());
        for (Map.Entry next : c04.asMap().entrySet()) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeInt(((Collection) next.getValue()).size());
            for (Object writeObject : (Collection) next.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: e */
    public static <E> void m37027e(C4623d<E> dVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(dVar.entrySet().size());
        for (C4623d.C4624a next : dVar.entrySet()) {
            objectOutputStream.writeObject(next.getElement());
            objectOutputStream.writeInt(next.getCount());
        }
    }
}
