package ir.tdroid.gapfilmtask.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import ir.tdroid.gapfilmtask.data.db.entity.DbContent

@Dao
interface ContentDao {

    @Query("SELECT * FROM content")
    fun getContents(): LiveData<List<DbContent>>


    @Query("SELECT * FROM content where isFavourite = 1 ")
    fun getFavoriteContents(): LiveData<List<DbContent>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(contents: List<DbContent>)

    @Update()
    suspend fun update(content:DbContent)


}