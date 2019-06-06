package com.example.pdfviewerlibrary

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.MimeTypeMap
import org.jetbrains.anko.toast
import java.io.File

//class to  open a pdf file
class PdfViewer(context: Context) {
    private val mimetype = "application/pdf"
    private var context: Context

    init {
        this.context = context

    }

    //function which takes file as the paramete
    //it check weather the file is in pdf format or not and will take the necessary action
    fun openFile(filePath: File) {

        val extension: String = MimeTypeMap.getFileExtensionFromUrl(filePath.toString())
        if (extension == "pdf") {
            val textIntent = Intent(Intent.ACTION_VIEW)
            textIntent.setDataAndType(Uri.fromFile(filePath), mimetype)
            val intentChooser = Intent.createChooser(textIntent, "Choose Text Application")
            context.startActivity(intentChooser)
        } else {
            context.toast("this file format dosent support")
        }


    }
}