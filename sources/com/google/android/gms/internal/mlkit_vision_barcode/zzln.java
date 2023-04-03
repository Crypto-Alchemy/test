package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public enum zzln {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(128),
    FORMAT_QR_CODE(256),
    FORMAT_UPC_A(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN),
    FORMAT_UPC_E(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE),
    FORMAT_PDF417(2048),
    FORMAT_AZTEC(4096);
    
    private final int zzp;

    /* access modifiers changed from: public */
    zzln(int i) {
        this.zzp = i;
    }

    public final int zza() {
        return this.zzp;
    }
}
