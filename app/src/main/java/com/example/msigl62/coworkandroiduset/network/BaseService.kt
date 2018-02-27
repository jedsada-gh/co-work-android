package com.example.msigl62.coworkandroiduset.network

import com.example.msigl62.coworkandroiduset.model.Login
import com.example.msigl62.coworkandroiduset.model.Register
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface BaseService {
    @Multipart
    @POST("api/register")
    fun sendRequestVerify(@Part("facebook_id") facebook_id: String?,
                          @Part("name") name: String?,
                          @Part("email") email: String?,
                          @Part("password") password: String?,
                          @Part image: MultipartBody.Part?): Observable<Response<Register>>

    @Multipart
    @POST("")
    fun sendRequestLogin(@Part("facebook_id") facebook_id: String?,
                          @Part("email") email: String?,
                          @Part("password") password: String? ):Observable<Response<Login>>


}