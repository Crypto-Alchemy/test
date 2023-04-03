package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.collect.Multisets;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Multimaps {

    public static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        public transient rd6<? extends List<V>> factory;

        public CustomListMultimap(Map<K, Collection<V>> map, rd6<? extends List<V>> rd6) {
            super(map);
            this.factory = (rd6) du4.m43691k(rd6);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (rd6) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        public Map<K, Collection<V>> createAsMap() {
            return createMaybeNavigableAsMap();
        }

        public Set<K> createKeySet() {
            return createMaybeNavigableKeySet();
        }

        public List<V> createCollection() {
            return (List) this.factory.get();
        }
    }

    /* renamed from: com.google.common.collect.Multimaps$a */
    public static abstract class C4602a<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        public void clear() {
            mo35061e().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo35061e().containsEntry(entry.getKey(), entry.getValue());
        }

        /* renamed from: e */
        public abstract c04<K, V> mo35061e();

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo35061e().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return mo35061e().size();
        }
    }

    /* renamed from: com.google.common.collect.Multimaps$b */
    public static class C4603b<K, V> extends C4618b<K> {
        @Weak

        /* renamed from: e */
        public final c04<K, V> f24965e;

        /* renamed from: com.google.common.collect.Multimaps$b$a */
        public class C4604a extends rw6<Map.Entry<K, Collection<V>>, C4623d.C4624a<K>> {

            /* renamed from: com.google.common.collect.Multimaps$b$a$a */
            public class C4605a extends Multisets.C4606a<K> {

                /* renamed from: a */
                public final /* synthetic */ Map.Entry f24966a;

                public C4605a(C4604a aVar, Map.Entry entry) {
                    this.f24966a = entry;
                }

                public int getCount() {
                    return ((Collection) this.f24966a.getValue()).size();
                }

                public K getElement() {
                    return this.f24966a.getKey();
                }
            }

            public C4604a(C4603b bVar, Iterator it) {
                super(it);
            }

            /* renamed from: b */
            public C4623d.C4624a<K> mo35031a(Map.Entry<K, Collection<V>> entry) {
                return new C4605a(this, entry);
            }
        }

        public C4603b(c04<K, V> c04) {
            this.f24965e = c04;
        }

        public void clear() {
            this.f24965e.clear();
        }

        public boolean contains(Object obj) {
            return this.f24965e.containsKey(obj);
        }

        public int count(Object obj) {
            Collection collection = (Collection) Maps.m36931l(this.f24965e.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        public int distinctElements() {
            return this.f24965e.asMap().size();
        }

        public Iterator<K> elementIterator() {
            throw new AssertionError("should never be called");
        }

        public Set<K> elementSet() {
            return this.f24965e.keySet();
        }

        public Iterator<C4623d.C4624a<K>> entryIterator() {
            return new C4604a(this, this.f24965e.asMap().entrySet().iterator());
        }

        public Iterator<K> iterator() {
            return Maps.m36927h(this.f24965e.entries().iterator());
        }

        public int remove(Object obj, int i) {
            ki0.m47100b(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.m36931l(this.f24965e.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        public int size() {
            return this.f24965e.size();
        }
    }

    /* renamed from: a */
    public static boolean m36957a(c04<?, ?> c04, Object obj) {
        if (obj == c04) {
            return true;
        }
        if (obj instanceof c04) {
            return c04.asMap().equals(((c04) obj).asMap());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> zh3<K, V> m36958b(Map<K, Collection<V>> map, rd6<? extends List<V>> rd6) {
        return new CustomListMultimap(map, rd6);
    }
}
