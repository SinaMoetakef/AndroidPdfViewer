package com.github.barteksc.pdfviewer.listener;

import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;

import java.util.List;

/**
 * Created by smoetakef on 2017-07-28.
 */

public interface OnDecodeAsyncTaskCompleteListener {
    void onDecodeTaskLoadComplete(List<PdfDocument> pdfDocuments, PdfiumCore pdfiumCore);
    void onDecodeTaskLoadError(Throwable throwable);
}
