package ir.tdroid.gapfilmtask.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.tdroid.gapfilmtask.data.db.dao.ContentDao
import ir.tdroid.gapfilmtask.data.db.entity.DbContent

@Database(
    entities = [DbContent::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getContentDao() : ContentDao
}