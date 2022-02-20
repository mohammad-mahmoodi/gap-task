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


    @Query("SELECT * FROM content where isFavourite = 1 and ContentID = :id")
    fun isFavoriteContents(id:Int): LiveData<List<DbContent>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(contents: List<DbContent>)

    @Update()
    suspend fun update(content:DbContent)

    @Query("update content set isFavourite = case isFavourite when 1 then 0 else 1 end where ContentID = :id  ")
    suspend fun toggleFavoriteContents(id : Int)


}