package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.c */
public final class C4471c extends ws7 {

    /* renamed from: a */
    public final File f24714a;

    /* renamed from: d */
    public final File f24715d;

    /* renamed from: e */
    public final NavigableMap<Long, File> f24716e = new TreeMap();

    public C4471c(File file, File file2) throws IOException {
        this.f24714a = file;
        this.f24715d = file2;
        List<File> a = C4483o.m36469a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File next : a) {
                this.f24716e.put(Long.valueOf(j), next);
                j += next.length();
            }
            return;
        }
        throw new C4470bj(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: a */
    public final long mo34185a() {
        Map.Entry<Long, File> lastEntry = this.f24716e.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* renamed from: b */
    public final InputStream mo34186b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C4470bj(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo34185a()) {
            Long floorKey = this.f24716e.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f24716e.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new nr7(mo34188d(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo34188d(j, floorKey));
            Collection<File> values = this.f24716e.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new du7(Collections.enumeration(values)));
            }
            arrayList.add(new nr7(new FileInputStream(this.f24716e.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C4470bj(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo34185a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }

    /* renamed from: d */
    public final InputStream mo34188d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f24716e.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C4470bj(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }
}
