package com.google.zxing;

import com.google.zxing.aztec.AztecReader;
import com.google.zxing.datamatrix.DataMatrixReader;
import com.google.zxing.maxicode.MaxiCodeReader;
import com.google.zxing.oned.MultiFormatOneDReader;
import com.google.zxing.pdf417.PDF417Reader;
import com.google.zxing.qrcode.QRCodeReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class MultiFormatReader implements Reader {
    private static final Reader[] EMPTY_READER_ARRAY = new Reader[0];
    private Map<DecodeHintType, ?> hints;
    private Reader[] readers;

    private Result decodeInternal(BinaryBitmap binaryBitmap) throws NotFoundException {
        Reader[] readerArr = this.readers;
        if (readerArr != null) {
            int i = 0;
            int i2 = 0;
            while (i2 < readerArr.length) {
                try {
                    return readerArr[i2].decode(binaryBitmap, this.hints);
                } catch (ReaderException unused) {
                    i2++;
                }
            }
            Map<DecodeHintType, ?> map = this.hints;
            if (map != null && map.containsKey(DecodeHintType.ALSO_INVERTED)) {
                binaryBitmap.getBlackMatrix().flip();
                Reader[] readerArr2 = this.readers;
                while (i < readerArr2.length) {
                    try {
                        return readerArr2[i].decode(binaryBitmap, this.hints);
                    } catch (ReaderException unused2) {
                        i++;
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException {
        setHints((Map<DecodeHintType, ?>) null);
        return decodeInternal(binaryBitmap);
    }

    public Result decodeWithState(BinaryBitmap binaryBitmap) throws NotFoundException {
        if (this.readers == null) {
            setHints((Map<DecodeHintType, ?>) null);
        }
        return decodeInternal(binaryBitmap);
    }

    public void reset() {
        Reader[] readerArr = this.readers;
        if (readerArr != null) {
            for (Reader reset : readerArr) {
                reset.reset();
            }
        }
    }

    public void setHints(Map<DecodeHintType, ?> map) {
        boolean z;
        Collection collection;
        this.hints = map;
        boolean z2 = true;
        if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new QRCodeReader());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new DataMatrixReader());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new AztecReader());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new PDF417Reader());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new MaxiCodeReader());
            }
            if (z2 && z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
            arrayList.add(new QRCodeReader());
            arrayList.add(new DataMatrixReader());
            arrayList.add(new AztecReader());
            arrayList.add(new PDF417Reader());
            arrayList.add(new MaxiCodeReader());
            if (z) {
                arrayList.add(new MultiFormatOneDReader(map));
            }
        }
        this.readers = (Reader[]) arrayList.toArray(EMPTY_READER_ARRAY);
    }

    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        setHints(map);
        return decodeInternal(binaryBitmap);
    }
}
