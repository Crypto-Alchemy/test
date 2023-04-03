package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.C4485a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: bu7 */
public final class bu7 implements yw7 {

    /* renamed from: h */
    public static final pq7 f21473h = new pq7("FakeAssetPackService");

    /* renamed from: i */
    public static final AtomicInteger f21474i = new AtomicInteger(1);

    /* renamed from: a */
    public final String f21475a;

    /* renamed from: b */
    public final hr7 f21476b;

    /* renamed from: c */
    public final rs7 f21477c;

    /* renamed from: d */
    public final Context f21478d;

    /* renamed from: e */
    public final lu7 f21479e;

    /* renamed from: f */
    public final rt7<Executor> f21480f;

    /* renamed from: g */
    public final Handler f21481g = new Handler(Looper.getMainLooper());

    public bu7(File file, hr7 hr7, rs7 rs7, Context context, lu7 lu7, rt7<Executor> rt7) {
        this.f21475a = file.getAbsolutePath();
        this.f21476b = hr7;
        this.f21477c = rs7;
        this.f21478d = context;
        this.f21479e = lu7;
        this.f21480f = rt7;
    }

    /* renamed from: h */
    public static long m32728h(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: l */
    public static String m32729l(File file) throws LocalTestingException {
        try {
            return cu7.m43229a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: a */
    public final void mo29741a() {
        f21473h.mo46855d("keepAlive", new Object[0]);
    }

    /* renamed from: b */
    public final void mo29742b(int i) {
        f21473h.mo46855d("notifySessionFailed", new Object[0]);
    }

    /* renamed from: c */
    public final void mo29743c(int i, String str, String str2, int i2) {
        f21473h.mo46855d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: d */
    public final void mo29744d(int i, String str) {
        f21473h.mo46855d("notifyModuleCompleted", new Object[0]);
        this.f21480f.mo47486a().execute(new yt7(this, i, str));
    }

    /* renamed from: e */
    public final ul6<List<String>> mo29745e(Map<String, Long> map) {
        f21473h.mo46855d("syncPacks()", new Object[0]);
        return im6.m45799a(new ArrayList());
    }

    /* renamed from: f */
    public final ul6<ParcelFileDescriptor> mo29746f(int i, String str, String str2, int i2) {
        f21473h.mo46855d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        nv7 nv7 = new nv7();
        try {
            for (File file : mo29750k(str)) {
                if (rr7.m51233b(file).equals(str2)) {
                    nv7.mo46235a(ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY));
                    return nv7.mo46237c();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f21473h.mo46856e("getChunkFileDescriptor failed", e);
            nv7.mo46236b(new LocalTestingException("Asset Slice file not found.", e));
        } catch (LocalTestingException e2) {
            f21473h.mo46856e("getChunkFileDescriptor failed", e2);
            nv7.mo46236b(e2);
        }
    }

    /* renamed from: g */
    public final void mo29747g(List<String> list) {
        f21473h.mo46855d("cancelDownload(%s)", list);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo29748i(Intent intent) {
        this.f21476b.mo43369a(this.f21478d, intent);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo29749j(int i, String str) {
        try {
            mo29751m(i, str, 4);
        } catch (LocalTestingException e) {
            f21473h.mo46856e("notifyModuleCompleted failed", e);
        }
    }

    /* renamed from: k */
    public final File[] mo29750k(String str) throws LocalTestingException {
        File file = new File(this.f21475a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new zt7(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File b : listFiles) {
                        if (rr7.m51233b(b).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: m */
    public final void mo29751m(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f21479e.mo45535a());
        bundle.putInt("session_id", i);
        File[] k = mo29750k(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : k) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String b = rr7.m51233b(file);
            bundle.putParcelableArrayList(C4485a.m36485f("chunk_intents", str, b), arrayList2);
            bundle.putString(C4485a.m36485f("uncompressed_hash_sha256", str, b), m32729l(file));
            bundle.putLong(C4485a.m36485f("uncompressed_size", str, b), file.length());
            arrayList.add(b);
        }
        bundle.putStringArrayList(C4485a.m36484e("slice_ids", str), arrayList);
        bundle.putLong(C4485a.m36484e("pack_version", str), (long) this.f21479e.mo45535a());
        bundle.putInt(C4485a.m36484e("status", str), i2);
        bundle.putInt(C4485a.m36484e("error_code", str), 0);
        bundle.putLong(C4485a.m36484e("bytes_downloaded", str), m32728h(i2, j));
        bundle.putLong(C4485a.m36484e("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m32728h(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f21481g.post(new au7(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }
}
