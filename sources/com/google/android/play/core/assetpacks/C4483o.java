package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.play.core.assetpacks.o */
public final class C4483o {

    /* renamed from: a */
    public static final Pattern f24771a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    public static List<File> m36469a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(tu7.f34391a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new C4470bj("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    vu7 a = new C4473e(fileInputStream).mo34190a();
                    if (a.mo48830d() != null) {
                        File file5 = new File(file, a.mo48830d());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new C4470bj(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new C4470bj("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    mt7.m48481a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
