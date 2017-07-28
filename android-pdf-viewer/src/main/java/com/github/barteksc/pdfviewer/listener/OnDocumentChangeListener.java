package com.github.barteksc.pdfviewer.listener;

/**
 * Created by smoetakef on 2017-07-28.
 */

public interface OnDocumentChangeListener {

    /**
     * Called when the document changes in the PDFView
     *
     * @param documentIndex  The index of new document shown
     */
    void onDocumentChange(int documentIndex);
}
