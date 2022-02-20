package ir.tdroid.gapfilmtask.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ir.tdroid.gapfilmtask.data.db.entity.DbContent

@Dao
interface ContentDao {

    @Query("SELECT * FROM content")
    fun getContens(): LiveData<List<DbContent>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(contents: List<DbContent>)


}