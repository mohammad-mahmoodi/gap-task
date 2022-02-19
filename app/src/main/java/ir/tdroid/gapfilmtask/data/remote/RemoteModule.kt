package ir.tdroid.gapfilmtask.data.remote

import androidx.viewbinding.BuildConfig
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    @Singleton
    fun provideApiService(gson: Gson,okHttpClient: OkHttpClient): ApiService {
        return Retrofit.Builder()
            .baseUrl("'https://core.gapfilm.ir/mobile/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideJson(): Gson {
        return Gson()
    }

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {

        val okBuilder = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.apply { interceptor.level = HttpLoggingInterceptor.Level.BODY }
            okBuilder.addInterceptor(interceptor)
        }

        return okBuilder.build()

    }
}
