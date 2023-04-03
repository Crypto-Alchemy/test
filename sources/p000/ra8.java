package p000;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_barcode.zzln;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlo;
import com.google.android.gms.internal.mlkit_vision_barcode.zznx;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ra8 */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public final class ra8 {

    /* renamed from: a */
    public static final SparseArray f33385a;

    /* renamed from: b */
    public static final SparseArray f33386b;

    /* renamed from: c */
    public static final AtomicReference f33387c = new AtomicReference();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d */
    public static final Map f33388d;

    static {
        SparseArray sparseArray = new SparseArray();
        f33385a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f33386b = sparseArray2;
        sparseArray.put(-1, zzln.FORMAT_UNKNOWN);
        sparseArray.put(1, zzln.FORMAT_CODE_128);
        sparseArray.put(2, zzln.FORMAT_CODE_39);
        sparseArray.put(4, zzln.FORMAT_CODE_93);
        sparseArray.put(8, zzln.FORMAT_CODABAR);
        sparseArray.put(16, zzln.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzln.FORMAT_EAN_13);
        sparseArray.put(64, zzln.FORMAT_EAN_8);
        sparseArray.put(128, zzln.FORMAT_ITF);
        sparseArray.put(256, zzln.FORMAT_QR_CODE);
        sparseArray.put(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, zzln.FORMAT_UPC_A);
        sparseArray.put(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, zzln.FORMAT_UPC_E);
        sparseArray.put(2048, zzln.FORMAT_PDF417);
        sparseArray.put(4096, zzln.FORMAT_AZTEC);
        sparseArray2.put(0, zzlo.TYPE_UNKNOWN);
        sparseArray2.put(1, zzlo.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzlo.TYPE_EMAIL);
        sparseArray2.put(3, zzlo.TYPE_ISBN);
        sparseArray2.put(4, zzlo.TYPE_PHONE);
        sparseArray2.put(5, zzlo.TYPE_PRODUCT);
        sparseArray2.put(6, zzlo.TYPE_SMS);
        sparseArray2.put(7, zzlo.TYPE_TEXT);
        sparseArray2.put(8, zzlo.TYPE_URL);
        sparseArray2.put(9, zzlo.TYPE_WIFI);
        sparseArray2.put(10, zzlo.TYPE_GEO);
        sparseArray2.put(11, zzlo.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzlo.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f33388d = hashMap;
        hashMap.put(1, zznx.CODE_128);
        hashMap.put(2, zznx.CODE_39);
        hashMap.put(4, zznx.CODE_93);
        hashMap.put(8, zznx.CODABAR);
        hashMap.put(16, zznx.DATA_MATRIX);
        hashMap.put(32, zznx.EAN_13);
        hashMap.put(64, zznx.EAN_8);
        hashMap.put(128, zznx.ITF);
        hashMap.put(256, zznx.QR_CODE);
        hashMap.put(Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN), zznx.UPC_A);
        hashMap.put(Integer.valueOf(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE), zznx.UPC_E);
        hashMap.put(2048, zznx.PDF417);
        hashMap.put(4096, zznx.AZTEC);
    }

    /* renamed from: a */
    public static String m51016a() {
        if (true != m51017b()) {
            return "play-services-mlkit-barcode-scanning";
        }
        return "barcode-scanning";
    }

    /* renamed from: b */
    public static boolean m51017b() {
        AtomicReference atomicReference = f33387c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean a = r69.m50962a(bw3.m32784c().mo29797b());
        atomicReference.set(Boolean.valueOf(a));
        return a;
    }
}
