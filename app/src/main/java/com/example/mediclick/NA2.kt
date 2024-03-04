package com.example.mediclick

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.ActivityResultLauncher

class NA2 : NutritionalAnalysis() {

private val PICK_FILE = 1001 // Update the request code

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nutrition_analysis)

        val browseButton: Button = findViewById(R.id.browseButton)
        browseButton.setOnClickListener { openGalleryForFiles() }
        }

private fun openGalleryForFiles() {
        val galleryIntent = Intent(Intent.ACTION_GET_CONTENT)
        galleryIntent.type = "*/*" // Set the MIME type to allow any file type
        resultLauncher.launch(galleryIntent)
        }

private val resultLauncher: ActivityResultLauncher<Intent> =
        registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
        ) { result ->
        if (result.resultCode == RESULT_OK) {
        val data: Intent? = result.data
        data?.let {
        val selectedFileUri: Uri? = it.data
        // Do something with the selected file URI
        selectedFileUri?.let { handleSelectedFile(it) }
        }
        }
        }

private fun handleSelectedFile(fileUri: Uri) {
        // Implement your logic to handle the selected file here
        // For example, you might want to display the file name or perform further actions
        }
        }
