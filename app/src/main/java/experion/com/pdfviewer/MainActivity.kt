package experion.com.pdfviewer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import android.webkit.MimeTypeMap
import android.widget.Toast
import android.R.attr.path
import com.example.pdfviewerlibrary.PdfViewer
import java.net.URLConnection
import java.net.URLConnection.guessContentTypeFromName


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//create an object of PdfViewer
        var pdfViewer: PdfViewer = PdfViewer(this)
        // call the openFile function by passing the file
        pdfViewer.openFile(Environment.getExternalStoragePublicDirectory("/new/my.txt"))

    }
}


