package com.example.pam_18desember.repositori

import com.example.pam_18desember.apiservice.ServiceApiSiswa
import com.example.pam_18desember.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
    // suspend fun getSatuSiswa(id: Int) : DataSiswa
    // suspend fun editSatuSiswa(
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa
        .getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2
    .Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}