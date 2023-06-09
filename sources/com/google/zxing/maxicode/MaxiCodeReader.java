package com.google.zxing.maxicode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.maxicode.decoder.Decoder;
import java.util.Map;

public final class MaxiCodeReader implements Reader {
    private static final int MATRIX_HEIGHT = 33;
    private static final int MATRIX_WIDTH = 30;
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) throws NotFoundException {
        int[] enclosingRectangle = bitMatrix.getEnclosingRectangle();
        if (enclosingRectangle != null) {
            int i = enclosingRectangle[0];
            int i2 = enclosingRectangle[1];
            int i3 = enclosingRectangle[2];
            int i4 = enclosingRectangle[3];
            BitMatrix bitMatrix2 = new BitMatrix(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int min = Math.min((((i5 * i4) + (i4 / 2)) / 33) + i2, i4 - 1);
                for (int i6 = 0; i6 < 30; i6++) {
                    if (bitMatrix.get(Math.min((((i6 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30, i3 - 1) + i, min)) {
                        bitMatrix2.set(i6, i5);
                    }
                }
            }
            return bitMatrix2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, (Map<DecodeHintType, ?>) null);
    }

    public void reset() {
    }

    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        DecoderResult decode = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()), map);
        Result result = new Result(decode.getText(), decode.getRawBytes(), NO_POINTS, BarcodeFormat.MAXICODE);
        String eCLevel = decode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result;
    }
}
