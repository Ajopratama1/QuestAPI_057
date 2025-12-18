package com.example.pam_18desember.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pam_18desember.repositori.AplikasiDataSiswa
import com.example.pam_18desember.viewmodel.EntryViewModel
import com.example.pam_18desember.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container
            .repositoryDataSiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container
            .repositoryDataSiswa) }
    }
}